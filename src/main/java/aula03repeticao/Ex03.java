package aula03repeticao;
import java.util.Scanner;
public class Ex03 {

    public static void main(String[] args) {
        /*Escreva um algoritmo para ler um valor entre 1 (inclusive) e 10 (inclusive).
        Se o valor lido não estiver entre 1 (inclusive) e 10 (inclusive),
        deve ser lido um novo valor. Após a leitura do valor, escrever o valor lido na tela.
         */
        Scanner obterDados = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.println("Digite um numero");
            numero = obterDados.nextInt();
            if (numero<=10){
                System.out.println("Número Digitado é: "+numero);
            }
        }
        while (numero < 1 || numero > 10);


    }
}

