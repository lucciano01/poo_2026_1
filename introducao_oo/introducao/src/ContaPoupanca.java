import java.util.HashMap;
import java.util.Map;

public class ContaPoupanca extends Conta {

    private double rendimento;


    String [] nomes = {"João", "Maria", "Pedro", "Ana"};


    public double calcularRendimento(double saldoAtual){
        rendimento = saldoAtual * 0.05;
        return rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }


}
