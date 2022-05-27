public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaPoupanca.depositar(100);

        System.out.println("Seu saldo na Conta é: " + contaPoupanca.getSaldo());

        contaPoupanca.sacar(32);
        System.out.println("Seu saldo atual é de: " + contaPoupanca.getSaldo());

        contaPoupanca.rendimentoConta();
        System.out.println("Seu rendimento é de: " + contaPoupanca.getRendimento());


    }
}
