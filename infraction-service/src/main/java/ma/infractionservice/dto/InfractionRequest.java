package ma.infractionservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class InfractionRequest {
    private Date date;
    private Long nuneroRadar;
    private String matriculeVehicule;
    private double vitesseMax;
    private double vitesseVehicule;
    private double montant;
}
