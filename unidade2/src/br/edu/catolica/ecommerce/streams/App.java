package br.edu.catolica.ecommerce.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import br.edu.catolica.ecommerce.info.Pessoa;

public class App{
        
    public static void main(String[] args) {

        var pessoas = getPessoas();

        var nomes = pessoas.stream()
        .map(p -> p.getNome())
        .filter(nome -> nome.startsWith("P"))
        .map(String::toUpperCase)
        .sorted()
        .collect(Collectors.toList());

        //System.out.println(nomes);

        var carrinho = List.of(
        new Produto("Refrigerante", 12.5, Categoria.BEBIDAS),
        new Produto("Café", 20.0, Categoria.CEREAIS),
        new Produto("Açucar", 5.8, Categoria.CEREAIS),
        new Produto("Sabão", 17.0, Categoria.LIMPEZA),
        new Produto("Shampoo", 25.0, Categoria.LIMPEZA));

        Map<Boolean, List<Produto>> particionado = carrinho.stream()
        .collect(Collectors.groupingBy(p -> p.getPreco() > 15));

        particionado.forEach((Boolean, p) -> {
            var result = Boolean.equals(Boolean.TRUE) ? "Caros":"Baratos";
            System.out.println(result);
            p.forEach(System.out::println);
            System.out.println();
        });
        
     

        // var maiorPrecoPorCategoria = carrinho.stream()
        // .filter(p -> p.getCategoria().equals(Categoria.CEREAIS))
        // .max(Comparator.comparing(Produto::getPreco));
        // //System.out.println(maiorPrecoPorCategoria.get());


        //   var soma = carrinho.stream()
        // .mapToDouble(Produto::getPreco).sum();
        // //System.out.println(soma);
      
    //    boletins().forEach(b ->{
    //     double media = b.getNotas().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
    //     String situacao = media >= 7.0 ? "Aprovado" : "Reprovado";
    //     System.out.printf("Aluno: %s - Média: %.1f - Situação: %s%n", b.getAluno().getNome(), media, situacao);
    //     for(int i = 0; i < b.getNotas().size(); i++){
    //       //  System.out.println("Nota "+(i+1)+": " +b.getNotas().get(i) );
    //         System.out.printf("Nota%d: %.1f%n", i + 1, b.getNotas().get(i));
    //     }
    //     System.out.println("------------------------------------------");
    //     System.out.println();
    //    });
    }

    public static List<Pessoa> getPessoas(){
        return List.of(
            new Pessoa("João", "12345678900"),
            new Pessoa("Maria", "98765432100"),
            new Pessoa("Pedro", "11122233344"),
            new Pessoa("Paulo", "52365412547"),
            new Pessoa("Patricia", "74125896325"),
            new Pessoa("Marta", "52584563251")
        );
    }

    public static List<Boletim> boletins(){
        return List.of(
            new Boletim(new Aluno("Jose", "123"), List.of(4.5,8.5,7.0)),
            new Boletim(new Aluno("Maria", "321"), List.of(8.0,7.7,9.5)),
            new Boletim(new Aluno("Antonio", "456"), List.of(4.5,2.5,3.0)),
            new Boletim(new Aluno("Pedro", "789"), List.of(6.2,5.5,3.5))
        );
    }
    
}