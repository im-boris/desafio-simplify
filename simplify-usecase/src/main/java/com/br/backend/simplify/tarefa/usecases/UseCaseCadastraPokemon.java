package com.br.backend.simplify.tarefa.usecases;

import com.br.backend.simplify.adapters.arquitetura.DefinicaoIntegracao;
import com.br.backend.simplify.pojo.negocio.tarefa.testearquitetura.ContextoCadastraPokemon;
import com.br.backend.simplify.pojo.negocio.tarefa.testearquitetura.RespostaCadastraPokemonDTO;
import com.br.backend.simplify.adapters.arquitetura.IUseCase;
import org.springframework.stereotype.Component;

@Component
@DefinicaoIntegracao
public class UseCaseCadastraPokemon implements IUseCase<ContextoCadastraPokemon, RespostaCadastraPokemonDTO> {

    @Override
    public void execucao(ContextoCadastraPokemon contexto) {

        contexto.setMsgContexto("contextinho");
        contexto.setNumeroContexto(99);

        System.out.println("Teste arquitetura");
    }
}
