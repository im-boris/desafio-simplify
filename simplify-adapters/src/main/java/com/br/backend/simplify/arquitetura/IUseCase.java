package com.br.backend.simplify.arquitetura;

import com.br.backend.simplify.pojo.contexto.Contexto;

public interface IUseCase<C extends Contexto> {

    default void preExecuta(C contexto) {};
    void execucao(C contexto);
    default void posExecuta(C contexto) {};

    default Boolean executaIntegracoesPreExecucao(C contexto) {
        return true;
    };

    default Boolean executaIntegracoesPosExecucao(C contexto) {
        return true;
    };

}
