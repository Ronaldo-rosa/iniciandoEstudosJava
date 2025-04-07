package aula05;

import java.util.Random;

/* Faça um programa que calcule a média dos elementos da diagonal principal de uma matriz 10 X 10 de inteiros.
 */
public class Ex11 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int resultado = 0;
        Random aleatorio = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = aleatorio.nextInt(100);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%03d ", matriz[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i==j){
                    resultado = (matriz[i][j] + matriz[i][j])/10;
                }
            }
        }
        System.out.println("Media: "+ resultado);
    }
}
