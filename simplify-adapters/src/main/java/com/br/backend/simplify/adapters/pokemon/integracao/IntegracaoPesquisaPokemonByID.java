package com.br.backend.simplify.adapters.pokemon.integracao;

import com.br.backend.simplify.pojo.negocio.pokemon.PokemonDTO;

public interface IntegracaoPesquisaPokemonByID {
    Integer getIdPokemon();
    void setPokemonDTO(PokemonDTO pokemon);
}
