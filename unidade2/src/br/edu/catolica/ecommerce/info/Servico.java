package br.edu.catolica.ecommerce.info;

import java.time.LocalDate;

public class Servico {

    private Pessoa pessoa;
    private TipoServico tipoServico;
    private double valor;


    public Servico(Pessoa pessoa, TipoServico tipoServico, double valor) {
        this.pessoa = pessoa;
        this.tipoServico = tipoServico;
        this.valor = valor;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Serviço: " + tipoServico + ", R$: " + valor ;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Servico other = (Servico) obj;
        if (pessoa == null) {
            if (other.pessoa != null)
                return false;
        } else if (!pessoa.equals(other.pessoa))
            return false;
        return true;
    }

    

    

    

    
}
