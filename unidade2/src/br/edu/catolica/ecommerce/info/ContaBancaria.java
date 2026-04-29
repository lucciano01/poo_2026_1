package br.edu.catolica.ecommerce.info;

import java.time.LocalDate;

public class ContaBancaria {

    private int numeroDaconta;
    private LocalDate dataDeAbertura;
    private double saldo;

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }
    
}

