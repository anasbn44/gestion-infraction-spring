package ma.infractionservice;

import ma.infractionservice.entities.Infraction;
import ma.infractionservice.repositories.InfractionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class InfractionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfractionServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(InfractionRepository infractionRepository){
        return args -> {
            Infraction infraction1 = Infraction.builder()
                    .date(new Date())
                    .montant(150.0)
                    .nuneroRadar(1234L)
                    .vitesseMax(120.0)
                    .matriculeVehicule("1a123456")
                    .nomPropietaire("yassir")
                    .build();
            Infraction infraction2 = Infraction.builder()
                    .date(new Date())
                    .montant(300.0)
                    .nuneroRadar(12345L)
                    .vitesseMax(60.0)
                    .matriculeVehicule("1a978556")
                    .nomPropietaire("yassir")
                    .build();
            infractionRepository.save(infraction1);
            infractionRepository.save(infraction2);
            //infractionRepository.findAll().forEach(infraction -> System.out.printf(infraction.toString()));
        };
    }

}
