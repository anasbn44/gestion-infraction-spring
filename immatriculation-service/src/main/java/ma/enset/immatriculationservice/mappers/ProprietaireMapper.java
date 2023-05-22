package ma.enset.immatriculationservice.mappers;

import ma.enset.immatriculationservice.dto.ProprietaireRequestDto;
import ma.enset.immatriculationservice.dto.ProprietaireResponseDto;
import ma.enset.immatriculationservice.dto.VehiculeRequestDto;
import ma.enset.immatriculationservice.dto.VehiculeResponseDto;
import ma.enset.immatriculationservice.entities.Proprietaire;
import ma.enset.immatriculationservice.entities.Vehicule;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProprietaireMapper {

    private ModelMapper modelMapper = new ModelMapper();

    public ProprietaireResponseDto from(Proprietaire proprietaire){
        return modelMapper.map(proprietaire, ProprietaireResponseDto.class);
    }

    public Proprietaire to(ProprietaireRequestDto proprietaireRequestDto){
        return modelMapper.map(proprietaireRequestDto, Proprietaire.class);
    }
}
