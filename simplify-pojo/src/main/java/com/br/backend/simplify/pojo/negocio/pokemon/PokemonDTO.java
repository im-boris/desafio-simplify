package com.br.backend.simplify.pojo.negocio.pokemon;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PokemonDTO {
    private String nome;
    private Integer velocidade;
}
