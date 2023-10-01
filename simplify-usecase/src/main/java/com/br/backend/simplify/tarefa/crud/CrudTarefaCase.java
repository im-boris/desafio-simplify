package com.br.backend.simplify.tarefa.crud;

import com.br.backend.simplify.adapters.tarefa.cases.ICRUDTarefaCase;
import com.br.backend.simplify.entidade.Tarefa;
import com.br.backend.simplify.pojo.negocio.tarefa.TarefaDTO;
import com.br.backend.simplify.adapters.tarefa.builder.ITarefaBuilder;
import com.br.backend.simplify.adapters.tarefa.repository.ITarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CrudTarefaCase implements ICRUDTarefaCase {


    @Autowired
    private ITarefaRepository repository;

    @Autowired
    private ITarefaBuilder builder;


    @Override
    public TarefaDTO cadastra(TarefaDTO tarefa) {
        return builder.toDTO(repository.save(builder.toEntity(tarefa)));
    }

    @Override
    public List<TarefaDTO> buscaTodos() {
        return builder.toDTO(repository.findAll());
    }

    @Override
    public TarefaDTO busca(Long id) {
        return builder.toDTO(repository.findEntidadeByID(id));
    }

    @Override
    public TarefaDTO altera(TarefaDTO dto, Long id) {
        Tarefa tarefa = repository.findEntidadeByID(id);

        if(dto.getNome() != null) {
            tarefa.setNome(dto.getNome());
        }

        if(dto.getDescricao() != null) {
            tarefa.setDescricao(dto.getDescricao());
        }

        if(dto.getRealizado() != null) {
            tarefa.setRealizado(dto.getRealizado());
        }

        if(dto.getPrioridade() != null) {
            tarefa.setPrioridade(dto.getPrioridade());
        }

        return builder.toDTO(repository.save(tarefa));
    }

    @Override
    public TarefaDTO deleta(Long id) {
        TarefaDTO dto = builder.toDTO(repository.findEntidadeByID(id));
        repository.deleteById(id);
        return dto;
    }

}
