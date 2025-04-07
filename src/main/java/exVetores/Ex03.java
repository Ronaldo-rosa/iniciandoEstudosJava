package exVetores;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /*Declarar um vetor de até 100 números inteiros positivos, pedir para o usuário digitar elementos para o vetor, até que ele digite um 0 ou que o vetor esteja cheio, que encerra a leitura. Mostrar o vetor lido.*/
        Scanner obterDados = new Scanner(System.in);
        int[] vetor = new int[100];
        int cont = 0;
        do {
            System.out.println("Digite um valor");
            int valor = obterDados.nextInt();
            if (valor==0){
                break;
            }
            vetor[cont]=valor;
            cont++;
    } while (cont < 100);

        System.out.println("Valores digitados: ");
        for (int i = 0; i < cont; i++) {
            System.out.println(vetor[i]+" ");
        }

}
}
