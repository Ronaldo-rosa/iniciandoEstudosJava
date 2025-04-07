package aula05;

import java.util.Random;

/*Leia uma matriz de 5x5 elementos. Calcule a soma dos elementos que estão acima da diagonal principal.
Leia uma matriz de 5x5 elementos. Calcule a soma dos elementos que estão abaixo da diagonal principal.
*/
public class Ex07 {
    public static void main(String[] args) {
        int resultadoAcimaDiagonal = 0;
        int resultadoAbaixoDiagonal = 0;
        int linha = 5;
        int coluna = 5;
        int[][] matrizC = new int[linha][coluna];
        Random random = new Random();
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matrizC[i][j] = random.nextInt(50);
            }
        }
        System.out.println("Matriz");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%02d ", matrizC[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (j>i){
                    resultadoAcimaDiagonal += matrizC[i][j];
                }
            }
        }
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i>j){
                    resultadoAbaixoDiagonal += matrizC[i][j];
                }
            }
        }
        System.out.println("Soma dos elementos acima da diagonal principal");
        System.out.println(resultadoAcimaDiagonal);
        System.out.println("Soma dos elementos abaixo da diagonal principal");
        System.out.println(resultadoAbaixoDiagonal);
    }
}
