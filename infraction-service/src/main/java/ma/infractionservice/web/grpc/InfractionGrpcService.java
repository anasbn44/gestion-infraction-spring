package ma.infractionservice.web.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.infractionservice.entities.Infraction;
import ma.infractionservice.mappers.InfractionMappers;
import ma.infractionservice.repositories.InfractionRepository;
import ma.infractionservice.web.grpc.stub.InfractionGrpcServiceGrpc;
import ma.infractionservice.web.grpc.stub.InfractionSefvice;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
@Slf4j
@AllArgsConstructor
public class InfractionGrpcService extends InfractionGrpcServiceGrpc.InfractionGrpcServiceImplBase {
    @Autowired
    private InfractionRepository infractionRepository;
    @Autowired
    private InfractionMappers infractionMappers;

    @Override
    public void saveInfraction(InfractionSefvice.InfractionRequest request, StreamObserver<InfractionSefvice.InfractionResponse> responseObserver) {
        Infraction requestInfraction = infractionMappers.to(request);
        Infraction infraction = infractionRepository.save(requestInfraction);
        responseObserver.onNext(infractionMappers.from(infraction));
        responseObserver.onCompleted();
    }
}
