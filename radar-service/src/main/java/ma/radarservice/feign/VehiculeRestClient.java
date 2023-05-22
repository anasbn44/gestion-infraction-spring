package ma.radarservice.feign;

import ma.radarservice.entities.Vehicule;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Component
@FeignClient(name = "IMMATRICULATION-SERVICE")
public interface VehiculeRestClient {
    @GetMapping("/vehicules/{matricule}")
    Vehicule getVehiculeByMatricule(@PathVariable(name = "matricule") String matricule);
}
