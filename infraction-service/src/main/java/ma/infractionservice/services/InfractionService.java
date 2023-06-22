package ma.infractionservice.services;

import ma.infractionservice.dto.InfractionRequest;
import ma.infractionservice.entities.Infraction;

import java.util.List;

public interface InfractionService {
    List<Infraction> getAllInfractions();
    Infraction getInfractionById(Long id);
    Infraction saveInfraction(InfractionRequest infractionRequest);
    Infraction updateInfraction(Long id, InfractionRequest infractionRequest);
    void deleteInfraction(Long id);
}
