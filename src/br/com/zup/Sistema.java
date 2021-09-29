package br.com.zup;

import java.util.ArrayList;
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
        System.out.println("\n======Bem vindo ao Restaurante Mineiro======");
        System.out.println("O que deseja fazer?");
        System.out.println("1- Cadastrar Prato.");
        System.out.println("2- Exibir Cardápio");
        System.out.println("3- Sair");
    }

    //Cadastrar Prato
    public static PratoDoDia cadastrarPrato() {
        String nome = capturarDados("\nDigite o nome do Prato: ").nextLine();
        double valor = capturarDados("Digite o valor do do prato: ").nextDouble();

        PratoDoDia prato = new PratoDoDia(nome, valor);
        return prato;
    }


    //Adicionar os ingredientes ao prato
    public static PratoDoDia adicionarIngredientes(PratoDoDia prato) {
        double qtdIngredientes = capturarDados("Digite a quantidade de ingredientes do Prato: ").nextDouble();

        for (int contador = 1; contador <= qtdIngredientes; contador++) {
            String nome = capturarDados("Digite o nome do " + contador + "º ingrediente: ").nextLine();

            Ingrediente ingrediente = new Ingrediente(nome);
            prato.adicionarIngrediente(ingrediente);
        }

        return prato;
    }

    //Método para executar todos os métodos
    public static void executar() {

        Cardapio cardapio = new Cardapio();

        boolean menu = true;
        int opcaoSelecionada;

        while (menu) {
            //Exibe o menu
            menu();

            //Recebe a opção do usuario
            opcaoSelecionada = capturarDados("Digite a opção desejada: \n").nextInt();

            if (opcaoSelecionada == 1) {
                //Cadastrar Prato
                PratoDoDia prato = cadastrarPrato();
                adicionarIngredientes(prato);
                cardapio.adicionarPrato(prato);
                System.out.println("\nPrato Cadastrado com sucesso!\n");

            } else if (opcaoSelecionada == 2) {
                //Exibir Cardápio
                System.out.println(cardapio);

            } else if (opcaoSelecionada == 3) {
                //Sair
                menu = false;
                System.out.println("\nObrigada, até a proxima!\n");

            } else {
                System.out.println("\nOpção digitada inválida, digite novamente!\n");
            }

        }

    }

}
