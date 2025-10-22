package com.example.Parcial2Spring.entities.dto;

import lombok.Data;

import java.util.Set;

@Data

public class CursoDto {
    private Long id;
    private String nombre;
    private String profesorNombre;
    private Set<String> estudiantesNombres;
}
