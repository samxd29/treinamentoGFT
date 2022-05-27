public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(){}

    public ContaPoupanca(String nome, int conta, int agencia, double saldo, double valor, double rendimento) {
        super(nome, conta, agencia, saldo, valor);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void rendimentoConta(){
        this.rendimento = super.getSaldo() * 0.4;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

}
