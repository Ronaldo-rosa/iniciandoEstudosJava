package aula2;
import  java.util.Scanner;
//Escreva um programa que calcule a área e o perímetro de um quadrado
public class Ex10 {
    public static void main(String[] args) {
        Scanner obterLado = new Scanner(System.in);
        System.out.println("Digite o tamanho de um lado do quadrado: ");
        float LadoQuadrado = obterLado.nextFloat();
        float Per = LadoQuadrado * 4;
        float Area = LadoQuadrado * LadoQuadrado;
        System.out.println("O permetro do quadrado é de: " + Per + ' ' + "e a área é: " + Area);
    }
}
