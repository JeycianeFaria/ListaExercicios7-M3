package br.com.zup;

public class Ingrediente {

    //Atributos
    private String nomeIngrediente;


    //Construtor
    public Ingrediente() {
    }

    public Ingrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }


    //Getter e Setter
    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

}
