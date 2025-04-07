package aula04vetores;

import java.util.Random;

/*Declarar um vetor números com 20 elementos, gerar valores inteiros para ele aleatoriamente. Declare outros dois vetores, par e impar. No vetor par armazenar todos os elementos pares do vetor números. No vetor ímpar armazenar todos os elementos ímpares de números. Imprima os dois vetores. */
public class Ex05 {
    public static void main(String[] args) {

        int[] vetorTotal = new int[20];
        int[] vetorPar = new int[20];
        int[] vetorImpar = new int[20];
        Random aleatorio = new Random();

        System.out.println("vetores aleatórios: ");
        for (int i = 0; i < vetorTotal.length; i++) {
            vetorTotal[i] = aleatorio.nextInt(50);
            System.out.printf("%02d posição %02d%n", vetorTotal[i],i);
        }

        System.out.println("Vetores pares: ");
        for (int i = 0; i < vetorPar.length; i++) {
            if(vetorTotal[i]%2==0){
                vetorPar[i] = vetorTotal[i];
                System.out.printf("%02d posição %02d%n", vetorPar[i],i);
            }
        }

        System.out.println("Vetores impares: ");
        for (int i = 0; i < vetorImpar.length; i++) {
            if(vetorTotal[i]%2!=0){
                vetorImpar[i] = vetorTotal[i];
                System.out.printf("%02d posição %02d%n", vetorImpar[i],i);
            }
        }

    }
}

/*-------------------------------------------------------------------------------------*/
        /*DICA OTIMIZADA*/
        /*package aula04vetores;

import java.util.Random;

public class Ex05 {
    public static void main(String[] args) {
        int[] vetorTotal = new int[20];
        int[] vetorPar = new int[20];
        int[] vetorImpar = new int[20];
        Random aleatorio = new Random();

        // Contadores separados para pares e ímpares
        int contPar = 0;
        int contImpar = 0;

        System.out.println("Vetor original:");
        for (int i = 0; i < vetorTotal.length; i++) {
            vetorTotal[i] = aleatorio.nextInt(50);
            System.out.printf("%02d ", vetorTotal[i]);
        }

        // Separando pares e ímpares
        for (int num : vetorTotal) {
            if (num % 2 == 0) {
                vetorPar[contPar] = num;
                contPar++;
            } else {
                vetorImpar[contImpar] = num;
                contImpar++;
            }
        }

        // Imprimindo apenas os valores válidos (sem os zeros extras)
        System.out.println("\n\nVetor Par:");
        for (int i = 0; i < contPar; i++) {
            System.out.printf("%02d ", vetorPar[i]);
        }

        System.out.println("\n\nVetor Ímpar:");
        for (int i = 0; i < contImpar; i++) {
            System.out.printf("%02d ", vetorImpar[i]);
        }
    }
}*/


