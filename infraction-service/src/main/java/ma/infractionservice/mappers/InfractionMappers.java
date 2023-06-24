package ma.infractionservice.mappers;

import ma.infractionservice.dto.InfractionRequest;
import ma.infractionservice.entities.Infraction;
import ma.infractionservice.web.grpc.stub.InfractionSefvice;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class InfractionMappers {
    private ModelMapper modelMapper = new ModelMapper();

    public Infraction fromRequest(InfractionRequest infractionRequest){
        return modelMapper.map(infractionRequest, Infraction.class);
    }

    public InfractionRequest fromGrpcToRequest(InfractionSefvice.InfractionRequest infractionRequest){
        return modelMapper.map(infractionRequest, InfractionRequest.class);
    }
    public InfractionSefvice.InfractionResponse from (Infraction infraction){
        return modelMapper.map(infraction, InfractionSefvice.InfractionResponse.Builder.class).build();
    }

    public Infraction to (InfractionSefvice.InfractionRequest infraction){
        return modelMapper.map(infraction, Infraction.class);
    }

    public InfractionSefvice.InfrationsListResponse grpcAllResponse(List<Infraction> infractions){
        List<InfractionSefvice.InfractionResponse> infractionResponses =
                infractions.stream().map(this::from).collect(Collectors.toList());
        InfractionSefvice.InfrationsListResponse infrationsListResponse =
                InfractionSefvice.InfrationsListResponse.newBuilder()
                .addAllInfraction(infractionResponses)
                .build();
        return infrationsListResponse;
    }
}
