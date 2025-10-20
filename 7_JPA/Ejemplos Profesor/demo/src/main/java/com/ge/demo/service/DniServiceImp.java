package com.ge.demo.service;

import com.ge.demo.entities.Dni;
import com.ge.demo.entities.dtos.dni.DniCreate;
import com.ge.demo.entities.dtos.dni.DniDto;
import com.ge.demo.entities.dtos.dni.DniEdit;
import org.springframework.stereotype.Service;


@Service
public class DniServiceImp extends BaseServiceImp<Dni, DniDto,DniCreate, DniEdit, Long> implements DniService{


    @Override
    public DniDto edit(DniEdit dni) {
        return null;
    }
}
