package aula03;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args){
        //Crie um algoritmo que pergunte ao usuário se ele deseja converter uma temperatura de graus Celsius
        //em graus Fahrenheit ou Fahrenheit em Celsius. Em seguida mostre na tela o valor final
        //correspondente à opção escolhida pelo usuário. F = 1.8 * C + 32 | C = (F – 32) / 1.8;
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Gostaria de fazer uma conversão de graus celsius ou em graus fahrenheit?");
        System.out.println("Digite 1 para celsius ou 2 para fahrenheit");
        String valorDigitado = obterDados.next();
        if(valorDigitado.equals("1")){
            System.out.println("Digite o valor da transformação:");
            double numeroDigitado = obterDados.nextDouble();
            double f = 1.8 * (numeroDigitado + 32);
            System.out.println("Transformação é de: " + f);
        } else if (valorDigitado.equals("2")) {
            System.out.println("Digite o valor da transformação:");
            double numeroDigitado = obterDados.nextDouble();
            double f = 1.8 * (numeroDigitado + 32);
            double c = (f - 32) / 1.8;
            System.out.println("Transformação é de: " + c);
        }

        else {
            System.out.println("Valor invalido");
        }
    }
}
