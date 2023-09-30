package com.br.backend.simplify.tarefa.cases;

import com.br.backend.simplify.arquitetura.DefinicaoIntegracao;
import com.br.backend.simplify.arquitetura.IUseCase;
import org.springframework.stereotype.Component;

@Component
@DefinicaoIntegracao(preExecucao = {})
public class UseCaseCadastraTarefa implements IUseCase<ContextoCadastraTarefa> {

    @Override
    public void execucao(ContextoCadastraTarefa contexto) {
        System.out.println("Cadastro de tarefa");
    }

}
