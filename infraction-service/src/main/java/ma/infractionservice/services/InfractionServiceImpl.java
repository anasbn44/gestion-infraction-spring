package ma.infractionservice.services;

import lombok.AllArgsConstructor;
import ma.infractionservice.dto.InfractionRequest;
import ma.infractionservice.entities.Infraction;
import ma.infractionservice.mappers.InfractionMappers;
import ma.infractionservice.repositories.InfractionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Service
@Transactional
@AllArgsConstructor
public class InfractionServiceImpl implements InfractionService{
    private InfractionRepository infractionRepository;
    private InfractionMappers infractionMappers;
    @Override
    public List<Infraction> getAllInfractions() {
        return infractionRepository.findAll();
    }

    @Override
    public Infraction getInfractionById(Long id) {
        Infraction infraction = infractionRepository.findById(id).orElse(null);
        if (infraction == null) throw new RuntimeException(String.format("infraction by id %d not found", id));
        return infraction;
    }

    @Override
    public Infraction saveInfraction(InfractionRequest infractionRequest) {
        Infraction infraction = infractionMappers.fromRequest(infractionRequest);
        infraction.setDate(new Date());
        infraction.setMontant(calculMontant(infractionRequest.getVitesseMax(), infraction.getVitesseVehicule()));
        return infractionRepository.save(infraction);
    }

    @Override
    public Infraction updateInfraction(Long id, InfractionRequest infractionRequest) {
        Infraction infraction = infractionRepository.findById(id).orElseThrow();
        if(infraction.getVitesseMax() != infraction.getVitesseMax())
            infraction.setVitesseMax(infractionRequest.getVitesseMax());
        if(infraction.getNuneroRadar() != infractionRequest.getNuneroRadar())
            infraction.setNuneroRadar(infractionRequest.getNuneroRadar());
        if(infraction.getMatriculeVehicule().equals(infractionRequest.getMatriculeVehicule()))
            infraction.setMatriculeVehicule(infractionRequest.getMatriculeVehicule());
        return infraction;
    }

    @Override
    public void deleteInfraction(Long id) {
        infractionRepository.deleteById(id);
    }

    private double calculMontant(double vitesseMax, double vitesseVehicule){
        double montant;
        double diff = vitesseVehicule - vitesseMax;
        if (diff <= 20)
            montant = 150;
        else if (diff <= 30)
            montant = 300;
        else
            montant = 500;
        return montant;
    }
}
