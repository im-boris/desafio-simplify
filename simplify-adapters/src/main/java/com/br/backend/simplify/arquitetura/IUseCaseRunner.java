package com.br.backend.simplify.arquitetura;


import com.br.backend.simplify.pojo.contexto.Contexto;
import com.br.backend.simplify.pojo.requisicao.Requisicao;
import com.br.backend.simplify.pojo.resposta.Resposta;

public interface IUseCaseRunner {
    <R extends Resposta> R run(Requisicao requisicao) throws Exception;
}
