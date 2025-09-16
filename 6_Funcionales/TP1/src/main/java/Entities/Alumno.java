package Entities;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Alumno {
    private String nombre;
    private double nota;
    private String curso;
}
