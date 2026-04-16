package br.edu.catolica.poo.collections.estudo_de_caso;

public class Servico {

    private Usuario usuario;
    private TipoServico tipoServico;
    private double valor;

    public Servico(Usuario usuario, TipoServico tipoServico, double valor) {
        this.usuario = usuario;
        this.tipoServico = tipoServico;
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "usuario=" + usuario +
                ", tipoServico=" + tipoServico +
                ", valor=" + valor +
                '}';
    }
}
