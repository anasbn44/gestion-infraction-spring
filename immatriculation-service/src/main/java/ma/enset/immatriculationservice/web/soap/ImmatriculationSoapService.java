package ma.enset.immatriculationservice.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.repositories.PropretaireRepository;
import ma.enset.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService
public class ImmatriculationSoapService {
    private VehiculeRepository vehiculeRepository;
    private PropretaireRepository propretaireRepository;

    public ImmatriculationSoapService(VehiculeRepository vehiculeRepository, PropretaireRepository propretaireRepository) {
        this.vehiculeRepository = vehiculeRepository;
        this.propretaireRepository = propretaireRepository;
    }
    @WebMethod
    public List<Vehicule> vehiculeList(){
        return vehiculeRepository.findAll();
    }
    @WebMethod
    public Vehicule vehiculeByMatricule(@WebParam(name = "matricule") String matricule){
        Vehicule vehicule = vehiculeRepository.findAll().stream().filter(v -> v.getMatricule().equals(matricule)).findAny().orElse(null);
        return vehicule;
    }
}
