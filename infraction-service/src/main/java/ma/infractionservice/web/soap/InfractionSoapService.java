package ma.infractionservice.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import ma.infractionservice.dto.InfractionRequest;
import ma.infractionservice.entities.Infraction;
import ma.infractionservice.services.InfractionService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService
@AllArgsConstructor
public class InfractionSoapService {
    private InfractionService infractionService;

    @WebMethod
    public List<Infraction> infractions(){
        return infractionService.getAllInfractions();
    }

    @WebMethod
    public Infraction infractionById(@WebParam(name = "id") Long id){
        return infractionService.getInfractionById(id);
    }

    @WebMethod
    public Infraction saveInfraction(@WebParam(name = "infraction") InfractionRequest infraction){
        return infractionService.saveInfraction(infraction);
    }

    @WebMethod
    public Infraction updateInfraction(@WebParam(name = "id") Long id, @WebParam(name = "infraction") InfractionRequest infraction){
        return infractionService.updateInfraction(id, infraction);
    }

    @WebMethod
    public void deleteInfraction(@WebParam(name = "id") Long id){
        infractionService.deleteInfraction(id);
    }

}
