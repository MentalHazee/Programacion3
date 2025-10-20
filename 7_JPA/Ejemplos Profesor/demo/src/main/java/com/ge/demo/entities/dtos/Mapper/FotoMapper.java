package com.ge.demo.entities.dtos.Mapper;

import com.ge.demo.entities.Foto;
import com.ge.demo.entities.dtos.foto.FotoCreate;
import com.ge.demo.entities.dtos.foto.FotoDto;
import org.springframework.stereotype.Component;

@Component
public class FotoMapper implements BaseMapper<Foto, FotoDto, FotoCreate>{

    @Override
    public Foto toEntity(FotoCreate fc){
        Foto f = new Foto();
        f.setNombre(fc.nombre());
        f.setUrl(fc.url());
        return f;
    }

    @Override
    public FotoDto toDto(Foto f){
        FotoDto fDto = new FotoDto(
                f.getId(),
                f.getNombre(),
                f.getUrl());
        return fDto;
    }
}
