package aula03repeticao;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        /*Escreva um algoritmo que leia um número calcule e imprima a tabuada dele (1 a 10)*/
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = obterDados.nextInt();
        int resultado =0;
        for (int i = 1; i <= 10 ; i++) {
            resultado = numero * i;
            System.out.println(numero + " X " +i+" = " +resultado);
        }

    }
}
