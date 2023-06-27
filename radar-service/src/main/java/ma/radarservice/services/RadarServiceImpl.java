package ma.radarservice.services;

import lombok.AllArgsConstructor;
import ma.radarservice.dto.InfractionRequest;
import ma.radarservice.dto.RadarRequest;
import ma.radarservice.entities.Infraction;
import ma.radarservice.entities.Proprietaire;
import ma.radarservice.entities.Radar;
import ma.radarservice.entities.Vehicule;
import ma.radarservice.mappers.RadarMapper;
import ma.radarservice.repository.RadarRepository;
import ma.radarservice.webClient.RadarClients;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class RadarServiceImpl implements RadarService{
    private RadarRepository radarRepository;
    private RadarMapper radarMapper;
    private RadarClients radarClients;

    @Override
    public List<Radar> getAllRadars() {
        return radarRepository.findAll();
    }

    @Override
    public Radar getRadarById(Long id) {
        Radar radar = radarRepository.findById(id).orElse(null);
        if (radar == null) throw new RuntimeException(String.format("radar by id %d no found", id));
        return radar;
    }

    @Override
    public Radar saveRadar(RadarRequest radarRequest) {
        return radarRepository.save(radarMapper.from(radarRequest));
    }

    @Override
    public Radar updateRadar(Long id, RadarRequest radarRequest) {
        Radar radar = getRadarById(id);
        if(radar.getVitesseMax() != radarRequest.getVitesseMax()){
            radar.setVitesseMax(radarRequest.getVitesseMax());
        }
        if(radar.getVitesseVehicule() != radarRequest.getVitesseVehicule()){
            radar.setVitesseVehicule(radarRequest.getVitesseVehicule());
        }
        if (radar.getLongitude() != radarRequest.getLongitude()){
            radar.setLongitude(radarRequest.getLongitude());
        }
        if (radar.getLatitude() != radarRequest.getLatitude()){
            radar.setLatitude(radarRequest.getLatitude());
        }
        return radar;
    }

    @Override
    public void deleteRadar(Long id) {
        radarRepository.deleteById(id);
    }

    @Override
    public Infraction generateInfraction(String matricule, Radar radarRequest) {
        Vehicule vehicule = radarClients.getVehiculeByMatriculeGrpc(matricule);
        Proprietaire proprietaireOfVehicule = radarClients.getProprietaireOfVehicule(vehicule.getId());
        InfractionRequest infractionRequest = InfractionRequest.builder()
                .nuneroRadar(radarRequest.getId())
                .matriculeVehicule(matricule)
                .nomPropietaire(proprietaireOfVehicule.getNom())
                .vitesseMax(radarRequest.getVitesseMax())
                .vitesseVehicule(radarRequest.getVitesseVehicule())
                .build();

        Infraction infraction = radarClients.saveInfractionGrpc(infractionRequest);
        return infraction;
    }
}
