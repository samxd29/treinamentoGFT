public abstract class Conta{
    private String Nome;
    private int conta;
    private int agencia;
    private double saldo;
    private double valor;

    public Conta(){}

    public Conta(String nome, int conta, int agencia, double saldo, double valor) {
        Nome = nome;
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.valor = valor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void depositar(double valorDeposito){

        this.saldo = this.saldo + valorDeposito;
    }

    public void sacar(double valorSaque){

        this.saldo = this.saldo - valorSaque;
        System.out.println("Seu saque será no valor de: " + valorSaque);
    }
}
