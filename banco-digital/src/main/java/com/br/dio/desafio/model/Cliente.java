package com.br.dio.desafio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Cliente {

    private String nome;
    private int idade;
    private String endereco;
}
