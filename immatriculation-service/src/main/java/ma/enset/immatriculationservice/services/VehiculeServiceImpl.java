package ma.enset.immatriculationservice.services;

import lombok.AllArgsConstructor;
import ma.enset.immatriculationservice.dto.VehiculeRequestDto;
import ma.enset.immatriculationservice.dto.VehiculeResponseDto;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.mappers.VehiculeMapper;
import ma.enset.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class VehiculeServiceImpl implements VehiculeService {
    private VehiculeRepository vehiculeRepository;
    private VehiculeMapper mappers;
    @Override
    public List<Vehicule> getAllVehicules() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        Vehicule vehicule = vehiculeRepository.findById(id).orElse(null);
        if (vehicule == null) throw new RuntimeException(String.format("Vehicule by id %dnot found", id));
        return vehicule;
    }

    @Override
    public Vehicule saveVehicule(VehiculeRequestDto vehiculeRequest) {
        Vehicule vehicule = mappers.to(vehiculeRequest);
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule updateVehicule(Long id, VehiculeRequestDto vehiculeRequest) {
        Vehicule vehicule = getVehiculeById(id);
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
        return vehiculeRepository.save(vehicule);
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
}
