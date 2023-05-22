package ma.radardemo.services;


import lombok.AllArgsConstructor;
import lombok.Data;
import ma.radardemo.entities.Infraction;
import ma.radardemo.entities.Radar;
import ma.radardemo.entities.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Data
@AllArgsConstructor
@Service
public class RestTempServices {
    private RestTemplate restTemplate;

    public Radar[] getAllRadars(){
        String url="http://localhost:8888/RADAR-MS/radars";
        Radar[] radar = restTemplate.getForObject(url, Radar[].class);
        return radar;
    }

    public Vehicule[] getAllVehicles(){
        String url="http://localhost:8888/IMMATRICULATION-MS/vehicles";
        Vehicule[] vehicles= restTemplate.getForObject(url,Vehicule[].class);
        return vehicles;
    }

    public boolean senInfraction(Infraction infraction){
        String url="http://localhost:8888/RADAR-MS/newInfraction";
        Boolean result = restTemplate.postForObject(url, infraction, Boolean.class);
        return result;
    }



}
