package com.br.backend.simplify.pokemon.builder;

import com.br.backend.simplify.adapters.pokemon.builder.IPokemonBuilder;
import com.br.backend.simplify.entidade.Pokemon;
import com.br.backend.simplify.pojo.negocio.pokemon.PokemonDTO;
import com.br.backend.simplify.pojo.negocio.pokemon.integracao.PokemonRestResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class PokemonBuilder implements IPokemonBuilder {

    @Override
    public PokemonDTO toDTO(PokemonRestResponseDTO restResponse) {
        PokemonDTO dto = new PokemonDTO();
        dto.setNome(restResponse.getName());
        dto.setUrlSprite(restResponse.getSprites().getFront_default());
        dto.setIdPokemon(Long.valueOf(restResponse.getId()));
        return dto;
    }

    @Override
    public Pokemon toEntity(PokemonDTO pokemonDTO) {
        Pokemon entity = new Pokemon();
        entity.setIdPokemon(pokemonDTO.getIdPokemon());
        entity.setNome(pokemonDTO.getNome());
        entity.setUrlImagem(pokemonDTO.getUrlSprite());
        return entity;
    }

    @Override
    public PokemonDTO toDTO(Pokemon pokemon) {
        PokemonDTO dto = new PokemonDTO();
        dto.setNome(pokemon.getNome());
        dto.setUrlSprite(pokemon.getUrlImagem());
        dto.setIdPokemon(pokemon.getIdPokemon());
        return dto;
    }

}
