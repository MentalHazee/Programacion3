package com.ge.demo.entities.dtos.Mapper;

public interface BaseMapper <E,D,DC>{

    public E toEntity(DC d);
    public D toDto(E e);
}
