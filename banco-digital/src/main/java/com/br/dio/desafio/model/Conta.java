package com.br.dio.desafio.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;
    private List<Transferencia> transferencias;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL;
        this.saldo = 0;
        this.cliente = cliente;
        this.transferencias = new ArrayList<>();    
    }

    @Override
    public void sacar(double valor) {
        if(valor > getSaldo()) {
            System.out.println("Saldo insuficiente!");
            System.out.printf("Saldo na conta: %s", getSaldo());
            return;
        }
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(valor > getSaldo()) {
            System.out.println("Você não tem saldo suficiente para realizar transferência!");
            return;
        }
        this.sacar(valor);
        contaDestino.setSaldo(valor);
        transferencias.add(new Transferencia(BigDecimal.valueOf(valor), contaDestino));
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("DADOS DA CONTA");
        System.out.println("Titular: " + this.getCliente().getNome());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Numero: " + this.getNumero());
        System.out.println("Saldo: " + this.getSaldo());
    }
}