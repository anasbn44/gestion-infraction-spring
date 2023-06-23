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
    private Long numeroRadar;
    private String matriculeVehicule;
    private double vitesseMax;
    private double vitesseVehicule;
}
