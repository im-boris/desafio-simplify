package com.br.backend.simplify.services;

import com.br.backend.simplify.api.TarefaController;
import com.br.backend.simplify.arquitetura.IUseCaseRunner;
import com.br.backend.simplify.pojo.negocio.tarefa.RequisicaoCadastraTarefaDTO;
import com.br.backend.simplify.pojo.negocio.tarefa.RespostaCadastraTarefaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarefaService implements TarefaController {

    @Autowired
    private IUseCaseRunner useCaseRunner;

    @Override
    public RespostaCadastraTarefaDTO cadastra(RequisicaoCadastraTarefaDTO dto) throws Exception {
        useCaseRunner.run(dto);
        return null;
    }

}
