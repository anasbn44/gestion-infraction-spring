package ma.radarservice.web;

import lombok.AllArgsConstructor;
import ma.radarservice.dto.InfractionRequest;
import ma.radarservice.entities.Infraction;
import ma.radarservice.entities.Proprietaire;
import ma.radarservice.entities.Radar;
import ma.radarservice.repository.RadarRepository;
import ma.radarservice.services.RadarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class RadarRestService {
    private RadarRepository radarRepository;
    private RadarService radarService;

    @GetMapping("/radars")
    public List<Radar> radars(){

        return radarRepository.findAll();
    }
    @GetMapping("/radars/{id}")
    public Radar infractionById(@PathVariable Long id){
        Radar radar = radarRepository.findById(id).get();
        return radar;
    }
    @PostMapping("/radars")
    public Radar saveRadar(@RequestBody Radar radar){
        return radarRepository.save(radar);
    }
    @PutMapping("/radars/{id}")
    public Radar updateRadar(@RequestBody Radar radar, @PathVariable Long id){
        Radar r = radarRepository.findById(id).get();
        if(radar.getVitesseMax() != 0)
            r.setVitesseMax(radar.getVitesseMax());
        if (radar.getLatitude() != 0)
            r.setLatitude(radar.getLatitude());
        if (radar.getLongitude() != 0)
            r.setLongitude(radar.getLongitude());
        return radarRepository.save(r);
    }
    @DeleteMapping("/radars/{id}")
    public void deleteRadar(@PathVariable Long id){
        radarRepository.deleteById(id);
    }

    @PostMapping("/newInfraction")
    public Infraction newInfraction(@RequestBody InfractionRequest infractionRequest){
        return radarService.newInfraction(infractionRequest);
    }

    @GetMapping("radars/proprietaire/{matricule}")
    public Proprietaire proprietaireByMatricule(@PathVariable(name = "matricule") String matricule){
        return radarService.proprietaireByMatricule(matricule);
    }

}
