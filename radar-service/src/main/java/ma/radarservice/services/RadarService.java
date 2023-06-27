package ma.radarservice.services;

import ma.radarservice.dto.InfractionRequest;
import ma.radarservice.dto.RadarRequest;
import ma.radarservice.entities.Infraction;
import ma.radarservice.entities.Proprietaire;
import ma.radarservice.entities.Radar;

import java.util.List;

public interface RadarService {
    List<Radar> getAllRadars();
    Radar getRadarById(Long id);
    Radar saveRadar(RadarRequest radarRequest);
    Radar updateRadar(Long id, RadarRequest radarRequest);
    void deleteRadar(Long id);
    Infraction generateInfraction(String matricule, Radar radarRequest, double vitesseVehicule);
}
