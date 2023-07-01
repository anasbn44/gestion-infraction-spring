package ma.radarservice;

import ma.enset.immatriculationservice.web.soap.ImmatriculationService;
import ma.enset.immatriculationservice.web.soap.ImmatriculationSoapServiceService;
import ma.infractionservice.web.soap.InfractionService;
import ma.infractionservice.web.soap.InfractionSoapServiceService;
import ma.radarservice.entities.Radar;
import ma.radarservice.repository.RadarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
@EnableFeignClients
public class RadarServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RadarServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(RadarRepository radarRepository){
        return args -> {
            for (int i = 0; i < 10; i++) {
                Radar radar = Radar.builder()
                        .vitesseMax(40 + i * 10)
                        .latitude((int) Math.random() * 9000)
                        .longitude((int) Math.random() * 9000)
                        .build();
                radarRepository.save(radar);
            }
        };
    }

    @Bean
    InfractionService infractionService(){
        return new InfractionSoapServiceService().getInfractionServicePort();
    }
    @Bean
    ImmatriculationService immatriculationService(){
        return new ImmatriculationSoapServiceService().getImmatriculationServicePort();
    }

}
