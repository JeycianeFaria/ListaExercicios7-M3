package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    //Atributos
    private List<PratoDoDia> cardapio = new ArrayList<>();

    //Métodos
    public void adicionarPrato(PratoDoDia prato){
        cardapio.add(prato);
    }

    //exibir cardapio
    public void exibirCardapio(){
        for (PratoDoDia referencia: cardapio){
            System.out.println(referencia);
        }
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n======Cadárpio======\n");
        retorno.append(cardapio);
        retorno.append("\n=========Fim=========\n");

        return retorno.toString();
    }
}
