package ma.radarservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor @ToString @Builder
public class Vehicule {
    private Long id;
    private String matricule;
    private String marque;
    private int puissanceFiscale;
    private int modele;
    private Proprietaire proprietaire;
}
