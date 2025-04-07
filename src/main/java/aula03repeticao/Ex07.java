package aula03repeticao;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        /*Escreva um algoritmo para ler uma senha. Se o usuário não digitar a senha correta que é 12345, o algoritmo deve ler novamente, até que seja a senha correta. O algoritmo deve também contar quantas vezes o usuário tentou digitar a senha incorreta, ou seja, quantas tentativas de acerto aconteceram. Escrever essa informação na tela. */
        String senhaCorreta = "12345";
        String senhaDigitada;
        int tentativas = 0;
        do {
            System.out.println("Digite a senha");
            senhaDigitada = obterDados.next();
            tentativas ++;
            if (senhaDigitada.equalsIgnoreCase(senhaCorreta)){
                System.out.println("Bem vindo");
                break;
            }
            else {
                System.out.println("senha incorreta, digite de novo");
            }

        }while (true);
        System.out.println("Número de tentativas: "+tentativas);

    }
}
