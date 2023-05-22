package ma.enset.immatriculationservice.web.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.mappers.VehiculeMapper;
import ma.enset.immatriculationservice.repositories.VehiculeRepository;
import ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationGrpcServiceGrpc;
import ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
@Slf4j
@AllArgsConstructor
public class ImmatriculationGrpcService extends ImmatriculationGrpcServiceGrpc.ImmatriculationGrpcServiceImplBase {
    @Autowired
    private VehiculeRepository vehiculeRepository;
    @Autowired
    private VehiculeMapper vehiculeMapper;

    @Override
    public void getVehiculeByMatricule(ImmatriculationService.Matricule request, StreamObserver<ImmatriculationService.Vehicule> responseObserver) {
        String matricule = request.getMatricule();
        Vehicule vehicule = vehiculeRepository.findAll().stream().filter(v -> v.getMatricule().equals(matricule)).findAny().orElse(null);
        ImmatriculationService.Vehicule vehiculeGrpc = vehiculeMapper.fromGrpc(vehicule);
        responseObserver.onNext(vehiculeGrpc);
        responseObserver.onCompleted();
    }
}
