package ma.enset.immatriculationservice.dto;

import jakarta.persistence.*;
import lombok.*;
import ma.enset.immatriculationservice.entities.Proprietaire;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString @Builder
public class VehiculeResponseDto {

    private Long id;
    private String matricule;
    private String marque;
    private int puissanceFiscale;
    private int modele;
    private Proprietaire proprietaire;

}
