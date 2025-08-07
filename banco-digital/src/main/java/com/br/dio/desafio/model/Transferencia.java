package com.br.dio.desafio.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transferencia {


    private static int SEQUENCIAL = 1;

    private int id;
    private BigDecimal valor;
    private OffsetDateTime timestamp;
    private Conta conta;

    public Transferencia(BigDecimal valor, Conta conta) {
        setId(Transferencia.SEQUENCIAL++);
        setTimestamp(OffsetDateTime.now());
        setValor(valor);
        setConta(conta);
    }

    @Override
    public String toString() {
        return String.format("ID TRANSFERÊNCIA: %s \n VALOR TRANSFERIDO: %s \n DATA: %s \n HORA: %s \n NOME CLIENTE: %s", getId(), getValor(), toDate(), toTime(), getConta().getCliente().getNome());
    }

    private String toDate() {
        return getTimestamp().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    private String toTime() {
        return getTimestamp().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
