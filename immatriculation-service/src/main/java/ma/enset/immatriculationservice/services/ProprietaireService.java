package ma.enset.immatriculationservice.services;


import ma.enset.immatriculationservice.dto.ProprietaireRequestDto;
import ma.enset.immatriculationservice.dto.ProprietaireResponseDto;
import ma.enset.immatriculationservice.entities.Proprietaire;
import ma.enset.immatriculationservice.entities.Vehicule;

import java.util.List;

public interface ProprietaireService {
    List<ProprietaireResponseDto> getAllProprietaires();
    ProprietaireResponseDto getProprietaireById (Long id);
    ProprietaireResponseDto saveProprietaire (ProprietaireRequestDto proprietaireRequestDto);
    ProprietaireResponseDto updateProprietaire (Long id, ProprietaireRequestDto proprietaireRequestDto);
    void deleteProprietaire (Long id);
    ProprietaireResponseDto addVehicule(Long id, Vehicule vehicule);
}
