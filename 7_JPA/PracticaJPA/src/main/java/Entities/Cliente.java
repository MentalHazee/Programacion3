package Entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "pedidos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int edad;

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
