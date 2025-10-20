package com.ge.ejemploC3.entities.dtos;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
//DTO con los parametros definidos como editables en la entidad
public class PersonaEdit {
    private int edad;
    private String contrasena;
}
