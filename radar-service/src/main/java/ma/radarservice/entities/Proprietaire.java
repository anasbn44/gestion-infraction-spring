package ma.radarservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;


@Data @NoArgsConstructor @AllArgsConstructor @ToString @Builder
public class Proprietaire {
    private Long id;
    private String nom;
    private Date dateDeNaissance;
    private String email;
    private List<Vehicule> vehicules;
}
