package com.br.backend.simplify.adapters.pokemon.builder;

import com.br.backend.simplify.adapters.comum.Builder;
import com.br.backend.simplify.entidade.Pokemon;
import com.br.backend.simplify.pojo.negocio.pokemon.PokemonDTO;
import com.br.backend.simplify.pojo.negocio.pokemon.integracao.PokemonRestResponseDTO;

public interface IPokemonBuilder extends Builder<Pokemon, PokemonDTO> {
    PokemonDTO toDTO(PokemonRestResponseDTO restResponse);
}
