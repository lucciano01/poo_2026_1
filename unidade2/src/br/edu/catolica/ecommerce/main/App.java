package br.edu.catolica.ecommerce.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import br.edu.catolica.ecommerce.info.Contato;
import br.edu.catolica.ecommerce.info.Endereco;
import br.edu.catolica.ecommerce.usuario.Pessoa;

import java.util.LinkedList;

public class App {
  public static void main(String[] args) {
    
  try{
    int num1 = 10;
    int num2 = 0;

      if(num1 == 0 || num2 == 0 ){
        throw(new ArithmeticException("Não pode dividir por zero"));
      }
      System.out.println(num1/num2);
    }catch(ArithmeticException e){
      System.out.println(e.getMessage());
    }
  }
}




