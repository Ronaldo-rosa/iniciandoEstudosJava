package aula03repeticao;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        /*Escreva um algoritmo que pergunte ao usuário um número e após, escreva na tela a soma total de 1 até o número lido. Exemplo: Número lido é o 5. Resultado: 1+2+3+4+5 = 15
         */
        Scanner obterDados = new Scanner(System.in);
        int numero;
        int resultado =0;
        System.out.println("Digite um número");
        numero = obterDados.nextInt();
        for (int i = 1; i <= numero; i++) {
            resultado +=i;
        }
        System.out.print("Conta: ");
        for (int i = 1; i <= numero; i++) {
            System.out.print(i);
            if (i < numero) System.out.print(" + ");
        }
        System.out.println(" = " + resultado);
    }
}
