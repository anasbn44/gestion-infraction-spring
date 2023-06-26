package ma.enset.immatriculationservice.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;
import ma.enset.immatriculationservice.entities.Proprietaire;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString @Builder
public class VehiculeRequestDto {
    private String matricule;
    private String marque;
    private int puissanceFiscale;
    private int modele;
}
