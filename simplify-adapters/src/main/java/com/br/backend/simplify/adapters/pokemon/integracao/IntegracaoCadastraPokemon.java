package com.br.backend.simplify.adapters.pokemon.integracao;

import com.br.backend.simplify.pojo.negocio.pokemon.PokemonDTO;

public interface IntegracaoCadastraPokemon {
    PokemonDTO getPokemonDTO();
    void setPokemonDTO(PokemonDTO pokemon);
}
