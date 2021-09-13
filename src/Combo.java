public class Combo {

    private String sanduiche;
    private String batata;
    private String salada;
    private String refrigerante;


    // Construtor da classe Combo
    // Definir estado inicial do objeto para vazio/nulo/zero
    public Combo(){
        this.setSanduiche("");
        this.setBatata("");
        this.setSalada("");
        this.setRefrigerante("");
    }
    // Construtor de atribuição
    // Definir o estado inicial do objeto com valores passados por parâmetro
    public Combo(String sanduiche, String batata, String salada, String refrigerante){
        this.setSanduiche(sanduiche);
        this.setBatata(batata);
        this.setSalada(salada);
        this.setRefrigerante(refrigerante);
    }

    // Getters e setters da classe Combo
    public String getSanduiche() {
        return sanduiche;
    }

    public void setSanduiche(String sanduiche) {
        this.sanduiche = sanduiche;
    }

    public String getBatata() {
        return batata;
    }

    public void setBatata(String batata) {
        this.batata = batata;
    }

    public String getSalada() {
        return salada;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public String getRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(String refrigerante) {
        this.refrigerante = refrigerante;
    }
}
