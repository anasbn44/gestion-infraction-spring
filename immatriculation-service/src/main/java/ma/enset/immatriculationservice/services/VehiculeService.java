package ma.enset.immatriculationservice.services;

import ma.enset.immatriculationservice.dto.ProprietaireResponseDto;
import ma.enset.immatriculationservice.dto.VehiculeRequestDto;
import ma.enset.immatriculationservice.dto.VehiculeResponseDto;
import ma.enset.immatriculationservice.entities.Vehicule;

import java.util.List;

public interface VehiculeService {
    List<VehiculeResponseDto> getAllVehicules();
    VehiculeResponseDto getVehiculeById (Long id);
    VehiculeResponseDto saveVehicule (VehiculeRequestDto vehiculeRequest);
    VehiculeResponseDto updateVehicule (Long id, VehiculeRequestDto vehiculeRequest);
    void deleteVehicule (Long id);
    VehiculeResponseDto getVehiculeByMatricule(String matricule);
    ProprietaireResponseDto getProprietaireOfVehicule(Long id);
}
