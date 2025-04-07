package aula03;
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        /*Escreva um algoritmo que leia 4 valores i, a, b, c escrever os valores lidos e em seguida
        Se i = 1 escrever os três valores em ordem crescente
        Se i = 2 escrever os três valores em ordem decrescente
        Se i = 3 Escrever o dobro dos três números*/
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite um número inteiro (1 para ordem crescente, 2 para decrescente, 3 para o dobro):");
        int i = obterDados.nextInt();
        System.out.println("Digite o primeiro número:");
        float a = obterDados.nextFloat();
        System.out.println("Digite o segundo número:");
        float b = obterDados.nextFloat();
        System.out.println("Digite o terceiro número:");
        float c = obterDados.nextFloat();
        float temp;
        switch (i){
            case 1:
                if(a > b){temp = a; a = b; b = temp;}
                if(a > c){temp = a; a = c; c = temp;}
                if(b > c){temp = b; b = c; c = temp;}
                System.out.println("Números na ordem crescente: " + a + " " + b + " " + c);
                break;
            /*
            podemos só inverter o valor das variáveis dentro do println, mas quis praticar um pouco mais as conversões de valores
            case 2:
                if(a > b){temp = a; a = b; b = temp;}
                if(a > c){temp = a; a = c; c = temp;}
                if(b > c){temp = b; b = c; c = temp;}
                System.out.println("Números na ordem crescente: + " + c + " " + b + " " + a);
                break;*/
            case 2:
                if(a < b){temp = a; a = b; b = temp;}
                if(a < c){temp = a; a = c; c = temp;}
                if(b < c){temp = b; b = c; c = temp;}
                System.out.println("Números na ordem crescente: " + a + " " + b + " " + c);
                break;
            case 3:
                float dobroA = a * 2;
                float dobroB = b * 2;
                float dobroC = c * 2;
                System.out.println("Dobro dos valores recebidos: "+dobroA+" "+dobroB+" "+dobroC);
                break;
            default:
                System.out.println("Opção inexistente");
                break;
        }
    }
}
