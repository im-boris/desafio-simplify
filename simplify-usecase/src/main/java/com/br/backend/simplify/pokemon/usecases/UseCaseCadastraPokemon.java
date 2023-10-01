package com.br.backend.simplify.pokemon.usecases;

import com.br.backend.simplify.adapters.arquitetura.DefinicaoIntegracao;
import com.br.backend.simplify.pojo.arquitetura.integracao.IntegracaoEnum;
import com.br.backend.simplify.pojo.negocio.pokemon.cadastrapokemon.RespostaCadastraPokemonDTO;
import com.br.backend.simplify.adapters.arquitetura.IUseCase;
import org.springframework.stereotype.Component;

@Component
@DefinicaoIntegracao(preExecucao = IntegracaoEnum.INTEGRACAO_PESQUISA_POKEMON_BY_ID,
                     posExecucao = IntegracaoEnum.INTEGRACAO_CADASTRA_POKEMON)
public class UseCaseCadastraPokemon implements IUseCase<ContextoCadastraPokemon, RespostaCadastraPokemonDTO> {

    @Override
    public void execucao(ContextoCadastraPokemon contexto) {
        System.out.println("Cadastrando pokemon...");
    }

}
