import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Av principal",
                "500A", "Centro", "Cajazeiras");
//        endereco.setBairro("Centro");
//        endereco.setCidade("Cajazeiras");
//        endereco.setNumero("500A");
//        endereco.setRua("Av. Principal");

   // Pessoa p = new Pessoa("Jose",endereco);
   //     p.setNome("Pedro");
//        p.setEndereco(endereco);

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Jose");
        pf.setCpf("123456");
        pf.setEndereco(endereco);
       // System.out.println("Nome" +p.getNome());
//        System.out.println("Endereco:" +p.getEndereco());
       // System.out.println(pf);
//        PessoaJuridica pj = new PessoaJuridica();
//        pj.setNome("SpaceX");
//        pj.setCnpj("55522266");
//        pj.setEndereco(endereco);
        PessoaFisica pj = new PessoaFisica("Outra empresa", endereco, "2566");
     //   System.out.println(pj);

    }
}
