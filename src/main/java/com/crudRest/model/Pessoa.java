package com.crudRest.model;

import java.io.Serializable;

/**
 *
 * @author Miguel Castro
 */
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(Long id, String nome, int idade, String sexo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
