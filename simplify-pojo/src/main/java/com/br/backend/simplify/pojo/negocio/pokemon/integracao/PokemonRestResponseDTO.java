package com.br.backend.simplify.pojo.negocio.pokemon.integracao;

import com.br.backend.simplify.pojo.DTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PokemonRestResponseDTO {

    private Integer id;
    private String name;
    private Sprites sprites;

    @Getter
    @Setter
    public static class Sprites implements DTO {
        private String front_default;
        private String back_default;
        private Other other;
    }

    @Getter
    @Setter
    public static class Other implements DTO {
        private DreamWorld dream_world;

        @Getter
        @Setter
        public static class DreamWorld implements DTO {
            private String front_default;
        }

    }

}
