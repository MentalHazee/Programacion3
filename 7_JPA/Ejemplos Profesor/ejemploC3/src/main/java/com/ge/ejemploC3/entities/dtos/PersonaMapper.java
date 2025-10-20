package com.ge.ejemploC3.entities.dtos;

import com.ge.ejemploC3.entities.Persona;

public class PersonaMapper {

    /**
     * Convierte una entidad Persona en un objeto PersonaDto.
     *
     * @param p Entidad Persona que proviene de la base de datos.
     * @return PersonaDto con solo los campos necesarios para exposición.
     */
    public static PersonaDto toTDO(Persona p){
        PersonaDto personaDto = new PersonaDto.PersonaDtoBuilder()
                .id(p.getId())
                .edad(p.getEdad())
                .nombre(p.getNombre())
                .apellido(p.getApellido())
                .build();
        return personaDto;
    }

    /**
     * Convierte un objeto PersonaCreate en una entidad
     * Persona lista para ser persistida en la base de datos.
     *
     * @param pc DTO de creación que contiene los datos enviados desde el cliente.
     * @return Entidad Persona con los valores asignados desde el DTO.
     */
    public static Persona toEntity(PersonaCreate pc){
        Persona p = new Persona();
                p.setNombre(pc.getNombre());
                p.setApellido(pc.getApellido());
                p.setEdad(pc.getEdad());
                p.setContrasena(pc.getContrasena());
        return p;
    }
}
