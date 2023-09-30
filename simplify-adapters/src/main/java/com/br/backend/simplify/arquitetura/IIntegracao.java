package com.br.backend.simplify.arquitetura;

import com.br.backend.simplify.pojo.contexto.Contexto;
import com.br.backend.simplify.pojo.integracao.IntegracaoEnum;

public interface IIntegracao {
    void executa(Contexto contexto, IntegracaoEnum integracao);
    void executaIntegracoes(Contexto contexto, IntegracaoEnum[] integracoes) throws Exception;
    void executaIntegracoesPreExecucao(Contexto contexto, IUseCase useCaseBean) throws Exception;
    void executaIntegracoesPosExecucao(Contexto contexto, IUseCase useCaseBean) throws Exception;
}
