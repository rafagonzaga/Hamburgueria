public class Produto {
    // Atributos da classe Produto
    // Características de um produto
    // Produtos possíveis

    private String nome;
    private String tipo;
    private String tamanho;
    private double valor;

    // Construtor define o estado inicial da classe
    // Pelo Javabens este não recebe parametro e inicializa tudo com vazio;
    public Produto(){
        this.setNome("");
        this.setTipo("");
        this.setTamanho("");
        this.setValor(0);
    }

    // Construtor de atribuicao
    public Produto(String nome, String tipo, String tamanho){
        this.setNome(nome);
        this.setTipo(tipo);
        this.setTamanho(tamanho);
        this.setValor(10.0);
    }

    // Getters e setters dos atributos da classe produto
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
