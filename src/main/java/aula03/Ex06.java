package aula03;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args){
        //Faça um programa que solicite ao usuário digitar dois valores
        //em seguida, exiba na tela qual dos dois é o maior. OBS: o usuário poderá informar valores iguais
        //logo, o sistema deve dizer que foram digitados valores iguais.
        Scanner obterDados = new Scanner (System.in);
        System.out.println("Digite o primeiro valor");
        float primeiroValorDigitado = obterDados.nextFloat();
        System.out.println("Digite o segundo valor");
        float segundoValorDigitado = obterDados.nextFloat();

        if(primeiroValorDigitado > segundoValorDigitado){
            System.out.println("O" + " " + primeiroValorDigitado + " " + "é maior que o" + " " + segundoValorDigitado);
        }
        else if (primeiroValorDigitado == segundoValorDigitado) {
            System.out.println("Valores iguais");
        }
        else if (primeiroValorDigitado < segundoValorDigitado) {
            System.out.println("O" + " " + segundoValorDigitado + " " + "á maior que o" + " " + primeiroValorDigitado);
        }
        else {
            System.out.println("Erro, tente colocar valores validos");
        }
    }
}
