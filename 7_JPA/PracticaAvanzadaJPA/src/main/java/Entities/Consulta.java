package Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity
@Table(name = "consultas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Consulta extends Base {
    private LocalDate fecha;
    private String diagnostico;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Medico medico;
}
