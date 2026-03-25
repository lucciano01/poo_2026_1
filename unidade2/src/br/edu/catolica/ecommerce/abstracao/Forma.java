package br.edu.catolica.ecommerce.abstracao;

public abstract class Forma {

    private int valor;

    public abstract void calcularArea();

    public double calcularVolume(double area){
        return area * area;
    }
}
