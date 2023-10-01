package com.br.backend.simplify.api;

import com.br.backend.simplify.pojo.negocio.pokemon.cadastrapokemon.RequisicaoCadastraPokemonDTO;
import com.br.backend.simplify.pojo.negocio.pokemon.cadastrapokemon.RespostaCadastraPokemonDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pokemon")
public interface PokemonController {

    @RequestMapping(method = RequestMethod.POST)
    RespostaCadastraPokemonDTO cadastra(@Valid @RequestBody RequisicaoCadastraPokemonDTO requisicao) throws Exception;

}
