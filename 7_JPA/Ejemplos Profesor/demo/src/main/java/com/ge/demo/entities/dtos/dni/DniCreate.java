package com.ge.demo.entities.dtos.dni;

import com.ge.demo.entities.dtos.foto.FotoCreate;

public record DniCreate(
        String nombre,
        int numero,
        String fechaVencimiento,
        FotoCreate foto
) {
}
