package br.edu.catolica.poo.collections.list;

import java.util.*;


public class ExemplosList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Julia");
        nomes.add("Jose");
        nomes.add("Maria");
        nomes.add("Ana");
        nomes.add("Pedro");
         //adiciona o item na lista pelo indice
         //nomes.add(2, "Neymar");
         //nomes.add(3, "Pelé");

//        for(String nome: nomes){
//            System.out.println("Nome: " +nome);
//        }
        //altera o valor de um item da lista pelo indice
        //nomes.set(2 , "Nome alterado ");

        //remove um item da lista pelo indice
        // nomes.remove(2);

        //remove todos os itens da lista
       // nomes.clear();
       // System.out.println("***********************");

        //ordenar a lista
        //Collections.sort(nomes);
        //for aprimorado
//        for(String nome: nomes){
//            System.out.println("Nome: " +nome);
//        }
        //for convencional
//        for(int i = 0; i < nomes.size(); i++ ){
//            System.out.println(nomes.get(i));
//        }

      //  System.out.println("Quantidade de itens na lista: "+ nomes.size());

    List<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(new Pessoa("Jose", 25, 'M', "123"));
    pessoas.add(new Pessoa("Maria", 50, 'F', "456"));
    pessoas.add(new Pessoa("Pedro", 30, 'M', "789"));
    pessoas.add(new Pessoa("Pedro", 30, 'M', "789"));

//    for(Pessoa p : pessoas){
//        System.out.println(p);
//       // System.out.println("Nome: "+p.getNome() + " - Idade: "+p.getIdade() +" - Gênero: " +p.getGenero());
//    }

    Set<String> names = new HashSet<>();
    names.add("Maria");
    names.add("Pedro");
    names.add("Maria");

    for(String n: names){
        System.out.println(n);
    }

        Set<Pessoa> pessoasSet = new HashSet<>();
        pessoasSet.add(new Pessoa("Jose", 25, 'M', "123"));
        pessoasSet.add(new Pessoa("Maria", 50, 'F', "456"));
        pessoasSet.add(new Pessoa("Pedro", 30, 'M', "789"));
        pessoasSet.add(new Pessoa("Pedro", 30, 'M', "789"));

//        for(Pessoa p : pessoasSet){
//            System.out.println(p);
//        }

        Set<String> veiculos = new TreeSet<>();
        veiculos.add("Fusca");
        veiculos.add("Gol");
        veiculos.add("BMW");

        for(String v : veiculos){
            System.out.println(v);
        }


    }

}
