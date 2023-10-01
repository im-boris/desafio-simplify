package com.br.backend.simplify.services;

import com.br.backend.simplify.adapters.arquitetura.IUseCaseRunner;
import com.br.backend.simplify.adapters.tarefa.cases.ICRUDTarefaCase;
import com.br.backend.simplify.pojo.negocio.tarefa.testearquitetura.RequisicaoCadastraPokemonDTO;
import com.br.backend.simplify.pojo.negocio.tarefa.testearquitetura.RespostaCadastraPokemonDTO;
import com.br.backend.simplify.pojo.negocio.tarefa.TarefaDTO;
import com.br.backend.simplify.api.TarefaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TarefaService implements TarefaController {

    @Autowired
    private ICRUDTarefaCase CRUDCase;

    @Autowired
    private IUseCaseRunner runner;


    @Override
    public TarefaDTO cadastra(TarefaDTO dto) {
        return CRUDCase.cadastra(dto);
    }

    @Override
    public List<TarefaDTO> buscaTodos() {
        return CRUDCase.buscaTodos();
    }

    @Override
    public TarefaDTO busca(Long id) {
        return CRUDCase.busca(id);
    }

    @Override
    public TarefaDTO altera(TarefaDTO dto, Long id) {
        return CRUDCase.altera(dto, id);
    }

    @Override
    public TarefaDTO deleta(Long id) {
        return CRUDCase.deleta(id);
    }

    @Override
    public RespostaCadastraPokemonDTO teste(RequisicaoCadastraPokemonDTO requisicao) throws Exception {
        return runner.run(requisicao);
    }

}
