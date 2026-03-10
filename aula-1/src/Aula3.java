import java.util.Scanner;

public class Aula3 {

    public static void main(String [] args) {

        String nome  = "JOSE";
        String nome1  = "jose";

        //metodo para verificar se a String esta vazia
       // System.out.println(nome.isEmpty());
        //metodo para verificar a quantidade caracteres de uma String
        //System.out.println(nome.length());
        //System.out.println(nome == nome1);
        //System.out.println(nome.equals(nome1));
       // System.out.println(nome.equalsIgnoreCase(nome1));
       // System.out.println(nome1.contains("S"));
        //System.out.println("Sejam bem vindo " +nome);
        //String n = "Seja bem vindo ".concat(nome);
       // System.out.println(n);
        var sb = new StringBuilder();
        sb.append("Ola seja bem vindo")
                .append(" a discplina de POO")
                .append(" 2026.2");
        String msg = sb.toString();
        //System.out.println(msg);

        //cast de dados implicito
//        int number = 10;
//        System.out.println(10);
//        double dNumber = number;
//        System.out.println(dNumber);

        //cast de dados explicito
//        double num = 10.5;
//        int n = (int)num;
//        System.out.println(n);

       /* var sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        String result = (idade >= 18 ) ?
                "Voce tem ".concat(String.valueOf(idade)) : "Menor de idade";
        System.out.println(result);

        */

        var sc = new Scanner(System.in);
       // Scanner scanner = new Scanner(System.in);
//        System.out.print("Digite a hora: ");
//        int hora = sc.nextInt();
//
//       String mensagem =
//               hora < 12 ? "Bom dia" :
//                       hora < 18 ? "Boa tarde" : "Boa noite";
//        System.out.println(mensagem);

        boolean isSunday = true;
        boolean isMorning = true;

        if(isSunday && isMorning){
            System.out.println("Vou a praia");
        }

        if(isSunday || !isMorning){
            System.out.println("Vou a praia");
        }

        if(!isSunday || !isMorning){
            System.out.println("Esse bloco nao sera impresso");
        }
    }

    //Python (and) - Java (&&)
    //Python (or) - Java (||)
    //Python (not) - Java (!)




}
