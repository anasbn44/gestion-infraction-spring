package ma.radarservice.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import ma.radarservice.dto.RadarRequest;
import ma.radarservice.entities.Radar;
import ma.radarservice.services.RadarService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService
@AllArgsConstructor
public class RadarSoapController {
    private RadarService radarService;

    @WebMethod
    public List<Radar> getAllRadars(){
        return radarService.getAllRadars();
    }
    @WebMethod
    public Radar getRadarById(@WebParam(name = "id") Long id){
        return radarService.getRadarById(id);
    }
    @WebMethod
    public Radar saveRadar(@WebParam(name = "radar") RadarRequest radar){
        return radarService.saveRadar(radar);
    }
    @WebMethod
    public Radar updateRadar(@WebParam(name = "radar") RadarRequest radar, @WebParam(name = "id") Long id){
        return radarService.updateRadar(id, radar);
    }
    @WebMethod
    public void deleteRadar(@WebParam(name = "id") Long id){
        radarService.deleteRadar(id);
    }
}
