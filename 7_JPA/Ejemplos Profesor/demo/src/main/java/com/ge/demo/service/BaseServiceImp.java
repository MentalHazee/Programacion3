package com.ge.demo.service;

import com.ge.demo.entities.dtos.Mapper.BaseMapper;
import com.ge.demo.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class BaseServiceImp <E,D,DC,DE, ID> implements BaseService<D,DC,DE, ID>{

    @Autowired
    BaseRepository<E,ID> baseRepository;

    @Autowired
    BaseMapper<E,D,DC> baseMapper;

    @Override
    public D create(DC dni) {
        E e = baseMapper.toEntity(dni);
        e = baseRepository.save(e);
        return baseMapper.toDto(e);
    }


    @Override
    public List<D> findAll() {
        return List.of();
    }

    @Override
    public D findById(ID id) {
        return null;
    }

    @Override
    public void delete(ID id) {

    }

}
