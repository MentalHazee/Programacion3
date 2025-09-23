package Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pedidos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pais;
    private String provincia;
    private String calle;

    public Direccion(String pais, String provincia, String calle) {
        this.pais = pais;
        this.provincia = provincia;
        this.calle = calle;
    }
}
