package com.br.backend.simplify.adapters.arquitetura;


import com.br.backend.simplify.pojo.negocio.contexto.Contexto;

public interface IntegracaoFluxo {
    void executa(Contexto<?> contexto);
}
