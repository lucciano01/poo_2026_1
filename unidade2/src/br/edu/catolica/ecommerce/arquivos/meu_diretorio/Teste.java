package br.edu.catolica.ecommerce.arquivos.meu_diretorio;

public class Teste {
    
    public static void main(String[] args) {
        
        try{

            var result = 10 / 2;
            System.out.println("Resultado: " +result);

        }catch(ArithmeticException ex){
            System.out.println("Erro: " +ex.getMessage());
        }finally{
            System.out.println("Essa linha será impressa?");
        }

    }
}
