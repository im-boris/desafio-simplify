package com.br.backend.simplify.arquitetura;


import com.br.backend.simplify.pojo.contexto.Contexto;
import com.br.backend.simplify.pojo.requisicao.Requisicao;

public interface IUseCaseRunner {
    <C extends Contexto> C run(Requisicao requisicao) throws Exception;
}
