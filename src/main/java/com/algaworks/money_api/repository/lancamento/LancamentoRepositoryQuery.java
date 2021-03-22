package com.algaworks.money_api.repository.lancamento;

import com.algaworks.money_api.model.Lancamento;
import com.algaworks.money_api.repository.filter.LancamentoFilter;

import java.util.List;

public interface LancamentoRepositoryQuery {

    public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

}
