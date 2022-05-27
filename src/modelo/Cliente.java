package modelo;

public class Cliente {
    private String nome;
    private String telefone;
    private String cidade;
    private boolean ativo;

    private double altura;
    private double peso;


    //construtor vazio é para instanciar o objeto sem os valores iniciais;
//    public Cliente(){
//
//    }
// construtor com os atributos é para instanciar o objeto passando por parametro os atributos;
    public Cliente(String nome, String telefone, String cidade, boolean ativo) {
        this.nome = nome; // posso atribuir o valor aqui nos atributos, quando for instanciar o objeto ja vai preencher com o valor;
        this.telefone = telefone;
        this.cidade = cidade;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cidade='" + cidade + '\'' +
                ", ativo=" + ativo +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }

    public void inativar(){
        if (this.ativo){
            this.ativo = false;
        }
    }

    public double calcularIMC(double peso, double altura){
        double imc = (peso/ (altura * altura));
        return imc;
    }
}
