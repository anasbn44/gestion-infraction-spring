package ma.enset.immatriculationservice.web.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.enset.immatriculationservice.mappers.VehiculeMapper;
import ma.enset.immatriculationservice.services.VehiculeService;
import ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationGrpcServiceGrpc;
import ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@AllArgsConstructor
public class ImmatriculationGrpcService extends ImmatriculationGrpcServiceGrpc.ImmatriculationGrpcServiceImplBase {
    private VehiculeMapper vehiculeMapper;
    private VehiculeService vehiculeService;

    @Override
    public void getVehiculeByMatricule(ImmatriculationService.Matricule request, StreamObserver<ImmatriculationService.Vehicule> responseObserver) {
        ImmatriculationService.Vehicule vehiculeGrpc = vehiculeMapper.fromResponseToGrpc(vehiculeService.getVehiculeByMatricule(request.getMatricule()));

        responseObserver.onNext(vehiculeGrpc);
        responseObserver.onCompleted();
    }
}
