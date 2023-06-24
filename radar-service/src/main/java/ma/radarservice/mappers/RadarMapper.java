package ma.radarservice.mappers;

import lombok.AllArgsConstructor;
import ma.radarservice.dto.RadarRequest;
import ma.radarservice.entities.Radar;
import ma.radarservice.web.grpc.stub.RadarService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RadarMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public Radar from(RadarRequest radarRequest){
        return modelMapper.map(radarRequest, Radar.class);
    }

    public RadarService.RadarsList fromRadarstoGrpc (List<Radar> radarList){
        return modelMapper.map(radarList, RadarService.RadarsList.Builder.class).build();
    }

    public RadarService.RadarResponse fromRadarToGrpc (Radar radar){
        return modelMapper.map(radar, RadarService.RadarResponse.Builder.class).build();
    }

    public RadarRequest fromGrpcToRadarRequest (RadarService.RadarRequest radarRequest){
        return modelMapper.map(radarRequest, RadarRequest.class);
    }
}
