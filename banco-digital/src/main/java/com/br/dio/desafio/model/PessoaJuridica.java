package com.br.dio.desafio.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaJuridica extends Cliente {

    private String cnpj;

    public PessoaJuridica(String nome, int idade, String endereco, String cnpj) {
        super(nome, idade, endereco);
        this.cnpj = cnpj;
    }

}
