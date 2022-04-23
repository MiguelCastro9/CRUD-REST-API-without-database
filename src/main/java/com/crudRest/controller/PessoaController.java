package com.crudRest.controller;

import com.crudRest.model.Pessoa;
import com.crudRest.service.PessoaService;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Miguel Castro
 */
@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;
    AtomicLong atomicLong = new AtomicLong();

    @RequestMapping(path = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pessoa> listar() {

        return pessoaService.listar();
    }

    @RequestMapping(path = "/inserir", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa inserir(@RequestBody Pessoa pessoa) {

        return pessoaService.inserir(pessoa);
    }

    @RequestMapping(path = "/alterar", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa alterar(@RequestBody Pessoa pessoa) {

        return pessoaService.alterar(pessoa);
    }

    @RequestMapping(path = "/buscar/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pessoa> buscar(@PathVariable("id") Long id) {

        List<Pessoa> p = pessoaService.buscar(id);

        return p;
    }

    @RequestMapping(path = "/deletar/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable("id") Long id) {

        pessoaService.deletar(id);
    }
}
