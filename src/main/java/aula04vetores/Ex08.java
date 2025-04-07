package aula04vetores;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        int[] X = new int[10]; // Vetor original
        int[] R = new int[10]; // Vetor para negativos
        int contNegativos = 0;  // Contador de posições em R

        // Lendo os 10 números
        for (int i = 0; i < X.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            X[i] = obterDados.nextInt();

            // Se for negativo, copia para R
            if (X[i] < 0) {
                R[contNegativos] = X[i];
                contNegativos++;
            }
        }

        // Exibindo o vetor X
        System.out.println("\nVetor X (original):");
        for (int num : X) {
            System.out.print(num + " ");
        }

        // Exibindo o vetor R (sem os zeros)
        System.out.println("\n\nVetor R (apenas negativos):");
        for (int i = 0; i < contNegativos; i++) {
            System.out.print(R[i] + " ");
        }
    }
}