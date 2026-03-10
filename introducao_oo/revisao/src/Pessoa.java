public class Pessoa {

    private String nome;
    private Endereco endereco;

    public Pessoa(String name, Endereco endereco) {
        this.nome = name;
        this.endereco = endereco;
    }

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
