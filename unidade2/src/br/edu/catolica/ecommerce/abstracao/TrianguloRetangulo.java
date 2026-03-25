package br.edu.catolica.ecommerce.abstracao;

public class TrianguloRetangulo extends Forma{

    private int base;
    private int altura;

    public TrianguloRetangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("Area do Triangulo Retangulo: "
                + (this.base * this.altura)/2);
    }

    @Override
    public double calcularVolume(double area) {
        return super.calcularVolume(area);
    }
}
