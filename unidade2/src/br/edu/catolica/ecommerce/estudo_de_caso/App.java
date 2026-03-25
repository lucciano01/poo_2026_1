package br.edu.catolica.ecommerce.estudo_de_caso;

public class App {

    public static void main(String[] args) {

        Empregado e = new Gerente("Jose", 5000);
        e.exibirInformacoes();
        System.out.println("-----------------");
        Empregado v = new Vendedor("Maria", 3000);
        v.exibirInformacoes();
    }
}
