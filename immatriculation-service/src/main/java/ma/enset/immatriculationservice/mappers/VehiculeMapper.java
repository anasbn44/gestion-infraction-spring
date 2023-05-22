package ma.enset.immatriculationservice.mappers;

import ma.enset.immatriculationservice.dto.VehiculeRequestDto;
import ma.enset.immatriculationservice.dto.VehiculeResponseDto;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class VehiculeMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public VehiculeResponseDto from(Vehicule vehicule){
        return modelMapper.map(vehicule, VehiculeResponseDto.class);
    }

    public Vehicule to(VehiculeRequestDto vehicule){
        return modelMapper.map(vehicule, Vehicule.class);
    }
    public Vehicule toGrpc(ImmatriculationService.Vehicule vehicule){
        return modelMapper.map(vehicule, Vehicule.class);
    }
    public ImmatriculationService.Vehicule fromGrpc(Vehicule vehicule){
        return modelMapper.map(vehicule, ImmatriculationService.Vehicule.class);
    }

}
