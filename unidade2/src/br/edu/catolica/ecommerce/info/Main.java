package br.edu.catolica.ecommerce.info;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static Scanner sc = new Scanner(System.in); 
    private static final List<Servico> servicos = new ArrayList<>();


    public static void main(String[] args) {
        
        int opcao  = 0;
        
        do {
            
            var menu = """
                    1- Casdastrar serviço
                    2- Consultar serviços pelo codigo
                    3- Sair
                    """;
            System.out.println("Menu:");
            System.out.println(menu);
            System.out.print("Seleciona uma opcao: ");
            opcao = sc.nextInt();
            sc.useLocale(Locale.US);

        switch (opcao) {
            case 1:
                cadastrarServico();
                break;
            case 2:
                consultaServico();
                break;
            case 3:
                System.exit(0);
                break;
        
            default:
                break;
        }    


        }while (opcao != 0);

    }

    public static void cadastrarServico(){
        TipoServico servicoSelecionado = null;
        int tipoServico = 0;
        String nome = "";

        System.out.print("Digite o cpf do usuario:");
        String cpf = sc.next();

        Pessoa usuario = null;
           for(Servico s : servicos){
            if(s.getPessoa().getCpf().equalsIgnoreCase(cpf)){
                usuario = s.getPessoa();
                break;
            }
           }

        if(Objects.isNull(usuario)){
            System.out.print("Digite o nome do usuario:");
            nome = sc.next();
        }else{
           System.out.println();
           System.out.println("-> Usuário encontrado: " +usuario.getNome()+" <-");
        }
        System.out.println();
        System.out.println("Serviços:");
        var opcaoServico = """
                    1- Hidraulico
                    2- Eletrico
                    3- Alvenaria
                    """;
        System.out.println(opcaoServico);
        System.out.print("Selecione o tipo do servico:");
        tipoServico = sc.nextInt();
         switch (tipoServico) {
            case 1:
                servicoSelecionado = TipoServico.HIDRAULICO;
                break;
            case 2:
                 servicoSelecionado = TipoServico.ELETRICO;
                break;
            case 3:
                 servicoSelecionado = TipoServico.ALVENARIA;
                break;

            default:
                break;
        }    
        System.out.print("Digite o valor do serviço R$: " );
        double valor = sc.nextDouble();
        var servico = new Servico(new Pessoa(nome, cpf), servicoSelecionado, valor);
        servicos.add(servico);
        System.out.println();
        System.out.println("*********************************");
        System.out.println("*Serviço cadastrado com sucesso!*");
        System.out.println("*********************************");        

    }

    public static void consultaServico(){
        List<Servico> servicosCpf = new ArrayList<>();
        System.out.print("Digite o cpf do usuario: " );
        String cpf = sc.next();
        for(Servico servico : servicos){
            if(servico.getPessoa().getCpf().equals(cpf)){
                servicosCpf.add(servico);
            }
        }
        if(servicosCpf.isEmpty()){
            System.out.println("Não foi encontrado nenhum serviço para o cpf :" +cpf);
        }else{
           Map<Pessoa, List<Servico>> pessoasGrupo = servicosCpf.stream()
           .collect(Collectors.groupingBy(Servico::getPessoa));

           pessoasGrupo.forEach((p, servico)-> {
                System.out.println("****************************************");
                System.out.println("Usuario: "+p.getNome()+ " - CPF: " +p.getCpf());
                servico.forEach(System.out::println);
                double total = servico.stream().mapToDouble(Servico::getValor).sum();
                System.out.println("Valor Total R$: " +total);
                System.out.println("****************************************");
           });
        }
        
    }

    
    
}
