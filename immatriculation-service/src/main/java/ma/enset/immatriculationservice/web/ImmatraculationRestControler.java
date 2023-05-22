package ma.enset.immatriculationservice.web;

import ma.enset.immatriculationservice.dto.ProprietaireResponseDto;
import ma.enset.immatriculationservice.entities.Proprietaire;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.repositories.PropretaireRepository;
import ma.enset.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.PrinterMessageFromOperator;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ImmatraculationRestControler {
    private PropretaireRepository propretaireRepository;
    private VehiculeRepository vehiculeRepository;

    ImmatraculationRestControler(VehiculeRepository vehiculeRepository, PropretaireRepository propretaireRepository){
        this.propretaireRepository = propretaireRepository;
        this.vehiculeRepository = vehiculeRepository;
    }

    @GetMapping("/proprietaires")
    public List<Proprietaire> prorietaires(){

        return propretaireRepository.findAll();
    }
    @GetMapping("/proprietaires/{id}")
    public Proprietaire prorietaireById(@PathVariable Long id){
        Proprietaire proprietaire = propretaireRepository.findById(id).get();
        return proprietaire;
    }
    @PostMapping("/proprietaires")
    public Proprietaire saveProprietaire(@RequestBody Proprietaire proprietaire){
        return propretaireRepository.save(proprietaire);
    }
    @PutMapping("/proprietaires/{id}")
    public Proprietaire updateProprietaire(@RequestBody Proprietaire proprietaire, @PathVariable Long id){
        return propretaireRepository.save(proprietaire);
    }
    @DeleteMapping("/proprietaires/{id}")
    public void deleteProprietaire(@PathVariable Long id){
        propretaireRepository.deleteById(id);
    }

    @GetMapping("/vehicules")
    public List<Vehicule> vehiculeList(){

        return vehiculeRepository.findAll();
    }
    @GetMapping("/vehicules/{id}")
    public Vehicule vehiculeById(@PathVariable Long id){
        Vehicule vehicule = vehiculeRepository.findById(id).get();
        return vehicule;
    }
    @PostMapping("/vehicules")
    public Vehicule saveVehicule(@RequestBody Vehicule vehicule){
        return vehiculeRepository.save(vehicule);
    }
    @PutMapping("/vehicules/{id}")
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule, @PathVariable Long id){
        return vehiculeRepository.save(vehicule);
    }
    @DeleteMapping("/vehicules/{id}")
    public void deleteVehucule(@PathVariable Long id){
        vehiculeRepository.deleteById(id);
    }

    @GetMapping("/vehicules/{matricule}")
    public Vehicule getVehiculeByMatricule(@PathVariable(name = "matricule") String matricule){
        Vehicule vehicule = vehiculeRepository.findAll().stream().filter(v -> v.getMatricule().equals(matricule)).findAny().orElse(null);
        return vehicule;
    }
}
