package Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

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
}
