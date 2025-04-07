package aula04vetores;

import java.util.Scanner;

/*Declarar um vetor de até 100 números inteiros positivos, pedir para o usuário digitar elementos para o vetor, até que ele digite um 0 ou que o vetor esteja cheio, que encerra a leitura. Mostrar o vetor lido.
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        int[] vetor = new int[100];
        int cont = 0;
        do {
            System.out.println("Digite um valor inteiro ou '0 para encerrar o programa'");
            vetor[cont] = obterDados.nextInt();
            if (vetor[cont]==0){
                break;
            }
            cont++;
        }while (cont < 100);

        for (int i = 0; i < cont; i++) {
            System.out.println("os valores lidos são: " + vetor[i] + " e se encontram na posiçao: " + i);
        }
    }
}
