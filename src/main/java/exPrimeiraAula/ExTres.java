package exPrimeiraAula;
import java.util.Scanner;
public class ExTres {
    public static void main(String[] args) {
        /*Escreva uma classe Java que converta metros para centímetros.
          Escreva uma classe Java que converta centímetros para metros.*/
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite o metro que você quer converter para Cm: ");
        float metro = obterDados.nextFloat();
        float ConvercaoParaCm = metro * 100;
        System.out.println("Digite o CM que você quer converter para metro: ");
        float Centimetro = obterDados.nextFloat();
        float ConvercaoParaMetro = Centimetro / 100;
        System.out.println("A converção de metro para Cm: " + ConvercaoParaCm + "\nA converção para Metros: " + ConvercaoParaMetro);

    }
}
