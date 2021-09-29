package br.com.zup;

public class Main {

    public static void main(String[] args) {

        //Teste
        Ingrediente ingrediente1 = new Ingrediente("Frango");
        Ingrediente ingrediente2 = new Ingrediente("Batata Frita");
        PratoDoDia prato1 = new PratoDoDia("Estrogonofe",24);

        prato1.exibirLista();
        prato1.adicionarIngrediente(ingrediente1);
        prato1.exibirLista();


    }
}
