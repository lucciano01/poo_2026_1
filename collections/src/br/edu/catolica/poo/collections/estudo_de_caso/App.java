package br.edu.catolica.poo.collections.estudo_de_caso;

import java.security.Provider;
import java.util.*;
import java.util.stream.Collectors;

public class App {

    private static List<Servico> servicos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;

        do{

            String menu = """
                    1 - Cadastrar servico
                    2 - Consultar servico pelo cpf
                    3 - Sair
                    """;
            System.out.println(menu);
            sc.useLocale(Locale.US);
            System.out.println("Selecione uma opcão: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    cadastrarServico();
                    break;
                case 2:
                    consultarServico();
                    break;
                case 3:
                    System.exit(0);
            }
        }while(opcao != 0);
    }

    public static void cadastrarServico(){
        TipoServico tipoServico = null;
        String nome = "";
        Usuario usuario = null;
        System.out.print("Digite o cpf: ");
        String cpf = sc.next();
        for(Servico s : servicos){
            if(s.getUsuario().getCpf().equals(cpf)){
                usuario = s.getUsuario();
                break;
            }
        }
        if(Objects.nonNull(usuario)){
            System.out.println("Usuario " +usuario.getNome()
                    +" já cadastrado");
        }else {
            //   System.out.print("Digite o cpf: ");
            // cpf = sc.next();
            System.out.print("Digite o nome do usuario: ");
            nome = sc.next();
        }
            System.out.print("Tipos de Serviço: ");
            String tipoDeServico = """
                    1 - Hidraulica
                    2 - Eletrico
                    3 - Alvenaria
                    """;
            System.out.println(tipoDeServico);
            System.out.print("Selecione um tipo de serviço: ");
            int servico = sc.nextInt();
            switch (servico){
                case 1:
                    tipoServico = TipoServico.HIDRAULICA;
                    break;
                case 2:
                    tipoServico = TipoServico.ELETRICO;
                    break;
                case 3:
                    tipoServico = TipoServico.ALVENARIA;
                default:
                    break;
            }
            System.out.print("Digite o valor do serviço: ");
            double valor = sc.nextDouble();
            var servicoUsuario =
                    new Servico(new Usuario(cpf, nome),tipoServico, valor);
            servicos.add(servicoUsuario);
            System.out.println("******************************");
            System.out.println("*Serviço cadastrado com sucesso!*");
            System.out.println("******************************");
            System.out.println();
        }




    public static void consultarServico(){
      //  List<Servico> listUsuario = new ArrayList<>();
        List<Servico> servicosCpf = new ArrayList<>();
        System.out.print("Digite o cpf: ");
        String cpf = sc.next();
        for(Servico s: servicos){
            if(cpf.equals(s.getUsuario().getCpf())){
                servicosCpf.add(s);
            }
        }
         if(servicosCpf.isEmpty()){
            System.out.println("Não foi encontrado nenhum serviço par o cpf: " +cpf);
        }else{
         Map<Usuario, List<Servico>> listServicoUsuario =  servicosCpf.stream()
                    .collect(Collectors.groupingBy(Servico::getUsuario));
            listServicoUsuario.forEach(((usuario, servicos1) -> {
                System.out.println("*************************");
                System.out.println("Usuario: " +usuario.getNome()+ " - CPF:" +usuario.getCpf());
                servicos1.forEach(System.out::println);
                double total = servicos1.stream()
                        .mapToDouble(Servico::getValor).sum();
                System.out.println("Total R$: " +total);
                System.out.println("**********************");
            }));

         }

//        System.out.println();
//        System.out.println("**************");
//        listUsuario.forEach(System.out::println);
//        System.out.println("**************");

    }

}
