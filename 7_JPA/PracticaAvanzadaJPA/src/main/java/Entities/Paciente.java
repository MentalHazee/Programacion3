package Entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity
@Table(name = "pacientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Paciente extends Base{
    private String nombre;
    private String aprellido;
    private int edad;
    private int dni;
    private String obraSocial;
    private LocalDate fechaNacimiento;
    private char sexo;
}
