package aula2;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);

        // Entrada das dimensões da cozinha
        System.out.print("Digite o comprimento de sua cozinha: ");
        float comprimento = obterDados.nextFloat();

        System.out.print("Digite a largura de sua cozinha: ");
        float largura = obterDados.nextFloat();

        System.out.print("Digite a altura de sua cozinha: ");
        float altura = obterDados.nextFloat();

        // Entrada das dimensões das janelas
        System.out.print("Digite quantas janelas tem sua cozinha: ");
        int qtdJanelas = obterDados.nextInt();

        System.out.print("Digite a altura das janelas: ");
        float alturaJanelas = obterDados.nextFloat();

        System.out.print("Digite a largura das janelas: ");
        float larguraJanelas = obterDados.nextFloat();

        // Entrada das dimensões das portas
        System.out.print("Digite quantas portas tem sua cozinha: ");
        int qtdPortas = obterDados.nextInt();

        System.out.print("Digite a altura das portas: ");
        float alturaPortas = obterDados.nextFloat();

        System.out.print("Digite a largura das portas: ");
        float larguraPortas = obterDados.nextFloat();

        // Cálculo da área total das paredes
        float areaParedes = 2 * (comprimento * altura) + 2 * (largura * altura);

        // Cálculo da área das janelas e portas
        float areaJanelas = (alturaJanelas * larguraJanelas) * qtdJanelas;
        float areaPortas = (alturaPortas * larguraPortas) * qtdPortas;

        // Área útil para os azulejos
        float areaAzulejos = areaParedes - (areaJanelas + areaPortas);

        // Cada caixa de azulejos cobre 1,5 m²
        float areaPorCaixa = 1.5f;
        int qtdCaixas = (int) Math.ceil(areaAzulejos / areaPorCaixa); // Arredondando para cima

        // Exibir resultado
        System.out.println("Área total das paredes: " + areaParedes + " m²");
        System.out.println("Área das janelas e portas: " + (areaJanelas + areaPortas) + " m²");
        System.out.println("Área a ser revestida: " + areaAzulejos + " m²");
        System.out.println("Quantidade de caixas de azulejos necessárias: " + qtdCaixas);

        obterDados.close();
    }
}
