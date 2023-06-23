package ma.radarservice.web;

import lombok.AllArgsConstructor;
import ma.radarservice.dto.RadarRequest;
import ma.radarservice.entities.Radar;
import ma.radarservice.services.RadarService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class RadarGraphqlController {
    private RadarService radarService;


    @QueryMapping
    public List<Radar> getAllRadars(){
        return radarService.getAllRadars();
    }
    @QueryMapping
    public Radar getRadarById(@Argument Long id){
        return radarService.getRadarById(id);
    }
    @MutationMapping
    public Radar saveRadar(@Argument RadarRequest radar){
        return radarService.saveRadar(radar);
    }
    @MutationMapping
    public Radar updateRadar(@Argument RadarRequest radar, @Argument Long id){
        return radarService.updateRadar(id, radar);
    }
    @MutationMapping
    public void deleteRadar(@Argument Long id){
        radarService.deleteRadar(id);
    }
}
