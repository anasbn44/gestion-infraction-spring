package ma.enset.immatriculationservice.web;

import ma.enset.immatriculationservice.entities.Proprietaire;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.repositories.PropretaireRepository;
import ma.enset.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ImmatriculationGraphQlController {
    @Autowired
    private PropretaireRepository propretaireRepository;
    @Autowired
    private VehiculeRepository vehiculeRepository;

    @QueryMapping
    public List<Proprietaire> prorietaires(){
        return propretaireRepository.findAll();
    }

    @QueryMapping
    public Proprietaire proprietaireById(@Argument Long id){
        return propretaireRepository.findById(id).get();
    }

    @MutationMapping
    public Proprietaire saveProprietaire(@Argument Proprietaire proprietaire){
        return propretaireRepository.save(proprietaire);
    }

    @MutationMapping
    public Proprietaire updateProprietaire(@Argument Long id,@Argument Proprietaire proprietaire){
        Proprietaire proprietaire1 = propretaireRepository.findById(id).orElseThrow();
        if(proprietaire.getNom() != null)
            proprietaire1.setNom(proprietaire.getNom());
        if(proprietaire.getEmail() != null)
            proprietaire1.setEmail(proprietaire.getEmail());
        if(proprietaire.getDateDeNaissance() != null)
            proprietaire1.setDateDeNaissance(proprietaire.getDateDeNaissance());

        return propretaireRepository.save(proprietaire1);
    }

    @MutationMapping
    public void deleteProprietaire(@Argument Long id){
        propretaireRepository.deleteById(id);
    }

    @QueryMapping
    public List<Vehicule> vehicules(){
        return vehiculeRepository.findAll();
    }

    @QueryMapping
    public Vehicule vehiculesById(@Argument Long id){
        return vehiculeRepository.findById(id).get();
    }

    @MutationMapping
    public Vehicule saveVehicule(@Argument Vehicule vehicule){
        return vehiculeRepository.save(vehicule);
    }

    @MutationMapping
    public Vehicule updateVehicule(@Argument Long id, @Argument Vehicule vehiculeUp){
        Vehicule vehicule = vehiculeRepository.findById(id).orElseThrow();
        if(vehiculeUp.getMatricule() != null)
            vehicule.setMatricule(vehiculeUp.getMatricule());
        if(vehiculeUp.getModele() != 0)
            vehicule.setModele(vehiculeUp.getModele());
        if(vehiculeUp.getPuissanceFiscale() != 0)
            vehicule.setPuissanceFiscale(vehiculeUp.getPuissanceFiscale());

        return vehiculeRepository.save(vehicule);
    }

    @MutationMapping
    public void deleteVehicule(@Argument Long id){
        vehiculeRepository.deleteById(id);
    }
}
