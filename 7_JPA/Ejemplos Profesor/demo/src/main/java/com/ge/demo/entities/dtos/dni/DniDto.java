package com.ge.demo.entities.dtos.dni;

import com.ge.demo.entities.dtos.foto.FotoDto;

public record DniDto(
        Long id,
        String nombre,
        String fechaCreacion,
        String fechaVencimiento,
        FotoDto foto
) {
}
