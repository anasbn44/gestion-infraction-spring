package ma.enset.immatriculationservice.dto;

import jakarta.persistence.OneToMany;
import lombok.*;
import ma.enset.immatriculationservice.entities.Vehicule;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString @Builder
public class ProprietaireResponseDto {
    private Long id;
    private String nom;
    private Date dateDeNaissance;
    private String email;
}
