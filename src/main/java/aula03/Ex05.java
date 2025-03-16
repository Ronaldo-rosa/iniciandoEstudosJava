package aula03;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args){
        // Crie um programa que teste se o valor que usuário digitou está entre 10 e 15 e exibe
        // alguma mensagem na tela.
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numeroDigitado = obterDados.nextInt();
        if (numeroDigitado >= 10 && numeroDigitado <= 15 ){
            System.out.println("Número se localiza entre 10 e 15");
        }
        else {
            System.out.println("Número não se localiza entre 10 e 15");
        }
    }
}
