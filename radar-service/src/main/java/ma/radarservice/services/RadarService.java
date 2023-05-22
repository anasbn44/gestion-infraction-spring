package ma.radarservice.services;

import ma.radarservice.dto.InfractionRequest;
import ma.radarservice.entities.Infraction;
import ma.radarservice.entities.Proprietaire;
import ma.radarservice.entities.Radar;

public interface RadarService {
    Infraction newInfraction(InfractionRequest infractionRequest);
    Proprietaire proprietaireByMatricule(String matricule);
}
