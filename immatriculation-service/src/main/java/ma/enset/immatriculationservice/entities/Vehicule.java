package ma.enset.immatriculationservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString @Builder
public class Vehicule {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricule;
    private String marque;
    private int puissanceFiscale;
    private int modele;
    @ManyToOne
    private Proprietaire proprietaire;
}
