package ma.enset.immatriculationservice.web;

import lombok.AllArgsConstructor;
import ma.enset.immatriculationservice.dto.ProprietaireRequestDto;
import ma.enset.immatriculationservice.dto.VehiculeRequestDto;
import ma.enset.immatriculationservice.entities.Proprietaire;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.services.ProprietaireService;
import ma.enset.immatriculationservice.services.VehiculeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ImmatraculationRestControler {
    private ProprietaireService proprietaireService;
    private VehiculeService vehiculeService;


    @GetMapping("/proprietaires")
    public List<Proprietaire> prorietaires(){

        return proprietaireService.getAllProprietaires();
    }
    @GetMapping("/proprietaires/{id}")
    public Proprietaire prorietaireById(@PathVariable Long id){
        return proprietaireService.getProprietaireById(id);
    }
    @PostMapping("/proprietaires")
    public Proprietaire saveProprietaire(@RequestBody ProprietaireRequestDto proprietaire){
        return proprietaireService.saveProprietaire(proprietaire);
    }
    @PutMapping("/proprietaires/{id}")
    public Proprietaire updateProprietaire(@RequestBody ProprietaireRequestDto proprietaire, @PathVariable Long id){
        return proprietaireService.updateProprietaire(id, proprietaire);
    }
    @DeleteMapping("/proprietaires/{id}")
    public void deleteProprietaire(@PathVariable Long id){
        proprietaireService.deleteProprietaire(id);
    }

    @PutMapping("/proprietaires/vehicule/{id}")
    public Proprietaire addVehiculeToProprietaire(@PathVariable Long id, @RequestBody Vehicule vehicule){
        return proprietaireService.addVehicule(id, vehicule);
    }

    @GetMapping("/vehicules")
    public List<Vehicule> vehiculeList(){
        return vehiculeService.getAllVehicules();
    }
    @GetMapping("/vehicules/{id}")
    public Vehicule vehiculeById(@PathVariable Long id){
        return vehiculeService.getVehiculeById(id);
    }
    @PostMapping("/vehicules")
    public Vehicule saveVehicule(@RequestBody VehiculeRequestDto vehicule){
        return vehiculeService.saveVehicule(vehicule);
    }
    @PutMapping("/vehicules/{id}")
    public Vehicule updateVehicule(@RequestBody VehiculeRequestDto vehicule, @PathVariable Long id){
        return vehiculeService.updateVehicule(id, vehicule);
    }
    @DeleteMapping("/vehicules/{id}")
    public void deleteVehucule(@PathVariable Long id){
        vehiculeService.deleteVehicule(id);
    }

    @GetMapping("/vehicules/matricule/{matricule}")
    public Vehicule getVehiculeByMatricule(@PathVariable(name = "matricule") String matricule){
        return vehiculeService.getVehiculeByMatricule(matricule);
    }
}
