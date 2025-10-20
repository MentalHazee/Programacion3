package com.ge.demo.repository;

import com.ge.demo.entities.Foto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FotoRepository extends BaseRepository<Foto, Long> {
}
