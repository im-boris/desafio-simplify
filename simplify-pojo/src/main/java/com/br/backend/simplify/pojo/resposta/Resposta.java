package com.br.backend.simplify.pojo.resposta;

import com.br.backend.simplify.pojo.contexto.Contexto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Resposta <CONTEXTO extends Contexto> {
    private CONTEXTO contexto;
}
