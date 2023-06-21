package ma.enset.immatriculationservice.services;

import lombok.AllArgsConstructor;
import ma.enset.immatriculationservice.dto.ProprietaireRequestDto;
import ma.enset.immatriculationservice.entities.Proprietaire;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.mappers.ProprietaireMapper;
import ma.enset.immatriculationservice.repositories.PropretaireRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ProprietaireServiceImpl implements ProprietaireService {
    private PropretaireRepository propretaireRepository;
    private ProprietaireMapper mappers;

    @Override
    public List<Proprietaire> getAllProprietaires() {
        return propretaireRepository.findAll();
    }

    @Override
    public Proprietaire getProprietaireById(Long id) {
        Proprietaire owner = propretaireRepository.findById(id).orElse(null);
        if (owner == null) throw new RuntimeException(String.format("Owner by Id : %d is not found", id));
        return owner;
    }

    @Override
    public Proprietaire saveProprietaire(ProprietaireRequestDto ownerRequest) {
        Proprietaire owner = mappers.to(ownerRequest);
        return propretaireRepository.save(owner);
    }

    @Override
    public Proprietaire updateProprietaire(Long id, ProprietaireRequestDto ownerRequest) {
        Proprietaire owner = getProprietaireById(id);
        if(!owner.getNom().equals(ownerRequest.getNom())){
            owner.setNom(ownerRequest.getNom());
        }
        if (!owner.getEmail().equals(ownerRequest.getEmail())){
            owner.setEmail(ownerRequest.getEmail());
        }
        if (!owner.getDateDeNaissance().equals(ownerRequest.getDateDeNaissance())){
            owner.setDateDeNaissance(ownerRequest.getDateDeNaissance());
        }
        return propretaireRepository.save(owner);
    }

    @Override
    public void deleteProprietaire(Long id) {
        propretaireRepository.deleteById(id);
    }

    @Override
    public Proprietaire addVehicule(Long id, Vehicule vehicule) {
        Proprietaire proprietaire = getProprietaireById(id);
        List<Vehicule> vehicules = proprietaire.getVehicules();
        if (vehicule == null){
            List<Vehicule> vehiculeList = new ArrayList<>();
            vehiculeList.add(vehicule);
            proprietaire.setVehicules(vehiculeList);
        }else {
            vehicules.add(vehicule);
            proprietaire.setVehicules(vehicules);
        }
        return proprietaire;
    }
}
