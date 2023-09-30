package com.br.backend.simplify.arquitetura;

import com.br.backend.simplify.pojo.contexto.Contexto;
import com.br.backend.simplify.pojo.resposta.Resposta;

public interface IUseCase<C extends Contexto, R extends Resposta> {

    default void preExecuta(C contexto) {};

    void execucao(C contexto);

    default void posExecuta(C contexto) {};

    default Boolean executaIntegracoesPreExecucao(C contexto) {
        return true;
    };

    default Boolean executaIntegracoesPosExecucao(C contexto) {
        return true;
    };

    default void preencheResposta(C contexto, R resposta) {};

}
