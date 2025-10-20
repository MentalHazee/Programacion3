package com.example.Parcial2Spring.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String matricula;

    @ManyToMany(mappedBy = "estudiantes")
    private Set<Curso> cursos;
}
