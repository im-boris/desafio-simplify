package com.br.backend.simplify.comum;

import java.util.ArrayList;
import java.util.List;

public interface Builder<ENTITY, DTO> {

    ENTITY toEntity(DTO dto);

    DTO toDTO(ENTITY entity);

    default List<ENTITY> toEntity(List<DTO> object) {
        List<ENTITY> entidades = new ArrayList<>();
        for (DTO dto : object) {
            entidades.add(toEntity(dto));
        }
        return entidades;
    }

    default List<DTO> toDTO(List<ENTITY> object) {
        List<DTO> dtos = new ArrayList<>();
        for (ENTITY entidade : object) {
            dtos.add(toDTO(entidade));
        }
        return dtos;
    }

}
