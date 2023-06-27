package ma.radarservice.web.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import ma.radarservice.entities.Infraction;
import ma.radarservice.entities.Radar;
import ma.radarservice.mappers.RadarMapper;
import ma.radarservice.services.RadarService;
import ma.radarservice.web.grpc.stub.RadarGrpcServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@AllArgsConstructor
public class RadarGrpcService extends RadarGrpcServiceGrpc.RadarGrpcServiceImplBase {
    private RadarService radarService;
    private RadarMapper radarMapper;

    @Override
    public void getAllRadars(ma.radarservice.web.grpc.stub.RadarService.EmptyRadar request, StreamObserver<ma.radarservice.web.grpc.stub.RadarService.RadarsList> responseObserver) {
        responseObserver.onNext(radarMapper.fromRadarstoGrpc(radarService.getAllRadars()));
        responseObserver.onCompleted();
    }

    @Override
    public void getRadarById(ma.radarservice.web.grpc.stub.RadarService.RadarIdRequest request, StreamObserver<ma.radarservice.web.grpc.stub.RadarService.RadarResponse> responseObserver) {
        Radar radar = radarService.getRadarById(request.getId());
        responseObserver.onNext(radarMapper.fromRadarToGrpc(radar));
        responseObserver.onCompleted();
    }

    @Override
    public void saveRadar(ma.radarservice.web.grpc.stub.RadarService.RadarRequest request, StreamObserver<ma.radarservice.web.grpc.stub.RadarService.RadarResponse> responseObserver) {
        Radar radar = radarService.saveRadar(radarMapper.fromGrpcToRadarRequest(request));
        responseObserver.onNext(radarMapper.fromRadarToGrpc(radar));
        responseObserver.onCompleted();
    }

    @Override
    public void updateRadar(ma.radarservice.web.grpc.stub.RadarService.UpdateRadarRequest request, StreamObserver<ma.radarservice.web.grpc.stub.RadarService.RadarResponse> responseObserver) {
        Radar radar = radarService.updateRadar(request.getId(), radarMapper.fromGrpcToRadarRequest(request.getRadarRequest()));
        responseObserver.onNext(radarMapper.fromRadarToGrpc(radar));
        responseObserver.onCompleted();
    }

    @Override
    public void deleteRadar(ma.radarservice.web.grpc.stub.RadarService.RadarIdRequest request, StreamObserver<ma.radarservice.web.grpc.stub.RadarService.EmptyRadar> responseObserver) {
        radarService.deleteRadar(request.getId());
        responseObserver.onCompleted();
    }

    @Override
    public void generateInfraction(ma.radarservice.web.grpc.stub.RadarService.GenerateInfractionRequest request, StreamObserver<ma.radarservice.web.grpc.stub.RadarService.InfractionResponse> responseObserver) {
        Infraction infraction = radarService.generateInfraction(request.getMatricule(), radarMapper.fromGrpcToRadar(request.getRadar()), request.getVitesseVehicule());
        responseObserver.onNext(radarMapper.fromInfractionToGrpcResponse(infraction));
        responseObserver.onCompleted();
    }
}
