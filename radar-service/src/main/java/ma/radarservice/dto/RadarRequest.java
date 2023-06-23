package ma.radarservice.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RadarRequest {
    private double vitesseMax;
    private double vitesseVehicule;
    private int longitude;
    private int latitude;
}
