package aula03repeticao;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        /*Escreva um algoritmo que leia 10 valores e conte quantos deles estão no intervalo entre 10 e 20.
        Depois escreva essa informação*/
        Scanner obterDados = new Scanner(System.in);
        int cont = 0;
        System.out.println("Digite 10 valores");
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor" + (i + 1) + ":");
            int valor = obterDados.nextInt();
            if (valor >= 10 && valor <= 20) {
                cont++; // Incrementa o contador se o valor estiver no intervalo
            }
            System.out.println("Quantidade de valores no intervalo entre 10 e 20: " + cont);

        }


    }
}
