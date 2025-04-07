package aula03repeticao;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        /*Escreva um algoritmo para ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere que o N será sempre maior que ZERO.*/
        Scanner obterNumero = new Scanner(System.in);

        int numero;
        do {
            System.out.println("Digite um número inteiro");
            numero = obterNumero.nextInt();
            if(numero <= 0){
                System.out.println("Número invalido, tente novamente.");
            }
        }while (numero <= 0);
        for (int i = 1; i <= numero ; i++) {
            System.out.printf("%02d%n",i);
        }

    }
}
