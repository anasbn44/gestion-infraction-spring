package ma.radarservice.mappers;

import lombok.AllArgsConstructor;
import ma.infractionservice.web.soap.InfractionRequest;
import ma.radarservice.dto.RadarRequest;
import ma.radarservice.entities.Infraction;
import ma.radarservice.entities.Radar;
import ma.radarservice.entities.Vehicule;
import ma.radarservice.web.grpc.stub.RadarService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RadarMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public Radar from(RadarRequest radarRequest){
        return modelMapper.map(radarRequest, Radar.class);
    }

    public RadarService.RadarsList fromRadarstoGrpc (List<Radar> radarList){
        List<RadarService.RadarResponse> radarResponses =
                radarList.stream().map(this::fromRadarToGrpc).collect(Collectors.toList());
        RadarService.RadarsList radarsList = RadarService.RadarsList.newBuilder()
                .addAllRadarsList(radarResponses)
                .build();
        return radarsList;
    }

    public RadarService.RadarResponse fromRadarToGrpc (Radar radar){
        return modelMapper.map(radar, RadarService.RadarResponse.Builder.class).build();
    }

    public RadarRequest fromGrpcToRadarRequest (RadarService.RadarRequest radarRequest){
        return modelMapper.map(radarRequest, RadarRequest.class);
    }

    public InfractionRequest fromInfractionRequestToSoap(ma.radarservice.dto.InfractionRequest infractionRequest){
        return modelMapper.map(infractionRequest, InfractionRequest.class);
    }

    public Infraction fromSoapToInfraction(ma.infractionservice.web.soap.Infraction infraction){
        return modelMapper.map(infraction, Infraction.class);
    }

    public Vehicule fromSoapToVehicule(ma.enset.immatriculationservice.web.soap.Vehicule vehicule){
        return modelMapper.map(vehicule, Vehicule.class);
    }
}
