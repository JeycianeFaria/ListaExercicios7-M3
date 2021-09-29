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


    //Métodos
    //Sobrescrevendo o toString()
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(nomeIngrediente);
        return retorno.toString();
    }
}
