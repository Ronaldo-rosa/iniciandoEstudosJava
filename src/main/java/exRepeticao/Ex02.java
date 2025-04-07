package exRepeticao;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /*Faça um programa que leia um número até que ele seja maior que 10*/
        Scanner obterDados = new Scanner(System.in);
        int cont = 1;
        int numero;

        do {
            System.out.println("Digite um número: ");
            numero = obterDados.nextInt();
            numero++;
        }
        while (numero>=10);

    }
}
