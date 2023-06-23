package ma.radarservice.feign;

import ma.radarservice.entities.Vehicule;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:1997", value = "immatriculation-rest-client")
public interface VehiculeRestClient {
    @GetMapping("/immatriculation/vehicules/matricule/{matricule}")
    Vehicule getVehiculeByMatricule(@PathVariable(name = "matricule") String matricule);
}
