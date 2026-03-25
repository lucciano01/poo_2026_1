package br.edu.catolica.ecommerce.abstracao;

public abstract class Veiculo {

    private String modelo;
    private String marcar;
    private int ano;

    public Veiculo(String modelo, String marcar, int ano) {
        this.modelo = modelo;
        this.marcar = marcar;
        this.ano = ano;
    }
}
