package com.br.backend.simplify.pokemon.integracao.remoto;

import com.br.backend.simplify.adapters.arquitetura.IntegracaoFluxo;
import com.br.backend.simplify.adapters.pokemon.integracao.IntegracaoPesquisaPokemonByID;
import com.br.backend.simplify.pojo.negocio.contexto.Contexto;
import com.br.backend.simplify.pojo.negocio.pokemon.PokemonDTO;
import org.springframework.stereotype.Component;

@Component(value = "IntegracaoPesquisaPokemonByID")
public class IntegracaoPesquisaPokemonByIDService implements IntegracaoFluxo {

    @Override
    public void executa(Contexto<?> contexto) {

        IntegracaoPesquisaPokemonByID integracao = (IntegracaoPesquisaPokemonByID) contexto;

        System.out.println(integracao.getIdPokemon());

        PokemonDTO pokemon = new PokemonDTO();

        pokemon.setNome("Charmander");
        pokemon.setVelocidade(500);

        integracao.setPokemon(pokemon);

    }
}
