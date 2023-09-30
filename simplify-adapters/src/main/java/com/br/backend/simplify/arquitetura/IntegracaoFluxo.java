package com.br.backend.simplify.arquitetura;


import com.br.backend.simplify.pojo.contexto.Contexto;

public interface IntegracaoFluxo {
    void executa(Contexto<?> contexto);
}
