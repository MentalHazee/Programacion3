package Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "medicamentos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Medicamento extends Base{
    private String nombre;
    private String droga;
    private int pesoEnGramos;

    @ManyToMany
    @Builder.Default
    private List<Paciente> pacientes = new ArrayList<>();
}
