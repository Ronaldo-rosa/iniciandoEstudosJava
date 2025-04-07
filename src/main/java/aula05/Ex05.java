package aula05;

import java.util.Random;

/*Gerar uma matriz quadrada aleatoriamente de 10x10 e imprimir a diagonal desta matriz
 */
public class Ex05 {
    public static void main(String[] args) {
        int linha = 10;
        int coluna = 10;
        int [][] matrizAl = new int[linha][coluna];
        Random random = new Random();

        /*gera uma matriz de 0 a 100 aleatória*/
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matrizAl[i][j] = random.nextInt(100);
            }
        }
        /*Imprime a matriz na tela*/
        System.out.println("matriz");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%03d ", matrizAl[i][j]);
            }
            System.out.println();
        }
        /*Imprime a diagonal principal na tela*/
        System.out.println("Diagonal principal da matriz");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i==j){
                    System.out.printf("%03d%n", matrizAl[i][j]);
                }
            }
        }

        /*imprime a diagonal secundaria na tela*/
        System.out.println("Diagonal secundária da matriz");
        for (int i = 0; i < matrizAl.length; i++) {
            for (int j = 0; j < matrizAl[i].length; j++) {
                if (i+j== matrizAl.length-1){
                    System.out.printf("%03d%n", matrizAl[i][j]);
                }
            }
        }
    }
}
