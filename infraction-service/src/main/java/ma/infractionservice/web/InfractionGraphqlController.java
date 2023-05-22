package ma.infractionservice.web;

import ma.infractionservice.entities.Infraction;
import ma.infractionservice.repositories.InfractionRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class InfractionGraphqlController {
    private InfractionRepository infractionRepository;

    public InfractionGraphqlController(InfractionRepository infractionRepository) {
        this.infractionRepository = infractionRepository;
    }

    @QueryMapping
    public List<Infraction> infractions(){
        return infractionRepository.findAll();
    }

    @QueryMapping
    public Infraction infractionById(@Argument Long id){
        return infractionRepository.findById(id).get();
    }

    @MutationMapping
    public Infraction saveInfraction(@Argument Infraction infraction){
        return infractionRepository.save(infraction);
    }

    @MutationMapping
    public Infraction updateInfraction(@Argument Long id,@Argument Infraction infraction){
        Infraction infraction1 = infractionRepository.findById(id).orElseThrow();
        if(infraction.getDate() != null)
            infraction1.setDate(infraction.getDate());
        if(infraction.getMontant() != 0)
            infraction1.setMontant(infraction.getMontant());
        if(infraction.getVitesseMax() != 0)
            infraction1.setVitesseMax(infraction.getVitesseMax());
        if(infraction.getNuneroRadar() != 0)
            infraction1.setNuneroRadar(infraction.getNuneroRadar());
        if(infraction.getMatriculeVehicule() != null)
            infraction1.setMatriculeVehicule(infraction.getMatriculeVehicule());
        return infractionRepository.save(infraction1);
    }

    @MutationMapping
    public void deleteInfraction(@Argument Long id){
        infractionRepository.deleteById(id);
    }
}
