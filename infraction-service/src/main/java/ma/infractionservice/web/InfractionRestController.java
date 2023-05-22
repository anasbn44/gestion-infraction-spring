package ma.infractionservice.web;

import ma.infractionservice.entities.Infraction;
import ma.infractionservice.repositories.InfractionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InfractionRestController {
    private InfractionRepository infractionRepository;

    public InfractionRestController(InfractionRepository infractionRepository) {
        this.infractionRepository = infractionRepository;
    }

    @GetMapping("/infractions")
    public List<Infraction> infractions(){

        return infractionRepository.findAll();
    }
    @GetMapping("/infractions/{id}")
    public Infraction infractionById(@PathVariable Long id){
        Infraction infraction = infractionRepository.findById(id).get();
        return infraction;
    }
    @PostMapping("/infractions")
    public Infraction saveInfraction(@RequestBody Infraction infraction){
        return infractionRepository.save(infraction);
    }
    @PutMapping("/infractions/{id}")
    public Infraction updateInfraction(@RequestBody Infraction infraction, @PathVariable Long id){
        return infractionRepository.save(infraction);
    }
    @DeleteMapping("/infractions/{id}")
    public void deleteInfraction(@PathVariable Long id){
        infractionRepository.deleteById(id);
    }
}
