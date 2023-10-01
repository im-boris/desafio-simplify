package com.br.backend.simplify.pojo.negocio.tarefa;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TarefaDTO {

    private Long id;

    private String nome;

    private String descricao;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date realizado;

    private Integer prioridade;

}
