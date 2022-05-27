import modelo.Cliente;

public class Principal {
    public static void main(String[] args) {
        // extansiar objeto é a classe que é o tipo dele, o nome desse objeto que é a referência;
        // uso o new e a classe na frente;
        Cliente cliente = new Cliente("samantha", "5 12345678", "Lambari", true);

        System.out.println(cliente);

//        cliente.setNome("Samantha");
//        cliente.setCidade("Lambari");
//        cliente.setTelefone("35 - 12345678");
//        cliente.setAtivo(true);

        System.out.println(cliente);

        System.out.println(cliente.getNome());
        cliente.setNome("Josimar");
        System.out.println(cliente.getNome());

        cliente.setAltura(1.74);
        cliente.setPeso(73);

        cliente.inativar();

        System.out.println("O método está: " + cliente.isAtivo());


        // Executei um método que retorna um valor, ou se usa uma variavel que recebe um método ou  coloca direto no sout;
        System.out.println("Seu calculo imc será de: " + cliente.calcularIMC(cliente.getPeso(), cliente.getAltura()));
        // Encapsulamento é você proteger o objeto, esconder os detalhes do objeto da implementação do objeto.
        // Não quero que as outras classes usem sem uma  implementação;



    }
}
