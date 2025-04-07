package aula03;
import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        /*Ler 3 valores (considere que não serão informados valores iguais)
        e escrevê-los em ordem crescente*/
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite o valor a");
        float valorA = obterDados.nextFloat();
        System.out.println("Digite o valor b");
        float valorB = obterDados.nextFloat();
        System.out.println("Digite o valor c");
        float valorC = obterDados.nextFloat();
        float temp;

        if (valorA > valorB) {temp = valorA; valorA = valorB; valorB = temp;}
        if (valorA > valorC) {temp = valorA; valorA = valorC; valorC = temp;}
        if (valorB > valorC) {temp = valorB; valorB = valorC; valorC = temp;}
        System.out.println(+valorA+" "+valorB+" "+valorC);

    }
}
