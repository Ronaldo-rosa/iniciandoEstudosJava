package aula2;
import java.util.Scanner;
import java.lang.Math;

/*Crie uma classe java que leia dois números inteiros e que depois mostre:
O primeiro valor elevado ao segundo valor use Math.pow(número, expoente)
O primeiro valor vezes o segundo valor
O número inverso do primeiro valor (1/número)
A soma do segundo número com a metade do primeiro número
A diferença do primeiro número com o segundo
O número oposto ao primeiro valor (número *(-1))*/

public class Ex12 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int Numero1 = obterDados.nextInt();
        System.out.println("Didite o segundo número inteiro: ");
        int Numero2 = obterDados.nextInt();
        double PrimeiroValorElevadoAoSegundoValor = Math.pow(Numero1,Numero2);
        int Produto =  Numero1 * Numero2;
        int Inverso = 1 / Numero1;
        int MetadePrimeiroNumero = Numero1 / 2;
        int SomaDoSegundoNumeroComMetadeDoPrimeiroNumero = Numero2 + MetadePrimeiroNumero;
        int DifDosNum1E2 = Numero1 - Numero2;
        int NumeroOpostoAoPrimeiroValor = (Numero1*(-1));
        System.out.println("Primeiro valor elevado no segundo é: " + PrimeiroValorElevadoAoSegundoValor);
        System.out.println("Produto do primeiro valor vezes o segundo: " + Produto);
        System.out.println("O inverso do primeiro número é: " + Inverso);
        System.out.println("A soma do segundo número com a metade do primeiro número: " +SomaDoSegundoNumeroComMetadeDoPrimeiroNumero);
        System.out.println("A diferença dos números é: " + DifDosNum1E2);
        System.out.println("O número oposto ao primeiro valor: " + NumeroOpostoAoPrimeiroValor);



    }
}
