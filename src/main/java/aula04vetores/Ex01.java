package aula04vetores;

import java.util.Scanner;

/*1 - Ler dois vetores, A e B com um número variável de conteúdo (números) (no máximo 10). O programa deve solicitar antes da leitura dos vetores a quantidade de dados a serem lidos (1 a 10), os dois vetores terão o mesmo número de elementos. Gerar um terceiro vetor chamado Soma (de no máximo 10 elementos) que seja a soma dos dados do vetor A com os do vetor B. */
public class Ex01 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        int quantidadeDeDadosLidos;
        int[] numeroA  = new int[10];
        int[] numeroB  = new int[10];
        int[] soma  = new int[10];

        System.out.println("Digite o valor da quantidade de dados que deseja passar.(máximo 10 valores)");
        quantidadeDeDadosLidos = obterDados.nextInt();
        for (int i = 0, j = 0; i < quantidadeDeDadosLidos || j < quantidadeDeDadosLidos; i++, j++) {
            System.out.println("Digite o valor de A: ");
            numeroA[i] = obterDados.nextInt();
            System.out.println("Digite o valor de b: ");
            numeroB[i] = obterDados.nextInt();

        }
        for (int i = 0; i < quantidadeDeDadosLidos; i++) {
            soma[i] = numeroA[i] + numeroB[i];
            System.out.printf("A[%d] = %d | B[%d] = %d | Soma = %d%n", i, numeroA[i], i, numeroB[i], soma[i]);
        }

    }
}
