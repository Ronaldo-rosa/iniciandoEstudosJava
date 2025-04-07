package aula05;

import java.util.Random;

/* Leia uma matriz de 5x5 elementos. Calcule a soma dos elementos que estão na diagonal principal.
 */
public class Ex06 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrizC = new int[5][5];
        int soma = 0;

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC.length; j++) {
                matrizC[i][j] = random.nextInt(50);
            }
        }
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC.length; j++) {
                System.out.printf("%02d ", matrizC[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < matrizC.length; i++) {

            for (int j = 0; j < matrizC.length; j++) {
                if (i==j){
                    soma += matrizC[i][j];
                }
            }
        }
        System.out.println(soma);
    }
}
