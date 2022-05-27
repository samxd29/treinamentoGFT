public class ContaCorrente extends Conta{
    private double saldoCheque;

    public ContaCorrente() {
    }

    public ContaCorrente(String nome, int conta, int agencia, double saldo, double valor, double saldoCheque) {
        super(nome, conta, agencia, saldo, valor);
        this.saldoCheque = saldoCheque;
    }

    public double getSaldoCheque() {
        return saldoCheque;
    }

    public void setSaldoCheque(double saldoCheque) {
        this.saldoCheque = saldoCheque;
    }
}
