public class Conta {
    private int numeroDaConta;
    private double saldo;
    private Cliente cliente;

    public Conta(int numeroDaConta, double saldo,
                 double limite, Cliente cliente){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Conta(){
    }

    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public void setNumeroDaConta(int novaConta){
        numeroDaConta = novaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novoSaldo) {
        if(novoSaldo <= 0){
            System.out.println("O novo saldo deve ser positivo");
        }else{
            this.saldo = novoSaldo;
        }

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void exibirDetalhes(){
        System.out.println("R$ " +saldo);
        System.out.println(numeroDaConta);
        System.out.println(cliente.titular);
        System.out.println(cliente.cpf);
        System.out.println(cliente.rg);
    }

    public void sacar(double valor){
        saldo -= valor;
        System.out.println("Saque realizado com sucesso!");
        //System.out.println("Saldo após o saque: " +saldo);
    }

    public boolean depositar(double valor){
        if(valor <= 0){
            System.out.println("O valor deve ser positivo");
        return false;
        }
        setSaldo(saldo += valor);
        System.out.println("Deposito realizado com sucesso!");
        return true;

    }


}
