package com.br.backend.simplify.infraestrutura.arquitetura;

import com.br.backend.simplify.arquitetura.IUseCase;
import com.br.backend.simplify.pojo.contexto.Contexto;
import com.br.backend.simplify.pojo.negocio.tarefa.RespostaCadastraTarefaDTO;
import com.br.backend.simplify.pojo.resposta.Resposta;
import com.br.backend.simplify.tarefa.cases.ContextoCadastraTarefa;
import com.br.backend.simplify.tarefa.cases.UseCaseCadastraTarefa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum UseCaseMapper {

    CADASTRA_TAREFA(1, new UseCaseCadastraTarefa(), new ContextoCadastraTarefa(), new RespostaCadastraTarefaDTO());


    private Integer codigoRequisicao;
    private IUseCase useCase;
    private Contexto contexto;
    private Resposta resposta;

    public static UseCaseMapper findById(Integer id) {
        for (UseCaseMapper useCase: UseCaseMapper.values()) {
                if(useCase.getCodigoRequisicao().equals(id))
                    return useCase;
        }
        throw new RuntimeException("Caso de uso não pode ser encontrado");
    }
}
