package ma.radarservice.services;

import lombok.AllArgsConstructor;
import ma.radarservice.dto.InfractionRequest;
import ma.radarservice.entities.Infraction;
import ma.radarservice.entities.Proprietaire;
import ma.radarservice.entities.Radar;
import ma.radarservice.feign.InfractionRestClient;
import ma.radarservice.feign.VehiculeRestClient;
import ma.radarservice.repository.RadarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
@AllArgsConstructor
public class RadarServiceImpl implements RadarService{
    private InfractionRestClient infractionRestClient;
    private VehiculeRestClient vehiculeRestClient;
    private RadarRepository radarRepository;

    @Override
    public Infraction newInfraction(InfractionRequest infractionRequest) {
        Radar radar = radarRepository.findById(infractionRequest.getRadarId()).get();
        double difference = infractionRequest.getVitesseVehicul() - radar.getVitesseMax();
        double montant = 0;
        if(difference < 20)
            montant = 150;
        else if (difference < 30)
            montant = 300;
        else
            montant = 400;

        Infraction infraction = Infraction.builder()
                .matriculeVehicule(infractionRequest.getMatricule())
                .numeroRadar(radar.getId())
                .date(new Date())
                .vitesseMax(radar.getVitesseMax())
                .vitesseVehicule(infractionRequest.getVitesseVehicul())
                .montant(montant)
                .build();

        return infractionRestClient.saveInfraction(infraction);
    }

    @Override
    public Proprietaire proprietaireByMatricule(String matricule) {
        return vehiculeRestClient.getVehiculeByMatricule(matricule).getProprietaire();
    }


}
