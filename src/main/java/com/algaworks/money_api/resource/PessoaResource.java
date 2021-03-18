package com.algaworks.money_api.resource;

import com.algaworks.money_api.event.RecursoCriadoEvent;
import com.algaworks.money_api.model.Pessoa;
import com.algaworks.money_api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping
    public List<Pessoa> buscarTodasAsPessoas(){
        return pessoaRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Pessoa> cadastrarPessoa(@Valid @RequestBody Pessoa pessoa, HttpServletResponse response){
        Pessoa pessoaSalva = pessoaRepository.save(pessoa);

        publisher.publishEvent(new RecursoCriadoEvent(this, response, pessoaSalva.getCodigo()));

        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaSalva);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Pessoa> buscarPessoaPorId(@PathVariable long codigo){
        return pessoaRepository.findById(codigo)
                .map(pessoa -> ResponseEntity.ok().body(pessoa))
                .orElse(ResponseEntity.notFound().build());
    }
}
