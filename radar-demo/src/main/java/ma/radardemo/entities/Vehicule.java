package ma.radardemo.entities;

import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor @ToString @Builder
public class Vehicule {
    private Long id;
    private String matricule;
    private String marque;
    private int puissanceFiscale;
    private int modele;
}
