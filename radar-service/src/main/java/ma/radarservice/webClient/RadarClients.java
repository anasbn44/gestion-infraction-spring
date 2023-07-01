package ma.radarservice.webClient;

import lombok.AllArgsConstructor;
import ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationGrpcServiceGrpc;
import ma.enset.immatriculationservice.web.soap.ImmatriculationService;
import ma.infractionservice.web.grpc.stub.InfractionGrpcServiceGrpc;
import ma.infractionservice.web.grpc.stub.InfractionSefvice;
import ma.infractionservice.web.soap.InfractionService;
import ma.radarservice.dto.InfractionRequest;
import ma.radarservice.entities.Infraction;
import ma.radarservice.entities.Proprietaire;
import ma.radarservice.entities.Vehicule;
import ma.radarservice.feign.InfractionRestClient;
import ma.radarservice.feign.VehiculeRestClient;
import ma.radarservice.mappers.RadarMapper;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.client.GraphQlClient;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/radar-client")

public class RadarClients {
    @Autowired
    private RadarMapper radarMapper;
    @Autowired
    private VehiculeRestClient vehiculeRestClient;
    @Autowired
    private InfractionRestClient infractionRestClient;
    @Autowired
    private InfractionService infractionSoapService;
    @Autowired
    private ImmatriculationService immatriculationSoapService;
    @GrpcClient(value = "infracionSevice")
    private InfractionGrpcServiceGrpc.InfractionGrpcServiceBlockingStub infractionGrpcService;
    @GrpcClient(value = "immatriculationService")
    private ImmatriculationGrpcServiceGrpc.ImmatriculationGrpcServiceBlockingStub immatriculationGrpcService;


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
                query($matricule:String){
                  getVehiculeByMatricule(matricule:$matricule){
                    id, marque, matricule, modele, puissanceFiscale
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

    @GetMapping("/grpc/vehicule/{matricule}")
    public Vehicule getVehiculeByMatriculeGrpc(@PathVariable(name = "matricule") String matricule){
        ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule request =
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.Matricule.newBuilder()
                        .setMatricule(matricule)
                        .build();
        ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeResponse response =
                immatriculationGrpcService.getVehiculeByMatricule(request);
        return radarMapper.fromGrpcToVehicule(response);
    }

    @GetMapping("/grpc/vehicule/proprietaire/{id}")
    public Proprietaire getProprietaireOfVehiculeGrpc(@PathVariable(name = "id") Long idVehicule){
        ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest request =
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculeIdRequest.newBuilder()
                .setId(idVehicule)
                .build();
        ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.ProprietaireResponse response =
                immatriculationGrpcService.getProprietaireOfVehicule(request);
        return radarMapper.fromGrocToProprietaire(response);
    }

    @GetMapping("/grpc/vehicule")
    public List<Vehicule> getAllVehiculesGrpc(){
        ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject request =
                ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.EmptyObject.newBuilder().build();
        ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService.VehiculesList response =
                immatriculationGrpcService.getAllVehicule(request);
        return response.getVehiculesList().stream().map(radarMapper::fromGrpcToVehicule).collect(Collectors.toList());
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
    @PostMapping("/grpc/infraction")
    public Infraction saveInfractionGrpc(@RequestBody InfractionSefvice.InfractionRequest infractionRequest){
        InfractionSefvice.InfractionResponse response = infractionGrpcService.saveInfraction(infractionRequest);
        return radarMapper.fromGrpcToInfraction(response);
    }

    @GetMapping("grpc/infractions/{id}")
    public Infraction getInfractionByIdGrpc(@PathVariable Long id){
        InfractionSefvice.InfractionIdRequest request = InfractionSefvice.InfractionIdRequest.newBuilder().setId(id).build();
        InfractionSefvice.InfractionResponse response = infractionGrpcService.getInfractionById(request);
        return radarMapper.fromGrpcToInfraction(response);
    }

}
