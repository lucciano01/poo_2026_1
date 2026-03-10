public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String name, Endereco endereco, String cpf) {
        super(name, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                "nome='" + super.getNome() + '\'' +
                "endereco='" + super.getEndereco() + '\'' +
                '}';
    }
}
