package Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

public class Base {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Builder.Default
    private Boolean eliminado = Boolean.FALSE;

    public void eliminar(){
        this.eliminado = true;
    }

}
