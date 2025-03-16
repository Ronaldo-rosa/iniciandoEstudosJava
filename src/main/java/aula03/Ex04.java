package aula03;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args){
        Scanner obterDados = new Scanner(System.in);
        //Escreva um programa em Java que recebe um inteiro e diga se é par ou ímpar.
        //Use o operador matemático % (resto da divisão ou módulo) e o teste condicional if

        System.out.println("Digite um número inteiro: ");
        int numeroDigitado = obterDados.nextInt();
        if (numeroDigitado % 2 == 0){
            System.out.println("Número é par");
        }
        else {
            System.out.println("Número digitado é impar");
        }
    }
}
