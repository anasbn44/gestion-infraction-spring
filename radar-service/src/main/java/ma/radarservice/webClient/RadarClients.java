package ma.radarservice.webClient;

import lombok.AllArgsConstructor;
import ma.enset.immatriculationservice.web.soap.ImmatriculationService;
import ma.infractionservice.web.soap.InfractionService;
import ma.radarservice.dto.InfractionRequest;
import ma.radarservice.entities.Infraction;
import ma.radarservice.entities.Vehicule;
import ma.radarservice.feign.InfractionRestClient;
import ma.radarservice.feign.VehiculeRestClient;
import ma.radarservice.mappers.RadarMapper;
import org.springframework.graphql.client.GraphQlClient;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/radar-client")
@AllArgsConstructor
public class RadarClients {
    private RadarMapper radarMapper;
    private VehiculeRestClient vehiculeRestClient;
    private InfractionRestClient infractionRestClient;
    private InfractionService infractionSoapService;
    private ImmatriculationService immatriculationSoapService;

    @GetMapping("/vehicule/{matricule}")
    public Vehicule getVehiculeByMatricule(@PathVariable(name = "matricule") String matricule){
        return vehiculeRestClient.getVehiculeByMatricule(matricule);
    }
    @GetMapping("/gql/vehicule/{matricule}")
    public Mono<Vehicule> getVehiculeByMatriculeGql(@PathVariable(name = "matricule") String matricule){
        HttpGraphQlClient graphQlClient = HttpGraphQlClient.builder()
                .url("http://localhost:1997/graphql")
                .build();
        var httpRequestDocument = """
                query($id:Int) {
                    getVehiculeByMatricule(matricule : $matricule){
                        id, modele, matricule, marque, puissanceFiscale, proprietaire
                    }
                }
                """;
        Mono<Vehicule> vehiculeMono = graphQlClient.document(httpRequestDocument)
                .variable("matricule", matricule)
                .retrieve("getVehiculeByMatricule")
                .toEntity(Vehicule.class);
        return vehiculeMono;
    }

    @GetMapping("/soap/vehicule/{matricule}")
    public Vehicule getVehiculeByMatriculeSoap(@PathVariable(name = "matricule") String matricule){
        return radarMapper.fromSoapToVehicule(immatriculationSoapService.vehiculeByMatricule(matricule));
    }

    @GetMapping("/soap/vehicules")
    public List<ma.enset.immatriculationservice.web.soap.Vehicule> getVehiculeSoap(){
        return immatriculationSoapService.vehiculeList();
    }

    @PostMapping("/infraction")
    public Infraction saveInfraction(@RequestBody InfractionRequest infractionRequest){
        return infractionRestClient.saveInfraction(infractionRequest);
    }
    @PostMapping("/gql/infraction")
    public Mono<Infraction> saveInfractionGql(@RequestBody InfractionRequest infractionRequest){
        HttpGraphQlClient graphQlClient = HttpGraphQlClient.builder()
                .url("http://localhost:1998/graphql")
                .build();
        var httpRequestDocument = """
                mutation($Infraction : InfractionRequest) {
                  saveInfraction(Infraction : $Infraction){
                    id, date, nuneroRadar, matriculeVehicule, vitesseMax, vitesseVehicule, montant
                  }
                }
                """;
        Mono<Infraction> infractionMono = graphQlClient.document(httpRequestDocument)
                .variable("Infraction", infractionRequest)
                .retrieve("saveInfraction")
                .toEntity(Infraction.class);
        return infractionMono;
    }

    @PostMapping("/soap/infraction")
    public Infraction saveInfractionSoap(@RequestBody InfractionRequest infractionRequest){
        ma.infractionservice.web.soap.Infraction infraction = infractionSoapService.saveInfraction(radarMapper.fromInfractionRequestToSoap(infractionRequest));
        return radarMapper.fromSoapToInfraction(infraction);
    }

    @GetMapping("soap/infractions/{id}")
    public Infraction getInfractionById(@PathVariable Long id){
        return radarMapper.fromSoapToInfraction(infractionSoapService.infractionById(id));
    }
}
