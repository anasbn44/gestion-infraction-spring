package ma.infractionservice.mappers;

import ma.infractionservice.entities.Infraction;
import ma.infractionservice.web.grpc.stub.InfractionSefvice;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class InfractionMappers {
    private ModelMapper modelMapper = new ModelMapper();

    public InfractionSefvice.InfractionResponse from (Infraction infraction){
        return modelMapper.map(infraction, InfractionSefvice.InfractionResponse.class);
    }

    public Infraction to (InfractionSefvice.InfractionRequest infraction){
        return modelMapper.map(infraction, Infraction.class);
    }
}
