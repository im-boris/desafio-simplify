package com.br.backend.simplify.pojo.negocio.pokemon.cadastrapokemon;

import com.br.backend.simplify.pojo.arquitetura.requisicao.Requisicao;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequisicaoCadastraPokemonDTO extends Requisicao {
    private Integer idPokemon;
}
