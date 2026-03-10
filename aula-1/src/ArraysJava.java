import java.util.Locale;
import java.util.Scanner;

public class ArraysJava {

    public static void main(String[] args) {

        int [] numbers = new int[5];

//        for(int i = 0; i <= 10; i++){
//            System.out.println(i);
//        }
        int [] numeros = new int[]{5,8,7,4,1};
//        for (int i = 0; i < numeros.length; i++){
//            System.out.println(numeros[i]);
//        }

        numeros[2] = 50;
        numeros[4] = 2500;
//        for (int i = 0; i < numeros.length; i++){
//            System.out.println(numeros[i]);
//        }

//        for(int numero : numeros){
//            System.out.println(numero);
//        }

        int start = 10;
        int end = 10;

//        while (start != end){
//            System.out.println(start);
//            start++;
//        }
//        do{
//            System.out.println(start);
//            start++;
//
//        }while (start != end);
        int opcao;

//        do {
//            var scanner = new Scanner(System.in);
//            String menu = """
//                    1 - Cadastrar Produto
//                    2 - Excluir produto
//                    0 - Sair
//                    """;
//            System.out.println(menu);
//            System.out.print("Digite uma opcao: ");
//            opcao = scanner.nextInt();
//
//        }while (opcao != 0);
        int op = 0;
        int count = 0;
        double peso = 0;
        double maiorPeso = 0;
        double menorPeso = 0;
        var sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        do {
            System.out.println("1: Registrar Peso");
            System.out.println("2: Finalizar");
            System.out.print("Digite uma opcao: ");
            op = sc.nextInt();
            if(op == 2){
                break;
            }
            System.out.print("Digite o peso: ");
            peso = sc.nextDouble();
            if(count == 0){
                menorPeso = peso;
                maiorPeso = peso;
            }else{
                if(peso > maiorPeso){
                    maiorPeso = peso;
                }
                if(peso < menorPeso){
                    menorPeso = peso;
                }
            }
            count++;

        }while (op == 1);
        System.out.println("Quantidade de animais: " +count);
        System.out.println("Maior peso registrado: " +maiorPeso);
        System.out.println("Menor peso registrado: " +menorPeso);


    }
}
