package ma.radardemo.services;

import ma.radardemo.entities.Infraction;
import ma.radardemo.entities.Radar;
import ma.radardemo.entities.Vehicule;
import ma.radardemo.mappers.Mappers;
import ma.radardemo.stub.ImmatriculationGrpcServiceGrpc;
import ma.radardemo.stub.ImmatriculationService;
import ma.radardemo.stub.RadarGrpcServiceGrpc;
import ma.radardemo.stub.RadarService;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RadarGrpcService {
    @Autowired
    private Mappers mappers;
    @GrpcClient(value = "radarService")
    private RadarGrpcServiceGrpc.RadarGrpcServiceBlockingStub radarGrpcService;
    @GrpcClient(value = "immatriculationService")
    private ImmatriculationGrpcServiceGrpc.ImmatriculationGrpcServiceBlockingStub immatriculationGrpcService;

    public List<Vehicule> getAllVehicules(){
        ImmatriculationService.EmptyObject request =
                ImmatriculationService.EmptyObject.newBuilder().build();
        ImmatriculationService.VehiculesList response =
                immatriculationGrpcService.getAllVehicule(request);
        return response.getVehiculesList().stream().map(mappers::fromGrpcToVehicule).collect(Collectors.toList());
    }

    public List<Radar> getAllRadars(){
        RadarService.EmptyRadar request = RadarService.EmptyRadar.newBuilder().build();
        RadarService.RadarsList response = radarGrpcService.getAllRadars(request);
        return response.getRadarsListList().stream().map(mappers::fromGrpcToRadar).collect(Collectors.toList());
    }

    public Infraction generateInfraction(String matricule, double vitesseVehicule, Radar radar){
        RadarService.GenerateInfractionRequest request = RadarService.GenerateInfractionRequest.newBuilder()
                .setMatricule(matricule)
                .setRadar(mappers.fromRadarToGrpc(radar))
                .setVitesseVehicule(vitesseVehicule)
                .build();
        RadarService.InfractionResponse response = radarGrpcService.generateInfraction(request);
        return mappers.fromGrpcToInfraction(response);
    }
}
