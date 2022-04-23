package com.crudRest.service;

import com.crudRest.model.Pessoa;
import com.crudRest.resources.Randoms;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel Castro
 */
@Service
public class PessoaService {

    AtomicLong atomicLong = new AtomicLong();

    public Pessoa inserir(Pessoa pessoa) {

        return pessoa;
    }

    public List<Pessoa> listar() {

        List<Pessoa> lista = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            Pessoa p = mockPessoas();
            lista.add(p);
        }

        return lista;
    }

    public Pessoa alterar(Pessoa pessoa) {

        return pessoa;
    }

    public List<Pessoa> buscar(Long id) {

        List<Pessoa> p = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            if (i == id) {

                p.add(new Pessoa(Long.valueOf(i), Randoms.nomesAleatorios(), Randoms.idadesAleatorios(), Randoms.sexosAleatorios()));
                return p;
            }
        }
        return null;
    }

    public void deletar(Long id) {

        //HTTP STATUS 200-OK
    }

    private Pessoa mockPessoas() {

        Pessoa p = new Pessoa(atomicLong.incrementAndGet(), "Miguel Castro", 22, "Masculino");

        return p;
    }
}
