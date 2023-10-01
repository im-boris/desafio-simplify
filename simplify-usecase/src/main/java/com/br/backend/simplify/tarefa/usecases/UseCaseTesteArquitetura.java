package com.br.backend.simplify.tarefa.usecases;

import com.br.backend.simplify.adapters.arquitetura.DefinicaoIntegracao;
import com.br.backend.simplify.pojo.negocio.tarefa.testearquitetura.ContextoTesteArquitetura;
import com.br.backend.simplify.pojo.negocio.tarefa.testearquitetura.RespostaTesteArquiteturaDTO;
import com.br.backend.simplify.adapters.arquitetura.IUseCase;
import org.springframework.stereotype.Component;

@Component
@DefinicaoIntegracao
public class UseCaseTesteArquitetura implements IUseCase<ContextoTesteArquitetura, RespostaTesteArquiteturaDTO> {

    @Override
    public void execucao(ContextoTesteArquitetura contexto) {

        contexto.setMsgContexto("contextinho");
        contexto.setNumeroContexto(99);

        System.out.println("Teste arquitetura");
    }
}
