package ma.radarservice.mappers;

import lombok.AllArgsConstructor;
import ma.radarservice.dto.RadarRequest;
import ma.radarservice.entities.Radar;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RadarMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public Radar from(RadarRequest radarRequest){
        return modelMapper.map(radarRequest, Radar.class);
    }
}
