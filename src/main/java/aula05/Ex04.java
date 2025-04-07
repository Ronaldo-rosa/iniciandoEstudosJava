package aula05;

import java.util.Scanner;

/*Ler uma matriz 4x4 de números inteiros, multiplicar os elementos da diagonal principal por um número inteiro também lido e escrever a matriz resultante.
 */
public class Ex04 {
    public static void main(String[] args) {
        try (Scanner obterDados = new Scanner(System.in)){
            int multiplicador;
            int linha = 4;
            int coluna = 4;
            int [][] matrizResultante = new int[linha][coluna];
            int [][] matriz = new int[linha][coluna];

            System.out.println("Digite um valor para fazer a multiplicação da diagonal principal da matriz");
            multiplicador = obterDados.nextInt();

            System.out.println("Digite o valor da matriz");
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    System.out.printf("Matriz [%d] [%d]:", i,j);
                    matriz[i][j] = obterDados.nextInt();
                }
            }

            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    System.out.printf("%02d ", matriz[i][j]);
                }
                System.out.println();
            }

            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    if (i == j) { // Diagonal principal
                        matrizResultante[i][j] = matriz[i][j] * multiplicador;
                    } else { // Outros elementos
                        matrizResultante[i][j] = matriz[i][j];
                    }
                }
            }

            System.out.println("\nMatriz Resultante:");
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    System.out.printf("%02d ", matrizResultante[i][j]);
                }
                System.out.println();
            }

        }
    }
}
