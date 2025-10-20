package com.ge.ejemploC3.entities.dtos;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
//DTO con los atributos minimos para crear una entidad
public class PersonaCreate {
    private String nombre;
    private String apellido;
    private int edad;
    private String contrasena;
    private Long domicilio_id;
}
