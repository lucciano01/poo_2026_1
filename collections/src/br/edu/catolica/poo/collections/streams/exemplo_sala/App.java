package br.edu.catolica.poo.collections.streams.exemplo_sala;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        var maiorPreco = produtos().stream()
                .filter(p -> p.getCategoria()
                        .equals(Categoria.BEBIDAS))
                .max(Comparator.comparing(Produto::getPreco)).get();
       // System.out.println(maiorPreco);

       Map<Boolean, List<Produto>> produtos = produtos().stream()
                .collect(Collectors.groupingBy(p -> p.getPreco() > 50));
        produtos.forEach((Boolean, p) ->{
            var resultado = Boolean.equals(java.lang.Boolean.TRUE) ? "Caros:" : "Baratos:";
            System.out.println(resultado);
            p.forEach(System.out::println);
            System.out.println();
        });
    }

    public static List<Produto> produtos (){
        return List.of(
                new Produto("Shampoo", 80.0, Categoria.LIMPEZA),
                new Produto("Sabonete", 20.0, Categoria.LIMPEZA),
                new Produto("Arroz", 100.0, Categoria.CEREAIS),
                new Produto("Feijao", 18.0, Categoria.CEREAIS),
                new Produto("Agua", 8.0, Categoria.BEBIDAS),
                new Produto("Refrigerante", 70.0, Categoria.BEBIDAS));
    }
}
