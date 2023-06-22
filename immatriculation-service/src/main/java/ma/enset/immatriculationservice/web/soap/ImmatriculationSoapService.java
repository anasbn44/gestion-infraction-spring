package ma.enset.immatriculationservice.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.services.VehiculeService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(name = "immatriculationService")
@AllArgsConstructor
public class ImmatriculationSoapService {
    private VehiculeService vehiculeService;
    @WebMethod
    public List<Vehicule> vehiculeList(){
        return vehiculeService.getAllVehicules();
    }
    @WebMethod
    public Vehicule vehiculeByMatricule(@WebParam(name = "matricule") String matricule){
        return vehiculeService.getVehiculeByMatricule(matricule);
    }
}
