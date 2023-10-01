package com.br.backend.simplify.pokemon.usecases;

import com.br.backend.simplify.adapters.pokemon.integracao.IntegracaoPesquisaPokemonByID;
import com.br.backend.simplify.pojo.negocio.contexto.Contexto;
import com.br.backend.simplify.pojo.negocio.pokemon.PokemonDTO;
import com.br.backend.simplify.pojo.negocio.pokemon.cadastrapokemon.RequisicaoCadastraPokemonDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContextoCadastraPokemon extends Contexto<RequisicaoCadastraPokemonDTO> implements
        IntegracaoPesquisaPokemonByID {

    private Integer idPokemon;
    private PokemonDTO pokemon;

    @Override
    public Integer getIdPokemon() {
        return getRequisicao().getIdPokemon();
    }
}
