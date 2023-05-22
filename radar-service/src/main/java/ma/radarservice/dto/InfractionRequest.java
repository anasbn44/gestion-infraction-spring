package ma.radarservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InfractionRequest {
    private String matricule;
    private double vitesseVehicul;
    private Long radarId;
}
