package com.br.backend.simplify.adapters.arquitetura;

import com.br.backend.simplify.pojo.arquitetura.contexto.Contexto;

public interface IntegracaoFluxo {
    void executa(Contexto<?> contexto);
}
