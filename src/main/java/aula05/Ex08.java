package aula05;

import java.util.Random;
import java.util.Scanner;

/*8 - Leia uma matriz 5 x 5. Leia também um valor X. O programa deverá fazer uma busca desse valor na matriz e, ao final, escrever a localização (linha e coluna) ou uma mensagem de “não encontrado”.*/
public class Ex08 {
    public static void main(String[] args) {
        try (Scanner obterDados = new Scanner(System.in)){
            int valorx;
            int linha = 5;
            int coluna = 5;
            int[][] matrizC = new int[linha][coluna];
            Random random = new Random();
            boolean encontrado = false; // Flag para controlar se o valor foi encontrado

            System.out.println("Digite um valor pra fazer a busca:");
            valorx = obterDados.nextInt();

            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    matrizC[i][j] = random.nextInt(30);
                }
            }
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    System.out.printf("%02d ", matrizC[i][j]);
                }
                System.out.println();
            }
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna ; j++) {
                    if (matrizC[i][j] == valorx){
                        System.out.printf("Valor %d encontrado na posição [%d][%d]\n", valorx, i, j);
                        encontrado = true;
                    }
                }
            }
            if (!encontrado) {
                System.out.println("Valor não encontrado.");
            }
        }
    }
}
