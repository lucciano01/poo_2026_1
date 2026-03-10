import java.util.*;

public class App {
    public static void main(String[] args) {
        Cliente cliente =
                new Cliente("Joao", "525624", 44);

        Conta c1 = new Conta(123,
                1000, 500, cliente );

        Conta c2 = new Conta();
        c2.setNumeroDaConta(52635);
        c2.setCliente(cliente);
        c2.setSaldo(10);
        //System.out.println(c2.getSaldo());
        c2.depositar(10);
       // System.out.println(c2.getSaldo());
//        c1.limite =  1000;
//        c1.numeroDaConta = 123;
//        c1.saldo = 500;
       // c1.cliente = new Cliente();
        //c1.cliente.cpf = "123456978";
       // c1.cliente.titular = "José";
       // c1.cliente.rg = 123456;
        ContaPoupanca cp = new ContaPoupanca();
        cp.setCliente(cliente);
        cp.setSaldo(100);
        cp.setNumeroDaConta(12345);
        double rendimento =
                cp.calcularRendimento(cp.getSaldo());
        cp.setRendimento(rendimento);
        cp.exibirDetalhes();
//        System.out.println("Rendimento Poupança R$:"
//                +cp.getRendimento());



        //c1.exibirDetalhes();
//        System.out.println("---------------------");
//        c2.exibirDetalhes();
        //System.out.println(c2);
//        System.out.println("Saldo antes do saque :" + c1.saldo);
//        c1.sacar(150);
//        System.out.println("Saldo após o saque: " +c1.saldo);

        List<String> nomes = new ArrayList<>();
        nomes.add("Pedro");
        nomes.add("Aline");
        nomes.add("Marcos");
        nomes.add("Ana");

        List<String> result = new ArrayList<>();
        for (String nome : nomes) {
            if (nome.startsWith("A")) {
                result.add(nome);
            }
        }






    }
}
