package com.algaworks.money_api.repository;

import com.algaworks.money_api.model.Lancamento;
import com.algaworks.money_api.repository.lancamento.LancamentoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {
}
