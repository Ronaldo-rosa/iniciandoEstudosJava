package aula2;
import  java.util.Scanner;
//Escreva um programa que calcula a área de um triângulo
public class Ex11 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite a base do triangulo");
        float BaseDoTriangulo = obterDados.nextFloat();
        System.out.println("Digite a altura do triangulo");
        float AlturaDoTriangulo = obterDados.nextFloat();
        float AreaDoTriangulo = BaseDoTriangulo * AlturaDoTriangulo;
        System.out.println("A área do triangulo é de: " + AreaDoTriangulo);
    }
}
