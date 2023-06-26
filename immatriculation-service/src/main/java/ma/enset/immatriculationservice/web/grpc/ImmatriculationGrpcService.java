package ma.enset.immatriculationservice.web.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.enset.immatriculationservice.dto.ProprietaireResponseDto;
import ma.enset.immatriculationservice.dto.VehiculeResponseDto;
import ma.enset.immatriculationservice.mappers.ProprietaireMapper;
import ma.enset.immatriculationservice.mappers.VehiculeMapper;
import ma.enset.immatriculationservice.services.ProprietaireService;
import ma.enset.immatriculationservice.services.VehiculeService;
import ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationGrpcServiceGrpc;
import ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
@AllArgsConstructor
public class ImmatriculationGrpcService extends ImmatriculationGrpcServiceGrpc.ImmatriculationGrpcServiceImplBase {
    private VehiculeMapper vehiculeMapper;
    private VehiculeService vehiculeService;
    private ProprietaireService proprietaireService;
    private ProprietaireMapper proprietaireMapper;

    @Override
    public void getAllProprietaire(ImmatriculationService.emptyObject request, StreamObserver<ImmatriculationService.ProprietairesList> responseObserver) {
        List<ProprietaireResponseDto> proprietaires = proprietaireService.getAllProprietaires();
        List<ImmatriculationService.ProprietaireResponse> responseList = proprietaires.stream().map(proprietaireMapper::fromResponseToGrpc).collect(Collectors.toList());
        ImmatriculationService.ProprietairesList reponse = ImmatriculationService.ProprietairesList.newBuilder()
                .addAllProprietaires(responseList)
                .build();
        responseObserver.onNext(reponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getProprietaireById(ImmatriculationService.ProprietaireIdRequest request, StreamObserver<ImmatriculationService.ProprietaireResponse> responseObserver) {
        ProprietaireResponseDto response = proprietaireService.getProprietaireById(request.getId());
        responseObserver.onNext(proprietaireMapper.fromResponseToGrpc(response));
        responseObserver.onCompleted();
    }

    @Override
    public void saveProprietaire(ImmatriculationService.ProprietaireRequest request, StreamObserver<ImmatriculationService.ProprietaireResponse> responseObserver) {
        ProprietaireResponseDto response = proprietaireService.saveProprietaire(proprietaireMapper.toRequestFromGrpc(request));
        responseObserver.onNext(proprietaireMapper.fromResponseToGrpc(response));
        responseObserver.onCompleted();
    }

    @Override
    public void deletProprietaire(ImmatriculationService.ProprietaireIdRequest request, StreamObserver<ImmatriculationService.emptyObject> responseObserver) {
        proprietaireService.deleteProprietaire(request.getId());
        responseObserver.onCompleted();
    }

    @Override
    public void getAllVehicule(ImmatriculationService.emptyObject request, StreamObserver<ImmatriculationService.VehiculesList> responseObserver) {
        List<VehiculeResponseDto> vehicules = vehiculeService.getAllVehicules();
        List<ImmatriculationService.VehiculeResponse> vehiculeResponseList = vehicules.stream().map(vehiculeMapper::fromResponseToGrpc).collect(Collectors.toList());
        ImmatriculationService.VehiculesList response = ImmatriculationService.VehiculesList.newBuilder()
                .addAllVehicules(vehiculeResponseList)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getVehiculeById(ImmatriculationService.VehiculeIdRequest request, StreamObserver<ImmatriculationService.VehiculeResponse> responseObserver) {
        VehiculeResponseDto response = vehiculeService.getVehiculeById(request.getId());
        responseObserver.onNext(vehiculeMapper.fromResponseToGrpc(response));
        responseObserver.onCompleted();
    }

    @Override
    public void saveVehicule(ImmatriculationService.VehiculeRequest request, StreamObserver<ImmatriculationService.VehiculeResponse> responseObserver) {
        VehiculeResponseDto response = vehiculeService.saveVehicule(vehiculeMapper.toRequestFromGrpc(request));
        responseObserver.onNext(vehiculeMapper.fromResponseToGrpc(response));
        responseObserver.onCompleted();
    }

    @Override
    public void deletVehicule(ImmatriculationService.VehiculeIdRequest request, StreamObserver<ImmatriculationService.emptyObject> responseObserver) {
        vehiculeService.deleteVehicule(request.getId());
        responseObserver.onCompleted();
    }

    @Override
    public void getVehiculeByMatricule(ImmatriculationService.Matricule request, StreamObserver<ImmatriculationService.VehiculeResponse> responseObserver) {
        VehiculeResponseDto response = vehiculeService.getVehiculeByMatricule(request.getMatricule());
        responseObserver.onNext(vehiculeMapper.fromResponseToGrpc(response));
        responseObserver.onCompleted();
    }

    @Override
    public void getProprietaireOfVehicule(ImmatriculationService.VehiculeIdRequest request, StreamObserver<ImmatriculationService.ProprietaireResponse> responseObserver) {
        ProprietaireResponseDto response = vehiculeService.getProprietaireOfVehicule(request.getId());
        responseObserver.onNext(proprietaireMapper.fromResponseToGrpc(response));
        responseObserver.onCompleted();
    }
}
