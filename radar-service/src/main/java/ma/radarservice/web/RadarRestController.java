package ma.radarservice.web;

import lombok.AllArgsConstructor;
import ma.radarservice.dto.InfractionRequest;
import ma.radarservice.dto.RadarRequest;
import ma.radarservice.entities.Infraction;
import ma.radarservice.entities.Proprietaire;
import ma.radarservice.entities.Radar;
import ma.radarservice.entities.Vehicule;
import ma.radarservice.feign.VehiculeRestClient;
import ma.radarservice.services.RadarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/radar-service")
@AllArgsConstructor
public class RadarRestController {
    private RadarService radarService;


    @GetMapping("/radars")
    public List<Radar> radars(){

        return radarService.getAllRadars();
    }
    @GetMapping("/radars/{id}")
    public Radar infractionById(@PathVariable Long id){
        return radarService.getRadarById(id);
    }
    @PostMapping("/radars")
    public Radar saveRadar(@RequestBody RadarRequest radar){
        return radarService.saveRadar(radar);
    }
    @PutMapping("/radars/{id}")
    public Radar updateRadar(@RequestBody RadarRequest radar, @PathVariable Long id){
        return radarService.updateRadar(id, radar);
    }
    @DeleteMapping("/radars/{id}")
    public void deleteRadar(@PathVariable Long id){
        radarService.deleteRadar(id);
    }

    @PostMapping("/radars/infraction/{matricule}")
    public Infraction generateInfraction(@PathVariable(name = "matricule") String matricule, @RequestBody Radar radar){
        return radarService.generateInfraction(matricule, radar);
    }
}
