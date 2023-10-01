package com.br.backend.simplify.adapters.arquitetura;


import com.br.backend.simplify.pojo.negocio.requisicao.Requisicao;
import com.br.backend.simplify.pojo.negocio.resposta.Resposta;

public interface IUseCaseRunner {
    <R extends Resposta> R run(Requisicao requisicao) throws Exception;
}
