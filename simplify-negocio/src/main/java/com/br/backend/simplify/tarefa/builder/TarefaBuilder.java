package com.br.backend.simplify.tarefa.builder;

import com.br.backend.simplify.entidade.Tarefa;
import com.br.backend.simplify.pojo.negocio.tarefa.TarefaDTO;
import com.br.backend.simplify.adapters.tarefa.builder.ITarefaBuilder;
import org.springframework.stereotype.Component;

@Component
public class TarefaBuilder implements ITarefaBuilder {

    @Override
    public Tarefa toEntity(TarefaDTO dto) {
        Tarefa entity = new Tarefa();
        entity.setNome(dto.getNome());
        entity.setDescricao(dto.getDescricao());
        entity.setRealizado(dto.getRealizado());
        entity.setPrioridade(dto.getPrioridade());
        return entity;
    }

    @Override
    public TarefaDTO toDTO(Tarefa entity) {
        TarefaDTO dto = new TarefaDTO();
        dto.setId(entity.getId());
        dto.setNome(entity.getNome());
        dto.setDescricao(entity.getDescricao());
        dto.setRealizado(entity.getRealizado());
        dto.setPrioridade(entity.getPrioridade());
        return dto;
    }

}
