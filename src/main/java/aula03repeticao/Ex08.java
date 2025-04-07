package aula03repeticao;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        /*Escreva um algoritmo para pedir que o usuário digite números positivos, ou seja, ele pode digitar quantos números positivos ele quiser. Para parar de digitar números, ele deve digitar -1. Após o usuário digitar -1, o programa deve escrever na tela quantos números o usuário digitou (a quantidade de números lidos) e a soma total dos números que ele digitou.*/
        Scanner obterDados = new Scanner(System.in);
        int numero;
        int encerrar = -1;
        int cont=0, soma=0;
       while (true){
           System.out.println("Digite um numero: ");
           numero = obterDados.nextInt();
           if (numero == encerrar){
               break;
           }
           cont ++;
           soma+=numero;
       }
        System.out.println("Números digitados: "+cont);
        System.out.println("Valor da soma: "+soma);
    }
}
