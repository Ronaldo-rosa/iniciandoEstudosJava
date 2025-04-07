package aula03repeticao;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        /*Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um aluno, calcular e imprimir a média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura de cada nota (notas válidas: 0.0 a 10.0).*/
        double notaUm, notaDois;
        System.out.println("Digite uma nota de 0.0 a 10.0");
        do {
            notaUm = obterDados.nextDouble();
            if (notaUm < 0.0 || notaUm > 10.0){
                System.out.println("Nota invalida, digite outra nota: ");
            }
        }while (notaUm < 0 || notaUm > 10);
        System.out.println("Digite uma segunda nota de 0.0 a 10.0");
        System.out.println("Digite uma nota de 0.0 a 10.0");
        do {
            notaDois = obterDados.nextDouble();
            if (notaDois < 0.0 || notaDois > 10.0){
                System.out.println("Nota invalida, digite outra nota: ");
            }
        }while (notaDois < 0 || notaDois > 10);

        double resulatdo = (notaUm + notaDois) / 2;
        System.out.println("A nota do aluno é de: "+resulatdo);
    }
}
