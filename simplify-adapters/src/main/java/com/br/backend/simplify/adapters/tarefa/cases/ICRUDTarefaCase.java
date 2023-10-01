package com.br.backend.simplify.adapters.tarefa.cases;

import com.br.backend.simplify.pojo.negocio.tarefa.TarefaDTO;
import java.util.List;

public interface ICRUDTarefaCase {
    TarefaDTO cadastra(TarefaDTO tarefa);
    List<TarefaDTO> buscaTodos();
    TarefaDTO busca(Long id);
    TarefaDTO altera(TarefaDTO dto, Long id);
    TarefaDTO deleta(Long id);
}
