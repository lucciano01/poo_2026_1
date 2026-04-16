package br.edu.catolica.poo.collections.map;

import br.edu.catolica.poo.collections.list.Pessoa;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args) {

        Map<String, Pessoa> pessoas = new HashMap<>();
        pessoas.put("999", new Pessoa("Joao", 50, 'M', "123"));
        pessoas.put("123", new Pessoa("Antonia", 50, 'M', "123"));
        pessoas.put("321", new Pessoa("Maria", 18, 'F', "321"));

        //System.out.println(pessoas);
        pessoas.entrySet()
                .forEach(

                        p -> System.out.println("Chave: "+p.getKey()
                                + " - Nome : "+p.getValue().getNome()));

    }
}
