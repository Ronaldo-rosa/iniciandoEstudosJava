package aula03repeticao;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /*Escreva um algoritmo que leia três notas de um aluno e calcule sua média. Ao final do algoritmo pergunte se deseja efetuar o cálculo para mais algum aluno. Se o usuário receber digitar S, leia novamente as três notas até que o usuário responda não.
         */
        Scanner obterDados = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        char verificar;
        do {
            System.out.println("Digite a primeira nota do aluno");
            nota1 = obterDados.nextDouble();
            System.out.println("Digite a segunda nota nota do aluno");
            nota2 = obterDados.nextDouble();
            System.out.println("Digite a terceira nota do aluno");
            nota3 = obterDados.nextDouble();
            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("Média do aluno é de: "+media);
            System.out.println("Deseja efetuar mais algum calculo para algum aluno?");
            System.out.println("Digite 'S' para continuar e 'N' para encerrar o programa");
            verificar = obterDados.next().toUpperCase().charAt(0);
        }while (verificar=='S');
        System.out.println("programa encerrado!");
    }
}
