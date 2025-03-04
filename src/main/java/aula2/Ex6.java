package aula2;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        /*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
        Calcule e mostre o total do seu salário no referido mês.*/
        System.out.println("Digite quanto que você ganha por hora: ");
        float ValorPorHora = obterDados.nextFloat();
        System.out.println("Digite quantas horas você trabalhou: ");
        float HorasTrabalhadas = obterDados.nextFloat();
        float ValorRecebidoNoMes = ValorPorHora * HorasTrabalhadas;
        System.out.println("Seu salário esse mês é de: " + ValorRecebidoNoMes);

    }
}
