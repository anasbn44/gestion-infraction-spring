package ma.radarservice.services;

import lombok.AllArgsConstructor;
import ma.infractionservice.web.grpc.stub.InfractionSefvice;
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
    public Infraction generateInfraction(String matricule, Radar radarRequest, double vitesseVehicule) {
        Vehicule vehicule = radarClients.getVehiculeByMatriculeGrpc(matricule);
        Proprietaire proprietaireOfVehicule = radarClients.getProprietaireOfVehiculeGrpc(vehicule.getId());
        InfractionSefvice.InfractionRequest infractionRequest = InfractionSefvice.InfractionRequest.newBuilder()
                .setNuneroRadar(radarRequest.getId())
                .setMatriculeVehicule(matricule)
                .setNomPropietaire(proprietaireOfVehicule.getNom())
                .setVitesseMax(radarRequest.getVitesseMax())
                .setVitesseVehicule(vitesseVehicule)
                .build();
//                .nuneroRadar(radarRequest.getId())
//                .matriculeVehicule(matricule)
//                .nomPropietaire(proprietaireOfVehicule.getNom())
//                .vitesseMax(radarRequest.getVitesseMax())
//                .vitesseVehicule(vitesseVehicule)

        Infraction infraction = radarClients.saveInfractionGrpc(infractionRequest);
        return infraction;
    }
}
