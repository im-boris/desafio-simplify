package com.br.backend.simplify.pokemon.usecases;

import com.br.backend.simplify.adapters.pokemon.integracao.IntegracaoCadastraPokemon;
import com.br.backend.simplify.adapters.pokemon.integracao.IntegracaoPesquisaPokemonByID;
import com.br.backend.simplify.pojo.arquitetura.contexto.Contexto;
import com.br.backend.simplify.pojo.negocio.pokemon.PokemonDTO;
import com.br.backend.simplify.pojo.negocio.pokemon.cadastrapokemon.RequisicaoCadastraPokemonDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContextoCadastraPokemon extends Contexto<RequisicaoCadastraPokemonDTO> implements
        IntegracaoPesquisaPokemonByID,
        IntegracaoCadastraPokemon {

    private Integer idPokemon;
    private PokemonDTO pokemonDTO;

    @Override
    public Integer getIdPokemon() {
        return getRequisicao().getIdPokemon();
    }
}
