package com.diego.everis.persistence.mapper;

import com.diego.everis.domain.model.model.Manager;
import com.diego.everis.persistence.entity.Gestor;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ManagerMapper {
    @Mappings({
            @Mapping(source = "primerNombre", target = "firstName"),
            @Mapping(source = "segundoNombre", target = "secondName"),
            @Mapping(source = "primerApellido", target = "firstLastname"),
            @Mapping(source = "segundoApellido", target = "secondLastname"),
            @Mapping(source = "correoElectronico", target = "email"),
            @Mapping(source = "telefono", target = "tel")
    })
    Manager toManager(Gestor gestor);
    List<Manager> toManagers(List<Gestor> gestores);
}
