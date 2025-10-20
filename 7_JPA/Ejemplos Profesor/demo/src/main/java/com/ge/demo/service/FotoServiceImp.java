package com.ge.demo.service;

import com.ge.demo.entities.Foto;
import com.ge.demo.entities.dtos.foto.FotoCreate;
import com.ge.demo.entities.dtos.foto.FotoDto;
import com.ge.demo.entities.dtos.foto.FotoEdit;
import org.springframework.stereotype.Service;

@Service
public class FotoServiceImp extends BaseServiceImp<Foto, FotoDto, FotoCreate, FotoEdit, Long> implements FotoService{

    @Override
    public FotoDto edit(FotoEdit dni) {
        return null;
    }
}
