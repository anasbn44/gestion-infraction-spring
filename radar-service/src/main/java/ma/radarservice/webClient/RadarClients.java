package ma.radarservice.webClient;

import lombok.AllArgsConstructor;
import ma.radarservice.dto.InfractionRequest;
import ma.radarservice.entities.Infraction;
import ma.radarservice.entities.Vehicule;
import ma.radarservice.feign.InfractionRestClient;
import ma.radarservice.feign.VehiculeRestClient;
import org.springframework.graphql.client.GraphQlClient;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/radar-client")
@AllArgsConstructor
public class RadarClients {
    private VehiculeRestClient vehiculeRestClient;
    private InfractionRestClient infractionRestClient;

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
}
