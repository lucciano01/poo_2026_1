package br.edu.catolica.ecommerce.estudo_de_caso;

public class Vendedor extends Empregado{

    private double horasExtras;
    private double valorDaHora;

    public Vendedor(String nome, double salarioBase) {
        super(nome, salarioBase);
        this.horasExtras = 20;
        this.valorDaHora = 25;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (this.horasExtras * this.valorDaHora);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Vendedor: " +nome);
        System.out.println("Salario Base R$: " +salarioBase);
        System.out.println("Horas Extras: " +this.horasExtras);
        System.out.println("Valor da Hora R$: " +this.valorDaHora);
        System.out.println("Valor Total R$: " +this.calcularSalario());

    }
}
