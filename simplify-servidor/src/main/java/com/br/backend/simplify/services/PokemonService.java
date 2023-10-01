package com.br.backend.simplify.services;

import com.br.backend.simplify.adapters.arquitetura.IUseCaseRunner;
import com.br.backend.simplify.api.PokemonController;
import com.br.backend.simplify.pojo.negocio.tarefa.testearquitetura.RequisicaoCadastraPokemonDTO;
import com.br.backend.simplify.pojo.negocio.tarefa.testearquitetura.RespostaCadastraPokemonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService implements PokemonController {

    @Autowired
    private IUseCaseRunner runner;

    @Override
    public RespostaCadastraPokemonDTO cadastra(RequisicaoCadastraPokemonDTO requisicao) throws Exception {
        return runner.run(requisicao);
    }

}
