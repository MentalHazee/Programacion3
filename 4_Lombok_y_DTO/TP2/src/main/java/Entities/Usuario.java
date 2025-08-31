package Entities;

import lombok.*;

@Data
@Builder

public class Usuario {
    private int id;
    private String nombre;
    private String email;
}
