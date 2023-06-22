package ma.infractionservice.web;

import lombok.AllArgsConstructor;
import ma.infractionservice.dto.InfractionRequest;
import ma.infractionservice.entities.Infraction;
import ma.infractionservice.services.InfractionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class InfractionRestController {
    private InfractionService infractionService;

    @GetMapping("/infractions")
    public List<Infraction> infractions(){
        return infractionService.getAllInfractions();
    }
    @GetMapping("/infractions/{id}")
    public Infraction infractionById(@PathVariable Long id){
        return infractionService.getInfractionById(id);
    }
    @PostMapping("/infractions")
    public Infraction saveInfraction(@RequestBody InfractionRequest infraction){
        return infractionService.saveInfraction(infraction);
    }
    @PutMapping("/infractions/{id}")
    public Infraction updateInfraction(@RequestBody InfractionRequest infraction, @PathVariable Long id){
        return infractionService.updateInfraction(id, infraction);
    }
    @DeleteMapping("/infractions/{id}")
    public void deleteInfraction(@PathVariable Long id){
        infractionService.deleteInfraction(id);
    }
}
