package br.edu.catolica.ecommerce.abstracao;

public class Carro extends Veiculo{

    private int quantidadeDePortas;

    public Carro(String modelo, String marcar, int ano, int quantidadeDePortas) {
        super(modelo, marcar, ano);
        this.quantidadeDePortas = quantidadeDePortas;

    }
}
