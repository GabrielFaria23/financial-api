package com.algaworks.money_api.service;

import com.algaworks.money_api.model.Lancamento;
import com.algaworks.money_api.model.Pessoa;
import com.algaworks.money_api.repository.LancamentoRepository;
import com.algaworks.money_api.repository.PessoaRepository;
import com.algaworks.money_api.service.exception.PessoaInexistenteOuInativaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LancamentoService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private LancamentoRepository lancamentoRepository;

    public Lancamento salvar(Lancamento lancamento) {
        Optional<Pessoa> pessoaOptional = pessoaRepository.findById(lancamento.getPessoa().getCodigo());
        Pessoa pessoa = pessoaOptional.get();
        if(pessoa == null || pessoa.isInativo()){
            throw new PessoaInexistenteOuInativaException();
        }
        return lancamentoRepository.save(lancamento);
    }
}
