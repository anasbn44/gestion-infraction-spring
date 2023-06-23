package ma.radarservice.web;

import lombok.AllArgsConstructor;
import ma.radarservice.dto.InfractionRequest;
import ma.radarservice.entities.Infraction;
import ma.radarservice.entities.Vehicule;
import ma.radarservice.feign.InfractionRestClient;
import ma.radarservice.feign.VehiculeRestClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/radar-client")
@AllArgsConstructor
public class RadarClients {
    private VehiculeRestClient vehiculeRestClient;
    private InfractionRestClient infractionRestClient;

    @GetMapping("/vehicule/{matricule}")
    public Vehicule getVehiculeByMatricule(@PathVariable(name = "matricule") String matricule){
        return vehiculeRestClient.getVehiculeByMatricule(matricule);
    }

    @PostMapping("/infraction")
    public Infraction saveInfraction(@RequestBody InfractionRequest infractionRequest){
        return infractionRestClient.saveInfraction(infractionRequest);
    }
}
