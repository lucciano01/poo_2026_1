package br.edu.catolica.ecommerce.abstracao;

public class Quadrado extends Forma{

    private int l1, l2;

    @Override
    public void calcularArea() {
        System.out.println("Area do Quadrado: " + l1*l2);
    }
}
