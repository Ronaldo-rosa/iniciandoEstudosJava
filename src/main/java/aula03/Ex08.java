package aula03;
import  java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        //A calculadora de Luciana pifou, justo quando ela precisa fazer vários cálculos.
        // Ela tem um computador, mas não sabe que um dos acessórios do Windows é uma calculadora.
        // endo estudante de programação, Luciana resolveu fazer um programa.
        // A especificação que bolou prevê que programa leia dois números inteiros
        // (o que atende suas necessidades) e em seguida um símbolo de operação.
        // Se este for '+', o programa soma os números, se '-', subtrai, se '*' multiplica e se '/' divide.
        // Se o símbolo for diferente desses, é mostrada uma mensagem de erro.
        // O programa, antes de dividir, critica se o divisor é zero e mostra uma mensagem de erro.
        // Implemente um programa que construa essa calculadora para Luciana
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite um número");
        float primeiroNumero = obterDados.nextFloat();
        System.out.println("Digite qual o sinal da operação matemática");
        String simboloDaOpera = obterDados.next();
        System.out.println("Digite o segundo número");
        float segundoNumero = obterDados.nextFloat();

        if(simboloDaOpera.equals("+")){
            float soma = primeiroNumero + segundoNumero;
            System.out.println(soma);

        }
        else if(simboloDaOpera.equals("-")){
            float subtracao = primeiroNumero - segundoNumero;
            System.out.println(subtracao);

        }
        else if(simboloDaOpera.equals("*")){
            float mult = primeiroNumero * segundoNumero;
            System.out.println(mult);

        }

        else if(simboloDaOpera.equals("/")){
            float div = primeiroNumero / segundoNumero;
            if (segundoNumero == 0){
                System.out.println("erro");
            }

            else {
                System.out.println(div);
            }

        }

        else {
            System.out.println("Erro");
        }


    }
}
