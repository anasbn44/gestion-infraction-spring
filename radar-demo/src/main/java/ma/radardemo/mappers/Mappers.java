package ma.radardemo.mappers;

import ma.radardemo.entities.Infraction;
import ma.radardemo.entities.Radar;
import ma.radardemo.entities.Vehicule;
import ma.radardemo.stub.ImmatriculationService;
import ma.radardemo.stub.RadarService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Mappers {
    private ModelMapper modelMapper = new ModelMapper();

    public Vehicule fromGrpcToVehicule(ImmatriculationService.VehiculeResponse vehicule){
        return modelMapper.map(vehicule, Vehicule.class);
    }

    public Radar fromGrpcToRadar (RadarService.RadarResponse radar){
        return modelMapper.map(radar, Radar.class);
    }

    public RadarService.RadarResponse fromRadarToGrpc (Radar radar){
        return modelMapper.map(radar, RadarService.RadarResponse.Builder.class).build();
    }


    public Infraction fromGrpcToInfraction(RadarService.InfractionResponse infraction){
        return modelMapper.map(infraction, Infraction.class);
    }
}
