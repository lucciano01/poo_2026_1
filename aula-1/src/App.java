import java.util.Scanner;

public class App {

    public static int sum(int num1, int b){
        return num1 + b;
    }

    public static void sumWithoutReturn(double a, double b){
        System.out.println(a + b);
    }



    static void main(String[] args) {
//        int result = sum(5 , 5);
//        System.out.println(result);
//
//       sumWithoutReturn(15, 20);

//        for(String argumentos: args){
//            System.out.println(argumentos);
//        }


        var sc1 = new Scanner(System.in);
//        System.out.print("Digite o primeiro numero:");
//        var num1 = sc1.nextDouble();
//        System.out.println("Digite o segundo numero:");
//        var num2 = sc1.nextDouble();
//        sumWithoutReturn(num1, num2);
        System.out.print("Digite seu nome:");
        var nome = sc1.next();
        System.out.println("Seja bem vindo, " +nome);

    }


}
