package com.br.backend.simplify.adapters.arquitetura;


import com.br.backend.simplify.pojo.arquitetura.requisicao.Requisicao;
import com.br.backend.simplify.pojo.arquitetura.resposta.Resposta;

public interface IUseCaseRunner {
    <R extends Resposta> R run(Requisicao requisicao) throws Exception;
}
