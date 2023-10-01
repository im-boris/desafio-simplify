package com.br.backend.simplify.tarefa.usecases;

import com.br.backend.simplify.pojo.negocio.contexto.Contexto;
import com.br.backend.simplify.pojo.negocio.tarefa.RequisicaoCadastraTarefaDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContextoTesteArquitetura extends Contexto<RequisicaoCadastraTarefaDTO> {
    private String msgContexto;
    private Integer numeroContexto;
}
