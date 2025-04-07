package aula03repeticao;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        boolean primo= true;
        System.out.println("Digite um número");
        int numero = obterDados.nextInt();
        for (int i = 2; i < numero; i++) {
            if (numero%i==0){
                primo=false;
                break;
            }
        }
        if (primo){
            System.out.println(numero+" é primo");
        }
        else {
            System.out.println(numero+" não é primo");
        }
    }
}