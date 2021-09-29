package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class PratoDoDia {

    //Atributos
    private String nomeDoPrato;
    private  double valorDoPrato;
    private List<Ingrediente> ingredientes = new ArrayList<>();


    //Construtor
    public PratoDoDia() {
    }

    public PratoDoDia(String nomeDoPrato, double valorDoPrato) {
        this.nomeDoPrato = nomeDoPrato;
        this.valorDoPrato = valorDoPrato;
    }


    //Getters e Setters
    public String getNomeDoPrato() {
        return nomeDoPrato;
    }

    public void setNomeDoPrato(String nomeDoPrato) {
        this.nomeDoPrato = nomeDoPrato;
    }

    public double getValorDoPrato() {
        return valorDoPrato;
    }

    public void setValorDoPrato(double valorDoPrato) {
        this.valorDoPrato = valorDoPrato;
    }


    //Métodos
    //Adicionar ingrediente a Lista de ingredientes
    public void adicionarIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }

    //exibir lista de ingredientes
    public void exibirLista(){
        for (Ingrediente referencia:ingredientes) {
            System.out.println(referencia);
        }
    }

    //Sobreescrevendo método toString()
    @Override
    public String toString() {
        StringBuilder retorno =  new StringBuilder();
        retorno.append("======Cadárpio======");
        retorno.append("\nNome Prato: " + nomeDoPrato);
        retorno.append("\nValor: R$" + valorDoPrato);
        retorno.append("\nIngredientes: " + ingredientes);
        return retorno.toString();
    }
}
