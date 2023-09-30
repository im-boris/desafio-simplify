package com.br.backend.simplify.pojo.contexto;

import com.br.backend.simplify.pojo.requisicao.Requisicao;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Contexto<REQUISICAO extends Requisicao> {
    private REQUISICAO requisicao;
}
