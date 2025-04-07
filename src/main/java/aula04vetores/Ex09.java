package aula04vetores;

import java.util.Scanner;

/*9 - Ler dois vetores: R de 5 elementos e S de 10 elementos. Gerar um vetor X de 15 elementos cujas 5 primeiras posições contenham os elementos de R e as 10 últimas posições, os elementos de S. Escrever o vetor X. */
public class Ex09 {
    public static void main(String[] args) {
        int[] R = new int[5];
        int[] S = new int[10];
        int[] X = new int[15];


        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite 5 valores para o vetor 'R'");
        for (int i = 0; i < R.length; i++) {
            System.out.println("digite o "+(i+1)+"º valor");
            R[i] = obterDados.nextInt();
        }
        System.out.println("Digite 5 valores para o vetor 'S'");
        for (int i = 0; i < S.length; i++) {
            System.out.println("digite o "+(i+1)+"º valor");
            S[i] = obterDados.nextInt();
        }
        /* fazer vetor X receber valor de vetor R, iniciar o for na posiçao 4 do vetor  x, repetir o encremento com o tamanho do vetor S e depois criar outro for para imprimir o valor de X no terminal*/
    }
}
