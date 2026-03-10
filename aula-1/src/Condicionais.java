import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {

        String menu = """
                1 - Cadastrar Produto
                2 - Editar Produto
                3 - Excluir Produto
                """;
        System.out.println(menu);
        var sc = new Scanner(System.in);
        System.out.print("Selecione uma opcao: ");
        int opcao = sc.nextInt();

//        switch (opcao){
//            case 1 :
//                System.out.println("Cadastro de Produtos");
//            break;
//            case 2 :
//                System.out.println("Editar Produto");
//            break;
//            case 3 :
//                System.out.println("Excluir Produto");
//            break;
//            default:
//                System.out.println("Opcao invalida!");
//        }

        switch (opcao){
            case 1 -> System.out.println("Cadastrar Produto");
            case 2 -> System.out.println("Editar Produto");
            case 3 -> System.out.println("Excluir Produto");
            default -> System.out.println("Opcao invalida");
        }

    }

}
