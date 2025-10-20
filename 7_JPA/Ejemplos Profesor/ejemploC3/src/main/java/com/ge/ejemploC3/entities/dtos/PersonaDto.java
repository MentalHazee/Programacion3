package com.ge.ejemploC3.entities.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
//DTO de respuesta del sistema, solo contiene los atributos que queremos que sean visibles
public class PersonaDto {
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
}
