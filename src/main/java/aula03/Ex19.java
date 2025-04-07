package aula03;
import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        /*Escreva um algoritmo que leia o código de uma figura geométrica
        1 - triângulo, 2 - quadrado, 3 - círculo, 4 - retângulo).
        Depois de escolhida a figura, leia as informações necessárias para calcular a área da figura
        correspondente, calcule e escreva o valor da área.*/
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite 1 para triângulo 2 para quadrado 3 para circulo 4 para retângulo");
        int escolha = obterDados.nextInt();
        float area;
        switch (escolha){
            case 1:
                System.out.println("Digite o valor da base do triângulo:");
                float base = obterDados.nextFloat();
                System.out.println("Digite a altura do triângulo");
                float altura = obterDados.nextFloat();
                area = base * altura / 2;
                System.out.println(area);
                break;
            case 2:
                System.out.println("Digite o valor de um lado do quadrado");
                float lado = obterDados.nextFloat();
                area = lado * lado;
                System.out.println(area);

                break;
            case 3:
                System.out.println("Digite o raio do circulo");
                double raio = obterDados.nextDouble();
                double arCir = Math.PI * raio * raio;
                System.out.println(arCir);


                break;
            case 4:
                System.out.println("Digite o valor da base do retângulo:");
                float baseR = obterDados.nextFloat();
                System.out.println("Digite a altura do retângulo");
                float alturaR = obterDados.nextFloat();
                area = baseR * alturaR;
                System.out.println(area);
                break;
            default:
                System.out.println("Valor invalido");
                break;

        }
    }
}
