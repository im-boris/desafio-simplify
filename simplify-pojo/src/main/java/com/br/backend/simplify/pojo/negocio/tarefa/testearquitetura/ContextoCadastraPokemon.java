package com.br.backend.simplify.pojo.negocio.tarefa.testearquitetura;

import com.br.backend.simplify.pojo.negocio.contexto.Contexto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContextoCadastraPokemon extends Contexto<RequisicaoCadastraPokemonDTO> {
    private String msgContexto;
    private Integer numeroContexto;
}
