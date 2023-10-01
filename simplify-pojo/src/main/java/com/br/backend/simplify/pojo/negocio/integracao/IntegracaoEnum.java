package com.br.backend.simplify.pojo.negocio.integracao;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IntegracaoEnum {

    INTEGRACAO_PESQUISA_POKEMON_BY_ID("IntegracaoPesquisaPokemonByID");

    private final String nome;
}
