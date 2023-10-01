package com.br.backend.simplify.pojo.arquitetura.integracao;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IntegracaoEnum {

    INTEGRACAO_PESQUISA_POKEMON_BY_ID("IntegracaoPesquisaPokemonByID"),
    INTEGRACAO_CADASTRA_POKEMON("IntegracaoCadastraPokemon");

    private final String nome;
}
