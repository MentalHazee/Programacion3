package com.ge.relaciones.entity.dto.mapper;

import com.ge.relaciones.entity.Dni;
import com.ge.relaciones.entity.dto.dni.DniCreate;
import com.ge.relaciones.entity.dto.dni.DniDto;

public class DniMapper {
    public static Dni toEntity (DniCreate dniDto){
        Dni dni = new Dni();
        dni.setNombre(dniDto.nombre());
        dni.setNumero(dniDto.numero());
        dni.setFechaVencimiento(dni.getFechaVencimiento());
        dni.setFoto(FotoMapper.toEntity(dniDto.foto()));
        return dni;
    }

    public static DniDto toDto(Dni dni){
        return new DniDto(
                dni.getId(),
                dni.getNombre(),
                dni.getNumero(),
                dni.getFechaCreacion(),
                dni.getFechaVencimiento(),
                FotoMapper.toDto(dni.getFoto())
        );
    }
}
