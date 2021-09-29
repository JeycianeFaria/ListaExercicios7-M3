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


}
