
package br.edu.catolica.ecommerce.info;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class App {

    public static void main(String[] args) {
        //var pessoas = getPessoas();

        //utilizando expressão lambda
        //pessoas.forEach(p -> System.out.println(p));

        //utilizando referencia ao metodo
       // pessoas.forEach(System.out::println);

        // Map<Genero, List<Pessoa>> grupo = pessoas.stream()
        // .collect(Collectors.groupingBy(Pessoa::getGenero));

        // grupo.forEach((genero, p)->{
        //     System.out.println(genero);
        //     p.forEach(System.out::println);
        //     System.out.println();
        // });


        // String name = null;
        // System.out.println(name.length());     
        
        // int count = Collections.frequency(getPessoas(), Genero.FEMININO);
        // System.out.println("Quantidade do Genero Feminino: " +count);
        

        //list.forEach(System.out::println);
    }

    // public static List<Pessoa> getPessoas(){
    //     return List.of(
    //         new Pessoa("Jose", 50, Genero.MASCULINO),
    //         new Pessoa("Maria", 25, Genero.FEMININO),
    //         new Pessoa("Antonio", 16, Genero.MASCULINO),
    //         new Pessoa("Marta", 44, Genero.FEMININO),
    //         new Pessoa("Pedro", 36, Genero.MASCULINO),
    //         new Pessoa("Patricia", 54, Genero.FEMININO),
    //         new Pessoa("Marcos", 90, Genero.MASCULINO)
    //     );
    // }
    
}