package com.br.backend.simplify.pokemon.service;

import com.br.backend.simplify.comum.integracao.IntegracaoAPI;
import com.br.backend.simplify.pojo.negocio.pokemon.integracao.PokemonRestResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class PokemonRestService extends IntegracaoAPI {

    public PokemonRestResponseDTO consultaByID(Integer id) throws Exception {
        return get("https://pokeapi.co/api/v2/pokemon/"+id, PokemonRestResponseDTO.class);
    }

}
