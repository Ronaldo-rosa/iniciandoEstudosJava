package aula03repeticao;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*Escreva um algoritmo para ler uma idade, mas o algoritmo deve aceitar somente idade válida, ou seja, o algoritmo deve “validar” a leitura da idade. Idade válida tem que ser maior que 0 e menor que 150. Escrever a idade lida*/
        Scanner obterDados = new Scanner(System.in);
        int idade;
        System.out.println("Digite uma idade");
        do {

            idade = obterDados.nextInt();
            if (idade >= 0 && idade <= 150){
                System.out.println("Idade valida, idade é: "+idade);
            }
            else {
                System.out.println("Digite uma idade valida");
            }
        }while (idade <= 0 || idade >= 150);
    }
}
