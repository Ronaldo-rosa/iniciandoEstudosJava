package aula2;
import  java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        //Faça um programa em Java que calcule a área de um círculo
        System.out.println("Digite o raio do circulo");
        float raio = obterDados.nextFloat();
        float ValorRaio = raio*raio;
        double areaDoCirculo = 3.14 * ValorRaio;
        System.out.println("Valor da area é: " + areaDoCirculo);

    }
}
