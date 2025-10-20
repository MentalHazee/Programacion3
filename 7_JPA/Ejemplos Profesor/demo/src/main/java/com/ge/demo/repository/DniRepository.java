package com.ge.demo.repository;

import com.ge.demo.entities.Dni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DniRepository  extends BaseRepository<Dni,Long> {
}
