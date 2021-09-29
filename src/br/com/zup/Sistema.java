package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {

    //Métodos
    //Receber dados do usuário
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //Menu
    public static void menu() {
        System.out.println("======Bem vindo ao Restaurante Mineiro======");
        System.out.println("1- Cadastrar Prato.");
        System.out.println("2- Cadastrar Ingrediente");
        System.out.println("3-Adicionar Ingredientes aos Pratos");
        System.out.println("4- Exibir Cardápio");
        System.out.println("5- Sair");
    }

    //Cadastrar Prato
    public static PratoDoDia cadastrarPrato() {
        String nome = capturarDados("Digite o nome do Prato: ").nextLine();
        double valor = capturarDados("Digite o valor do do prato: ").nextDouble();

        PratoDoDia prato = new PratoDoDia(nome, valor);
        return prato;
    }

    //Cadastrar Ingrediente
    public static  Ingrediente cadastrarIngrediente(){
        String nome = capturarDados("Digite o nome do ingrediente: ").nextLine();

        Ingrediente ingrediente = new Ingrediente(nome);
        return  ingrediente;
    }

}
