package com.algaworks.money_api.repository.lancamento;

import com.algaworks.money_api.model.Lancamento;
import com.algaworks.money_api.repository.filter.LancamentoFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LancamentoRepositoryQuery {

    public Page<Lancamento>filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);

}
