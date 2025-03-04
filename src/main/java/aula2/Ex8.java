package aula2;
import  java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
     /* Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e
        mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9)*/
        System.out.println("Digite  temperatura em Fahrenheit: ");
        int fahrenheit = obterDados.nextInt();
        int GrausCel = (5 * (fahrenheit - 32) / 9);
        System.out.println("A temperatura em Graus Celsius é de:" + GrausCel);

    }
}
