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
@ToString

public class Consulta extends Base {
    private LocalDate fecha;
    private String diagnostico;

    @ManyToOne
    @JoinColumn(name = "PACIENTE_ID")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "MEDICO_ID")
    private Medico medico;
}
