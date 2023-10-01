package com.br.backend.simplify.pojo.negocio.resposta;

import com.br.backend.simplify.pojo.negocio.contexto.Contexto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Resposta <CONTEXTO extends Contexto> {
    private CONTEXTO contexto;
}
