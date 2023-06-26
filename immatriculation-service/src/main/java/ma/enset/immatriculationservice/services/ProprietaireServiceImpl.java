package ma.enset.immatriculationservice.services;

import lombok.AllArgsConstructor;
import ma.enset.immatriculationservice.dto.ProprietaireRequestDto;
import ma.enset.immatriculationservice.dto.ProprietaireResponseDto;
import ma.enset.immatriculationservice.entities.Proprietaire;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.mappers.ProprietaireMapper;
import ma.enset.immatriculationservice.repositories.PropretaireRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class ProprietaireServiceImpl implements ProprietaireService {
    private PropretaireRepository propretaireRepository;
    private ProprietaireMapper mappers;

    @Override
    public List<ProprietaireResponseDto> getAllProprietaires() {
        List<Proprietaire> proprietaires = propretaireRepository.findAll();
        return proprietaires.stream().map(mappers::from).collect(Collectors.toList());
    }

    @Override
    public ProprietaireResponseDto getProprietaireById(Long id) {
        Proprietaire owner = propretaireRepository.findById(id).orElse(null);
        if (owner == null) throw new RuntimeException(String.format("Owner by Id : %d is not found", id));
        return mappers.from(owner);
    }

    @Override
    public ProprietaireResponseDto saveProprietaire(ProprietaireRequestDto ownerRequest) {
        Proprietaire owner = mappers.to(ownerRequest);
        return mappers.from(propretaireRepository.save(owner));
    }

    @Override
    public ProprietaireResponseDto updateProprietaire(Long id, ProprietaireRequestDto ownerRequest) {
        ProprietaireResponseDto owner = getProprietaireById(id);
        if(!owner.getNom().equals(ownerRequest.getNom())){
            owner.setNom(ownerRequest.getNom());
        }
        if (!owner.getEmail().equals(ownerRequest.getEmail())){
            owner.setEmail(ownerRequest.getEmail());
        }
        if (!owner.getDateDeNaissance().equals(ownerRequest.getDateDeNaissance())){
            owner.setDateDeNaissance(ownerRequest.getDateDeNaissance());
        }
        Proprietaire proprietaire = mappers.fromResponse(owner);
        return mappers.from(propretaireRepository.save(proprietaire));
    }

    @Override
    public void deleteProprietaire(Long id) {
        propretaireRepository.deleteById(id);
    }

    @Override
    public ProprietaireResponseDto addVehicule(Long id, Vehicule vehicule) {
        Proprietaire proprietaire = propretaireRepository.findById(id).orElse(null);
        if (proprietaire == null) throw new RuntimeException(String.format("Owner by Id : %d is not found", id));
        else {
            List<Vehicule> vehicules = proprietaire.getVehicules();
            if (vehicule == null){
                List<Vehicule> vehiculeList = new ArrayList<>();
                vehiculeList.add(vehicule);
                proprietaire.setVehicules(vehiculeList);
            }else {
                vehicules.add(vehicule);
                proprietaire.setVehicules(vehicules);
            }
        }
        return mappers.from(proprietaire);
    }
}
