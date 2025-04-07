package aula05;

import java.util.Scanner;

/*Ler uma matriz G 3x3 e criar 2 vetores, SL e SC, de 3 elementos cada, contendo respectivamente as somas das linhas e das colunas de G. Escrever os vetores criados.
 */
public class Ex03 {
    public static void main(String[] args) {
        try (Scanner obterDados = new Scanner(System.in)) {
            int linha = 3;
            int coluna = 3;
            int[] sl = new int[3];
            int[] sc = new int [3];
            int[][] matrizG = new int[linha][coluna];
            /*escanea as linhas e as colunas*/
            System.out.println("Digite os valores das linhas e das colunas respectivamente");
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    System.out.printf("Matriz [%02d][%02d]: ", i, j);
                    matrizG[i][j] = obterDados.nextInt();
                }
            }

            /*imprime na tela as linhas e as colunas*/
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    System.out.printf("%2d", matrizG[i][j]);
                }
                System.out.println();
            }

            /*soma as linhas da matriz (o valor sempre tem que ser zerado)*/
            int somaLinha=0;
            for (int i = 0; i < matrizG.length; i++) {
                for (int j = 0; j < matrizG.length; j++) {
                    somaLinha += matrizG[i][j];
                }
                /*Incrementa o valor da soma das linhas no vetor*/
                sl[i] = somaLinha;
            }

            /*Soma a coluna, valor sempre tem que ser zerado*/
            int somaColuna = 0;
            for (int j = 0; j < matrizG[0].length; j++) {
                for (int i = 0; i < matrizG.length; i++) {
                    somaColuna += matrizG[i][j];
                }
                /*incrementa o resultado da soma no vetor*/
                sc[j] = somaColuna;
            }

            /*imprime a soma das linhas com o vetor*/
            for (int i = 0; i < sl.length; i++) {
                System.out.println("Linha " + i + ": " +sl[i]);
            }
            /*imprime a soma das colunas com o vetor*/
            for (int i = 0; i < sc.length; i++) {
                System.out.println("Soma " +i+ ": " + sc[i]);
            }

        }
    }
}
