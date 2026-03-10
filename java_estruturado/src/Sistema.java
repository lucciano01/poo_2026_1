

import java.util.Scanner;

public class Sistema {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Variáveis soltas (estado espalhado)
            String nomeCliente = "";
            double saldo = 0;
            int opcao = 0;

            System.out.println("Digite o nome do cliente:");
            nomeCliente = sc.nextLine();

            System.out.println("Digite o saldo inicial:");
            saldo = sc.nextDouble();

            while (opcao != 4) {
                System.out.println("\n=== MENU ===");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Mostrar saldo");
                System.out.println("4 - Sair");

                opcao = sc.nextInt();

                if (opcao == 1) {
                    System.out.println("Valor para depósito:");
                    double valor = sc.nextDouble();

                    if (valor > 0) {
                        saldo = saldo + valor;
                        System.out.println("Depósito realizado.");
                    } else {
                        System.out.println("Valor inválido.");
                    }

                } else if (opcao == 2) {
                    System.out.println("Valor para saque:");
                    double valor = sc.nextDouble();

                    if (valor > 0 && valor <= saldo) {
                        saldo = saldo - valor;
                        System.out.println("Saque realizado.");
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido.");
                    }

                } else if (opcao == 3) {
                    System.out.println("Cliente: " + nomeCliente);
                    System.out.println("Saldo atual: " + saldo);

                } else if (opcao == 4) {
                    System.out.println("Encerrando sistema...");

                } else {
                    System.out.println("Opção inválida.");
                }
            }

            sc.close();
        }
  }


