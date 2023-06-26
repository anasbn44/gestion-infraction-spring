package ma.enset.immatriculationservice.services;

import ma.enset.immatriculationservice.dto.VehiculeRequestDto;
import ma.enset.immatriculationservice.dto.VehiculeResponseDto;
import ma.enset.immatriculationservice.entities.Vehicule;

import java.util.List;

public interface VehiculeService {
    List<Vehicule> getAllVehicules();
    Vehicule getVehiculeById (Long id);
    Vehicule saveVehicule (VehiculeRequestDto vehiculeRequest);
    Vehicule updateVehicule (Long id, VehiculeRequestDto vehiculeRequest);
    void deleteVehicule (Long id);
    VehiculeResponseDto getVehiculeByMatricule(String matricule);
}
