package br.edu.catolica.ecommerce.estudo_de_caso;

public class Gerente extends Empregado{

    private double bonus;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
        this.bonus = 1000;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + this.bonus;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Gerente: " +nome);
        System.out.println("Salário base R$: " +salarioBase);
        System.out.println("Bonus R$: " +this.bonus);
        System.out.println("Salário Total R$: " +calcularSalario());
    }
}
