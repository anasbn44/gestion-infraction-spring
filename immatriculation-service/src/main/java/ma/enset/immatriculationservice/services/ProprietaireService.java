package ma.enset.immatriculationservice.services;


import ma.enset.immatriculationservice.dto.ProprietaireRequestDto;
import ma.enset.immatriculationservice.entities.Proprietaire;
import ma.enset.immatriculationservice.entities.Vehicule;

import java.util.List;

public interface ProprietaireService {
    List<Proprietaire> getAllProprietaires();
    Proprietaire getProprietaireById (Long id);
    Proprietaire saveProprietaire (ProprietaireRequestDto proprietaireRequestDto);
    Proprietaire updateProprietaire (Long id, ProprietaireRequestDto proprietaireRequestDto);
    void deleteProprietaire (Long id);
    Proprietaire addVehicule(Long id, Vehicule vehicule);
}
