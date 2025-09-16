package Entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;
}
