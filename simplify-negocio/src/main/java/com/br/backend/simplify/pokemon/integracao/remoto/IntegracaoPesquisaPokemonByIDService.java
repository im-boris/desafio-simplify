package com.br.backend.simplify.pokemon.integracao.remoto;

import com.br.backend.simplify.adapters.arquitetura.IntegracaoFluxo;
import com.br.backend.simplify.adapters.pokemon.builder.IPokemonBuilder;
import com.br.backend.simplify.adapters.pokemon.integracao.IntegracaoPesquisaPokemonByID;
import com.br.backend.simplify.pojo.arquitetura.contexto.Contexto;
import com.br.backend.simplify.pojo.negocio.pokemon.integracao.PokemonRestResponseDTO;
import com.br.backend.simplify.pokemon.service.PokemonRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "IntegracaoPesquisaPokemonByID")
public class IntegracaoPesquisaPokemonByIDService implements IntegracaoFluxo {

    @Autowired
    private PokemonRestService service;

    @Autowired
    private IPokemonBuilder builder;

    @Override
    public void executa(Contexto<?> contexto){

        IntegracaoPesquisaPokemonByID integracao = (IntegracaoPesquisaPokemonByID) contexto;

        PokemonRestResponseDTO response = null;

        try {
            response = service.consultaByID(integracao.getIdPokemon());
        } catch (Exception e) {
            throw new RuntimeException("Falha na comunição REST de obter pokemon BY ID !");
        }

        integracao.setPokemonDTO(builder.toDTO(response));

    }

}
