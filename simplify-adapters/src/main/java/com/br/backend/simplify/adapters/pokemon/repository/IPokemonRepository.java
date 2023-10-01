package com.br.backend.simplify.adapters.pokemon.repository;

import com.br.backend.simplify.entidade.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPokemonRepository extends JpaRepository<Pokemon, Long> {}
