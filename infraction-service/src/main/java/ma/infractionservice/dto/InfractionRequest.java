package ma.infractionservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class InfractionRequest {
    private Long nuneroRadar;
    private String matriculeVehicule;
    private String nomPropietaire;
    private double vitesseMax;
    private double vitesseVehicule;
}
