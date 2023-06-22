package ma.infractionservice.web.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import ma.infractionservice.entities.Infraction;
import ma.infractionservice.mappers.InfractionMappers;
import ma.infractionservice.services.InfractionService;
import ma.infractionservice.web.grpc.stub.InfractionGrpcServiceGrpc;
import ma.infractionservice.web.grpc.stub.InfractionSefvice;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@AllArgsConstructor
public class InfractionGrpcService extends InfractionGrpcServiceGrpc.InfractionGrpcServiceImplBase {
    private InfractionService infractionService;
    private InfractionMappers infractionMappers;

    @Override
    public void getAllInfractions(InfractionSefvice.voidInfractioRequest request, StreamObserver<InfractionSefvice.InfrationsListResponse> responseObserver) {
        responseObserver.onNext(infractionMappers.grpcAllResponse(infractionService.getAllInfractions()));
        responseObserver.onCompleted();
    }

    @Override
    public void getInfractionById(InfractionSefvice.InfractionIdRequest request, StreamObserver<InfractionSefvice.InfractionResponse> responseObserver) {
        responseObserver.onNext(infractionMappers.from(infractionService.getInfractionById(request.getId())));
        responseObserver.onCompleted();
    }

    @Override
    public void saveInfraction(InfractionSefvice.InfractionRequest request, StreamObserver<InfractionSefvice.InfractionResponse> responseObserver) {
        Infraction infraction = infractionService.saveInfraction(infractionMappers.fromGrpcToRequest(request));
        responseObserver.onNext(infractionMappers.from(infraction));
        responseObserver.onCompleted();
    }

    @Override
    public void deleteInfraction(InfractionSefvice.InfractionIdRequest request, StreamObserver<InfractionSefvice.voidInfractioRequest> responseObserver) {
        infractionService.deleteInfraction(request.getId());
        responseObserver.onCompleted();
    }
}
