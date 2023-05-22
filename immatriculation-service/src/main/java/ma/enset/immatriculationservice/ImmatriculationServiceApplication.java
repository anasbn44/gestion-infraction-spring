package ma.enset.immatriculationservice;

import ma.enset.immatriculationservice.entities.Proprietaire;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.repositories.PropretaireRepository;
import ma.enset.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class ImmatriculationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmatriculationServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(PropretaireRepository propretaireRepository, VehiculeRepository vehiculeRepository){
        return args -> {
            Proprietaire proprietaire = Proprietaire.builder()
                    .nom("anas")
                    .email("anas@gmail.com")
                    .dateDeNaissance(new Date(1900,12,12))
                    .build();
            propretaireRepository.save(proprietaire);
            Vehicule vehicule = Vehicule.builder()
                    .marque("ferrari")
                    .modele(1950)
                    .matricule("1a1111")
                    .puissanceFiscale(50)
                    .proprietaire(proprietaire)
                    .build();
            vehiculeRepository.save(vehicule);
            Vehicule vehicule2 = Vehicule.builder()
                    .marque("dodge")
                    .modele(1967)
                    .matricule("1a1222")
                    .puissanceFiscale(50)
                    .proprietaire(proprietaire)
                    .build();
            vehiculeRepository.save(vehicule2);
        };
    }

}
