package com.br.backend.simplify.adapters.tarefa.repository;

import com.br.backend.simplify.entidade.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ITarefaRepository extends JpaRepository<Tarefa, Long> {

    default Tarefa findEntidadeByID(Long id) {
        Optional<Tarefa> configuracao = findById(id);
        if(configuracao.isEmpty()) {
            throw new RuntimeException("Tarefa não pode ser encontrada");
        }
        return configuracao.get();
    }

}
