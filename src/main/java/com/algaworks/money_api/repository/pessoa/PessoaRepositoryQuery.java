package com.algaworks.money_api.repository.pessoa;

import com.algaworks.money_api.model.Pessoa;
import com.algaworks.money_api.repository.filter.PessoaFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PessoaRepositoryQuery {

    public Page<Pessoa> filtrar(PessoaFilter pessoaFilter, Pageable pageable);

}
