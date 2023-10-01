package com.br.backend.simplify.infraestrutura.arquitetura;

import com.br.backend.simplify.pojo.negocio.contexto.Contexto;
import com.br.backend.simplify.adapters.arquitetura.IUseCase;
import com.br.backend.simplify.pojo.negocio.tarefa.testearquitetura.RespostaCadastraPokemonDTO;
import com.br.backend.simplify.pojo.negocio.resposta.Resposta;
import com.br.backend.simplify.pojo.negocio.tarefa.testearquitetura.ContextoCadastraPokemon;
import com.br.backend.simplify.tarefa.usecases.UseCaseCadastraPokemon;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum UseCaseMapper {

    CADASTRA_POKEMON(1, new UseCaseCadastraPokemon(), new ContextoCadastraPokemon(), new RespostaCadastraPokemonDTO());


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
