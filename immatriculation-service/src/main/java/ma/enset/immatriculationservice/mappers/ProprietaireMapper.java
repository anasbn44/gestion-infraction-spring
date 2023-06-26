package ma.enset.immatriculationservice.mappers;

import ma.enset.immatriculationservice.dto.ProprietaireRequestDto;
import ma.enset.immatriculationservice.dto.ProprietaireResponseDto;
import ma.enset.immatriculationservice.dto.VehiculeRequestDto;
import ma.enset.immatriculationservice.dto.VehiculeResponseDto;
import ma.enset.immatriculationservice.entities.Proprietaire;
import ma.enset.immatriculationservice.entities.Vehicule;
import ma.enset.immatriculationservice.web.grpc.stub.ImmatriculationService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProprietaireMapper {

    private ModelMapper modelMapper = new ModelMapper();

    public ProprietaireResponseDto from(Proprietaire proprietaire){
        return modelMapper.map(proprietaire, ProprietaireResponseDto.class);
    }

    public Proprietaire fromResponse(ProprietaireResponseDto responseDto){
        return modelMapper.map(responseDto, Proprietaire.class);
    }

    public Proprietaire to(ProprietaireRequestDto proprietaireRequestDto){
        return modelMapper.map(proprietaireRequestDto, Proprietaire.class);
    }

    public ImmatriculationService.ProprietaireResponse fromResponseToGrpc(ProprietaireResponseDto proprietaire){
        return modelMapper.map(proprietaire, ImmatriculationService.ProprietaireResponse.Builder.class).build();
    }

    public ProprietaireRequestDto toRequestFromGrpc (ImmatriculationService.ProprietaireRequest proprietaire){
        return modelMapper.map(proprietaire, ProprietaireRequestDto.class);
    }
}
