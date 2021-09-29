package br.com.zup;

import java.util.List;

public class PratoDoDia {

    //Atributos
    private String nomeDoPrato;
    private  double valorDoPrato;
    //Lista de Ingredientes


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

}
