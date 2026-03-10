public class ContaCorrente extends Conta{

    private double valorJurosChequeEspecial;

    public double calcularJurosChequeEspecial(){
        return valorJurosChequeEspecial * 0.17;
    }

    public double getValorJurosChequeEspecial() {
        return valorJurosChequeEspecial;
    }

    public void setValorJurosChequeEspecial(double valorJurosChequeEspecial) {
        this.valorJurosChequeEspecial = valorJurosChequeEspecial;
    }
}
