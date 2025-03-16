package aula03;
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        //Receba três valores fornecidos pelo usuário que representarão os lados de um triângulo.
        //Classifique esse triângulo como:
        //a) Equilátero: três lados iguais.
        //b) Isósceles: dois lados iguais.
        //c) Escaleno: três lados diferentes. Lembre-se de que, para formar um triângulo,
        // nenhum dos lados pode ser igual a zero, um lado não pode ser maior do que a soma dos outros dois.
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        float primeiroValor = obterDados.nextFloat();
        System.out.println("Digite o segundo valor");
        float segundoValor = obterDados.nextFloat();
        System.out.println("Digite o terceiro valor");
        float terceiroValor = obterDados.nextFloat();

        if(primeiroValor == segundoValor && primeiroValor == terceiroValor){
            System.out.println("Esse triangulo é um equilátero");
        }
        else if(primeiroValor != segundoValor && primeiroValor != terceiroValor && segundoValor != terceiroValor){
            System.out.println("Esse triangulo é um escaleno");
        }
        else{
            System.out.println("Esse triangulo é um isósceles");
        }
    }
}
