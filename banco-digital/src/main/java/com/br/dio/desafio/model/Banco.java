package com.br.dio.desafio.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public List<Cliente> getClientes() {
        return contas.stream().map(Conta::getCliente).toList();
    }
}
