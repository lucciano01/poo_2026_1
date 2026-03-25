package br.edu.catolica.ecommerce.estudo_de_caso;

public abstract class Empregado {

    protected String nome;
    protected double salarioBase;

    public Empregado(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public abstract void exibirInformacoes();
}
