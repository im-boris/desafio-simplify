package com.br.backend.simplify.tarefa.cases;

import com.br.backend.simplify.arquitetura.DefinicaoIntegracao;
import com.br.backend.simplify.arquitetura.IUseCase;
import com.br.backend.simplify.pojo.negocio.tarefa.RespostaCadastraTarefaDTO;
import org.springframework.stereotype.Component;

@Component
@DefinicaoIntegracao
public class UseCaseCadastraTarefa implements IUseCase<ContextoCadastraTarefa, RespostaCadastraTarefaDTO> {

    @Override
    public void execucao(ContextoCadastraTarefa contexto) {

        contexto.setMsgContexto("contextinho");
        contexto.setNumeroContexto(99);

        System.out.println("Cadastro de tarefa");
    }
}
