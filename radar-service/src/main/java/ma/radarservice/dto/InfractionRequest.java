package ma.radarservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InfractionRequest {
    private Long nuneroRadar;
    private String matriculeVehicule;
    private String nomPropietaire;
    private double vitesseMax;
    private double vitesseVehicule;
}
