package ma.radarservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Data @NoArgsConstructor @AllArgsConstructor @Builder @ToString
public class Infraction {
    private Long id;
    private Date date;
    private Long nuneroRadar;
    private String matriculeVehicule;
    private String nomPropietaire;
    private double vitesseMax;
    private double vitesseVehicule;
    private double montant;
}
