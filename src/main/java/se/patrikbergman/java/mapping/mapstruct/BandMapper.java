package se.patrikbergman.java.mapping.mapstruct;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BandMapper {

    BandMapper INSTANCE = Mappers.getMapper(BandMapper.class);

    @Mapping(source = "description", target="biography")
    BandDto bandToBandDto(Band source);

    @InheritInverseConfiguration
    Band targetToSource(BandDto target);
}
