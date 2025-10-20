package com.ge.demo.service;

import com.ge.demo.entities.Foto;
import com.ge.demo.entities.dtos.foto.FotoCreate;
import com.ge.demo.entities.dtos.foto.FotoDto;
import com.ge.demo.entities.dtos.foto.FotoEdit;

import java.util.List;

public interface FotoService extends BaseService<FotoDto, FotoCreate,FotoEdit, Long> {

}
