package com.br.backend.simplify.api;

import com.br.backend.simplify.pojo.negocio.tarefa.RequisicaoCadastraTarefaDTO;
import com.br.backend.simplify.pojo.negocio.tarefa.RespostaCadastraTarefaDTO;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/tarefa")
public interface TarefaController {

    @RequestMapping(method = RequestMethod.POST)
    RespostaCadastraTarefaDTO cadastra(@Valid @RequestBody RequisicaoCadastraTarefaDTO dto) throws Exception;

//    @RequestMapping(method = RequestMethod.GET)
//    List<TemplateDTO> buscaTodos();
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    TemplateDTO busca(@PathVariable("id") Long id);
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
//    TemplateDTO altera(@Valid TemplateDTO dto, @PathVariable("id") Long id);
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    void deleta(@PathVariable("id") Long id);

}
