package ma.enset.immatriculationservice.services;

import lombok.AllArgsConstructor;
import ma.enset.immatriculationservice.dto.ProprietaireResponseDto;
import ma.enset.immatriculationservice.dto.VehiculeRequestDto;
import ma.enset.immatriculationservice.dto.VehiculeResponseDto;
import ma.enset.immatriculationservice.entities.Proprietaire;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.mappers.ProprietaireMapper;
import ma.enset.immatriculationservice.mappers.VehiculeMapper;
import ma.enset.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class VehiculeServiceImpl implements VehiculeService {
    private VehiculeRepository vehiculeRepository;
    private VehiculeMapper mappers;
    private ProprietaireMapper proprietaireMapper;
    @Override
    public List<VehiculeResponseDto> getAllVehicules() {
        List<Vehicule> vehicules = vehiculeRepository.findAll();
        return vehicules.stream().map(mappers::from).collect(Collectors.toList());
    }

    @Override
    public VehiculeResponseDto getVehiculeById(Long id) {
        Vehicule vehicule = vehiculeRepository.findById(id).orElse(null);
        if (vehicule == null) throw new RuntimeException(String.format("Vehicule by id %dnot found", id));
        return mappers.from(vehicule);
    }

    @Override
    public VehiculeResponseDto saveVehicule(VehiculeRequestDto vehiculeRequest) {
        Vehicule vehicule = mappers.to(vehiculeRequest);
        Vehicule response = vehiculeRepository.save(vehicule);
        return mappers.from(response);
    }

    @Override
    public VehiculeResponseDto updateVehicule(Long id, VehiculeRequestDto vehiculeRequest) {
        Vehicule vehicule = vehiculeRepository.findById(id).orElse(null);
        if (vehicule == null) throw new RuntimeException(String.format("Vehicule by id %dnot found", id));
        if(!vehicule.getMatricule().equals(vehiculeRequest.getMatricule())){
            vehicule.setMatricule(vehiculeRequest.getMatricule());
        }
        if (vehicule.getModele() != vehiculeRequest.getModele()){
            vehicule.setModele(vehiculeRequest.getModele());
        }
        if (!vehicule.getMarque().equals(vehiculeRequest.getMarque())){
            vehicule.setMarque(vehiculeRequest.getMarque());
        }
        if (vehicule.getPuissanceFiscale() != vehicule.getPuissanceFiscale()){
            vehicule.setPuissanceFiscale(vehiculeRequest.getPuissanceFiscale());
        }
        if (vehicule.getProprietaire() != vehicule.getProprietaire()){
            vehicule.setProprietaire(vehiculeRequest.getProprietaire());
        }
        Vehicule response = vehiculeRepository.save(vehicule);
        return mappers.from(response);
    }

    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public VehiculeResponseDto getVehiculeByMatricule(String matricule){
        Vehicule vehicule = vehiculeRepository.findAll().stream().filter(v -> v.getMatricule().equals(matricule)).findAny().orElse(null);
        if (vehicule == null) throw new RuntimeException(String.format("Matricule %s not found", matricule));
        return mappers.toResponse(vehicule);
    }

    @Override
    public ProprietaireResponseDto getProprietaireOfVehicule(Long id) {
        Vehicule vehicule = vehiculeRepository.findById(id).orElse(null);
        if (vehicule == null) throw new RuntimeException(String.format("Vehicule by id %dnot found", id));
        Proprietaire proprietaire = vehicule.getProprietaire();
        ProprietaireResponseDto response = proprietaireMapper.from(proprietaire);
        return response;
    }


}
