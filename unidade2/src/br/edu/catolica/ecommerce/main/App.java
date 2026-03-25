package br.edu.catolica.ecommerce.main;

import br.edu.catolica.ecommerce.info.Contato;
import br.edu.catolica.ecommerce.info.Endereco;
import br.edu.catolica.ecommerce.usuario.Pessoa;

public class App {

    public static void main(String[] args) {
        Endereco end = new Endereco("Rua y", "Centro", "Sousa");
        Pessoa p =
                new Pessoa("Jose", "123",
                        end);
        Contato c = new Contato("5555-8888", "email@email.com","@instagram");
        Pessoa p2 = new Pessoa("Maria", "456", end, c);

        System.out.println(p);
        System.out.println(p2);
    }
}
