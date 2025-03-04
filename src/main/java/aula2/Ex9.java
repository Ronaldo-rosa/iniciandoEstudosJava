package aula2;
import java.util.Scanner;
public class Ex9 {
    //Escreva uma classe Java que leia e imprima a soma e a multiplicação de dois números.
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = obterDados.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = obterDados.nextInt();
        int soma = numero + numero2;
        int multiplicacao = numero * numero2;
        System.out.println("A soma e a multiplicação dos dois números respectivamente são: " + soma + ' ' + multiplicacao);
    }
}
