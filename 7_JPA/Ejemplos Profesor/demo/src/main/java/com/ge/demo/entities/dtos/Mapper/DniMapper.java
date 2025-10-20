package com.ge.demo.entities.dtos.Mapper;

import com.ge.demo.entities.Dni;
import com.ge.demo.entities.dtos.dni.DniCreate;
import com.ge.demo.entities.dtos.dni.DniDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * La anotación @Component le indica a Spring que esta clase es un "componente" del sistema,
 * es decir, que debe ser detectada automáticamente por el escaneo de componentes
 * (component scanning) y registrada como un BEAN en el contexto de Spring.
 *
 * En otras palabras, al usar @Component, Spring puede crear una instancia de esta clase
 * automáticamente y gestionarla (inyectarla con @Autowired en otras partes del código).
 */
@Component
public class DniMapper implements BaseMapper<Dni, DniDto, DniCreate> {

    /**
     * @Autowired le dice a Spring que debe inyectar automáticamente una instancia
     * del tipo FotoMapper, que también debe estar anotada con @Component o @Service
     * (es decir, también debe ser un bean gestionado por Spring).
     *
     * Si FotoMapper no tiene @Component, Spring no sabrá cómo crearla y lanzará un error
     * diciendo que no se encontró el bean de tipo FotoMapper.
     */
    @Autowired
    private FotoMapper fotoMapper;

    /**
     * Convierte un objeto DniCreate (normalmente un DTO usado para recibir datos)
     * en una entidad Dni (la que se usa para persistir en la base de datos).
     */
    @Override
    public Dni toEntity(DniCreate dniC) {
        Dni dni = new Dni();
        dni.setNumero(dniC.numero());
        dni.setNombre(dniC.nombre());
        dni.setFechaVencimiento(dniC.fechaVencimiento());
        dni.setFoto(fotoMapper.toEntity(dniC.foto())); // se usa el mapper inyectado

        return dni;
    }

    /**
     * Convierte una entidad Dni en un objeto DniDto,
     * que normalmente se utiliza para enviar datos al cliente (por ejemplo, en una API REST).
     */
    @Override
    public DniDto toDto(Dni dni) {
        DniDto dniD = new DniDto(
                dni.getId(),
                dni.getNombre(),
                dni.getFechaCreacion(),
                dni.getFechaVencimiento(),
                fotoMapper.toDto(dni.getFoto()) // se vuelve a usar el mapper inyectado
        );
        return dniD;
    }
}
