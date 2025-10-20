package com.ge.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * La anotación @NoRepositoryBean le dice a Spring Data JPA que **NO debe crear una instancia**
 * (un bean) de esta interfaz en el contexto de Spring.
 *
 * 🔍 Es decir: esta interfaz no representa directamente un repositorio que Spring
 * pueda usar para acceder a la base de datos.
 *
 * En cambio, sirve como una **interfaz base o genérica**, que otras interfaces
 * pueden extender para heredar su funcionalidad.
 *
 * Por ejemplo:
 *   public interface DniRepository extends BaseRepository<Dni, Long> {}
 *
 * En ese caso, Spring SÍ creará un bean para DniRepository (porque no tiene @NoRepositoryBean),
 * y ese bean heredará todo lo definido en BaseRepository.
 *
 * 🧠 Sin esta anotación, Spring intentaría crear un bean de BaseRepository,
 * lo que generaría un error, porque BaseRepository no está asociada a ninguna
 * entidad concreta (usa tipos genéricos E e ID).
 */
@NoRepositoryBean
public interface BaseRepository<E, ID> extends JpaRepository<E, ID> {

}
