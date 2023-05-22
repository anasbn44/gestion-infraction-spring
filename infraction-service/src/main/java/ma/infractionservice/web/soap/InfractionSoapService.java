package ma.infractionservice.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import ma.infractionservice.entities.Infraction;
import ma.infractionservice.repositories.InfractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@WebService
public class InfractionSoapService {
    @Autowired
    private InfractionRepository infractionRepository;

    @WebMethod
    public Infraction save(@WebParam(name = "infraction") Infraction infraction){
        return infractionRepository.save(infraction);
    }

}
