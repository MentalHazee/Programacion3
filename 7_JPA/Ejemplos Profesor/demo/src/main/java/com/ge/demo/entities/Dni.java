package com.ge.demo.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@SuperBuilder
public class Dni extends Base{

    private String nombre;
    private int numero;

    @Builder.Default
    private String fechaCreacion = LocalDate.now().toString();
    private String fechaVencimiento;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Foto foto;
}
