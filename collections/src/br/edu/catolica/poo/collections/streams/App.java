package br.edu.catolica.poo.collections.streams;

import java.util.*;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        var pessoas = getPessoas();

        //expressoes lambda
     //   pessoas.forEach(p -> System.out.println(p));

        //referencia ao metodo
       // pessoas.forEach(System.out::println);

        List<Pessoa> feminino = new ArrayList<>();
        pessoas.forEach(pessoa ->{
            if(pessoa.getGenero().equals(Genero.FEMININO)){
                feminino.add(pessoa);
            }
        });
       // feminino.forEach(System.out::println);

        //função para filtrar itens de uma lista
//        var streamFeminino = pessoas.stream()
//                .filter( p-> p.getIdade() >= 18)
//                        .collect(Collectors.toList());

        var ordemAlfabetica = pessoas.stream()
                        .sorted(Comparator.comparing(Pessoa::getNome))
                        .toList();

        var ordemIdadeReversa = pessoas.stream()
                        .sorted(Comparator.comparing(Pessoa::getIdade)
                                .reversed())
                                .toList();

        var maiorDeIdade = pessoas.stream()
                        .allMatch(p -> p.getIdade() >= 18);

        var peloMenosUm = pessoas.stream()
                        .noneMatch(p -> p.getNome()
                                .equalsIgnoreCase("Carlos"));

        var maiorIdadeDaLista = pessoas.stream()
                        .min(Comparator.comparing(Pessoa::getIdade)).get();

//        Optional<String> name = Optional.empty();
//        name.ifPresent(n ->
//                System.out.println(name.get().length()));

       Map<Genero, List<Pessoa>> grupoPorGenero =
               pessoas.stream()
                       .collect(Collectors.groupingBy(Pessoa::getGenero));

//       grupoPorGenero.forEach((genero, pessoa) ->{
//        var resultado = Boolean.equals(Boolean.TRUE) ? "Caros:"
//                : "Baratos:";
//        System.out.println(resultado);
//           System.out.println(genero);
//           pessoa.forEach(System.out::println);
//           System.out.println();
//       });

      // System.out.println(maiorIdadeDaLista);

        //map
        var nomes = getPessoas().stream()
                .map(n -> n.getNome())
                .filter(nome -> nome.startsWith("L"))
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(nomes);

    }

    public static List<Pessoa> getPessoas (){
       // List<Pessoa> pessas = new ArrayList<>();
       // pessas.add(new Pessoa("Jose", 20, Genero.MASCULINO));

        return List.of(new Pessoa("Jose", 20, Genero.MASCULINO),
                        new Pessoa("Maria", 80, Genero.FEMININO),
                        new Pessoa("Lara", 8, Genero.FEMININO),
                        new Pessoa("Luiz", 40, Genero.MASCULINO),
                        new Pessoa("Roberta", 15, Genero.FEMININO));
    }
}
