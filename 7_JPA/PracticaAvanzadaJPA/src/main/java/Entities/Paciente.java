package Entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pacientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString

public class Paciente extends Base{
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private String obraSocial;
    private LocalDate fechaNacimiento;
    private char sexo;

    @OneToMany
    @Builder.Default
    private List<Consulta> consultas = new ArrayList<>();

    @ManyToMany
    @Builder.Default
    private List<Medicamento> medicamentos = new ArrayList<>();

    @OneToOne
    private HistoriaClinica historiaClinica;
}
