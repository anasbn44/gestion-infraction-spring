package ma.infractionservice.web;

import lombok.AllArgsConstructor;
import ma.infractionservice.dto.InfractionRequest;
import ma.infractionservice.entities.Infraction;
import ma.infractionservice.repositories.InfractionRepository;
import ma.infractionservice.services.InfractionService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class InfractionGraphqlController {
    private InfractionService infractionService;

    @QueryMapping
    public List<Infraction> infractions(){
        return infractionService.getAllInfractions();
    }

    @QueryMapping
    public Infraction infractionById(@Argument Long id){
        return infractionService.getInfractionById(id);
    }

    @MutationMapping
    public Infraction saveInfraction(@Argument InfractionRequest infraction){
        return infractionService.saveInfraction(infraction);
    }

    @MutationMapping
    public Infraction updateInfraction(@Argument Long id,@Argument InfractionRequest infraction){
        return infractionService.updateInfraction(id, infraction);
    }

    @MutationMapping
    public void deleteInfraction(@Argument Long id){
        infractionService.deleteInfraction(id);
    }
}
