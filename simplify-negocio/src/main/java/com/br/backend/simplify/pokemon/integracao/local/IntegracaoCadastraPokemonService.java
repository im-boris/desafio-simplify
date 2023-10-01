package com.br.backend.simplify.pokemon.integracao.local;

import com.br.backend.simplify.adapters.arquitetura.IntegracaoFluxo;
import com.br.backend.simplify.adapters.pokemon.builder.IPokemonBuilder;
import com.br.backend.simplify.adapters.pokemon.integracao.IntegracaoCadastraPokemon;
import com.br.backend.simplify.adapters.pokemon.repository.IPokemonRepository;
import com.br.backend.simplify.entidade.Pokemon;
import com.br.backend.simplify.pojo.arquitetura.contexto.Contexto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "IntegracaoCadastraPokemon")
public class IntegracaoCadastraPokemonService implements IntegracaoFluxo {

    @Autowired
    private IPokemonRepository repository;

    @Autowired
    private IPokemonBuilder builder;

    @Override
    public void executa(Contexto<?> contexto) {
        IntegracaoCadastraPokemon integracao = (IntegracaoCadastraPokemon) contexto;
        Pokemon pokemon = repository.save(builder.toEntity(integracao.getPokemonDTO()));
        integracao.setPokemonDTO(builder.toDTO(pokemon));
    }

}
