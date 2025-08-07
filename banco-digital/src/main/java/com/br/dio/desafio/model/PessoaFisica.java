package com.br.dio.desafio.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaFisica extends Cliente {

    private String cpf;

    public PessoaFisica(String nome, int idade, String endereco, String cpf) {
        super(nome, idade, endereco);
        this.cpf = cpf;
    }    
}
