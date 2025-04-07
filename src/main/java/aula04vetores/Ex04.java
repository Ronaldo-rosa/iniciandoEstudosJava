package aula04vetores;

import java.util.Scanner;

/*4 - Ler um vetor A de 10 elementos inteiros e um valor X também inteiro. Armazenar em um vetor M o resultado de cada elemento de A multiplicado pelo valor X. Logo após, imprimir o vetor M.*/
public class Ex04 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorM = new int[10];

        for (int i = 0; i <vetorM.length ; i++) {
            System.out.println("Digite o valor de vetA: ");
            vetorA[i] = obterDados.nextInt();
            System.out.println("Digite o valor de vetB: ");
            vetorB[i] = obterDados.nextInt();
        }
        for (int i = 0; i < vetorM.length; i++) {
            vetorM[i] = vetorA[i] * vetorB[i];
            System.out.printf("%02d%n",vetorM[i]);
        }
    }
}
