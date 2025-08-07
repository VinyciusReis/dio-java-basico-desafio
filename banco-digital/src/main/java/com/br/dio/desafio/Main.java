package com.br.dio.desafio;

import com.br.dio.desafio.model.Cliente;
import com.br.dio.desafio.model.Conta;
import com.br.dio.desafio.model.PessoaFisica;

public class Main {
    public static void main(String[] args) {

        Cliente vinycius = new PessoaFisica(
            "Vinycius Reis", 
            26, 
            "Rua da Árvore, Nº 46, São Paulo -SP", 
            "130.555.457-40"
        );

        Cliente carlos = new PessoaFisica(
            "Carlos da Silva", 
            26, 
            "Rua Severino Andrade, Nº 128, Recife - PE", 
            "130.421.022-50"
        );

        Conta c1 = new Conta(vinycius);
        Conta c2 = new Conta(carlos);

        c1.depositar(250);
        c1.transferir(100, c2);
        c1.imprimirExtrato();
        System.out.println(c1.getTransferencias().get(0).toString());
    }
}