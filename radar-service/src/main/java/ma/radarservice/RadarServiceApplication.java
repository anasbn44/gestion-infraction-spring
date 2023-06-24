package ma.radarservice;

import ma.enset.immatriculationservice.web.soap.ImmatriculationService;
import ma.enset.immatriculationservice.web.soap.ImmatriculationSoapServiceService;
import ma.infractionservice.web.soap.InfractionService;
import ma.infractionservice.web.soap.InfractionSoapServiceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class RadarServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RadarServiceApplication.class, args);
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
