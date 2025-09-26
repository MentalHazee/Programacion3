package Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "medicos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString

public class Medico extends Base{
    private String nombre;
    private String apellido;
    private int edad;
    private String especialidad;
    private String matricula;

    @OneToMany
    @Builder.Default
    private List<Consulta> consultas = new ArrayList<>();
}
