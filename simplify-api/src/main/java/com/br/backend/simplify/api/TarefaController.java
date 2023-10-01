package com.br.backend.simplify.api;

import com.br.backend.simplify.pojo.negocio.tarefa.testearquitetura.RequisicaoCadastraPokemonDTO;
import com.br.backend.simplify.pojo.negocio.tarefa.testearquitetura.RespostaCadastraPokemonDTO;
import com.br.backend.simplify.pojo.negocio.tarefa.TarefaDTO;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/tarefa")
public interface TarefaController {

    @RequestMapping(method = RequestMethod.POST)
    TarefaDTO cadastra(@Valid @RequestBody TarefaDTO dto) throws Exception;

    @RequestMapping(method = RequestMethod.GET)
    List<TarefaDTO> buscaTodos();

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    TarefaDTO busca(@PathVariable("id") Long id);

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    TarefaDTO altera(@Valid @RequestBody TarefaDTO dto, @PathVariable("id") Long id);

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    TarefaDTO deleta(@PathVariable("id") Long id);

    @RequestMapping(value = "/teste", method = RequestMethod.POST)
    RespostaCadastraPokemonDTO teste(@Valid @RequestBody RequisicaoCadastraPokemonDTO requisicao) throws Exception;

}
