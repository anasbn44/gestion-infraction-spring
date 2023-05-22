package ma.radardemo.entities;


import lombok.*;


@Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Radar {
    private Long id;
    private double vitesseMax;
    private int longitude;
    private int latitude;
}
