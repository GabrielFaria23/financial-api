package com.algaworks.money_api.repository;

import com.algaworks.money_api.model.Pessoa;
import com.algaworks.money_api.repository.pessoa.PessoaRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery {
}
