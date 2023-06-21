package ma.enset.immatriculationservice.web;

import lombok.AllArgsConstructor;
import ma.enset.immatriculationservice.dto.ProprietaireRequestDto;
import ma.enset.immatriculationservice.dto.VehiculeRequestDto;
import ma.enset.immatriculationservice.entities.Proprietaire;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.repositories.PropretaireRepository;
import ma.enset.immatriculationservice.repositories.VehiculeRepository;
import ma.enset.immatriculationservice.services.ProprietaireService;
import ma.enset.immatriculationservice.services.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ImmatriculationGraphQlController {
    private ProprietaireService proprietaireService;
    private VehiculeService vehiculeService;

    @QueryMapping
    public List<Proprietaire> prorietaires(){
        return proprietaireService.getAllProprietaires();
    }

    @QueryMapping
    public Proprietaire proprietaireById(@Argument Long id){
        return proprietaireService.getProprietaireById(id);
    }

    @MutationMapping
    public Proprietaire saveProprietaire(@Argument ProprietaireRequestDto proprietaire){
        return proprietaireService.saveProprietaire(proprietaire);
    }

    @MutationMapping
    public Proprietaire updateProprietaire(@Argument Long id,@Argument ProprietaireRequestDto proprietaire){
        return proprietaireService.updateProprietaire(id, proprietaire);
    }

    @MutationMapping
    public void deleteProprietaire(@Argument Long id){
        proprietaireService.deleteProprietaire(id);
    }

    @QueryMapping
    public List<Vehicule> vehicules(){
        return vehiculeService.getAllVehicules();
    }

    @QueryMapping
    public Vehicule vehiculesById(@Argument Long id){
        return vehiculeService.getVehiculeById(id);
    }

    @MutationMapping
    public Vehicule saveVehicule(@Argument VehiculeRequestDto vehicule){
        return vehiculeService.saveVehicule(vehicule);
    }

    @MutationMapping
    public Vehicule updateVehicule(@Argument Long id, @Argument VehiculeRequestDto vehicule){
        return vehiculeService.updateVehicule(id, vehicule);
    }

    @MutationMapping
    public void deleteVehicule(@Argument Long id){
        vehiculeService.deleteVehicule(id);
    }
    @QueryMapping
    public Vehicule getVehiculeByMatricule(@Argument String matricule){
        return vehiculeService.getVehiculeByMatricule(matricule);
    }
}
