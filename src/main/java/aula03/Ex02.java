package aula03;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        //Faça um programa que leia o nome e a idade de 1 nadador e exiba na tela o nome da categoria
        //a qual este nadador pertence. A categoria dos nadadores é dada pela seguinte tabela:
        System.out.println("Digite seu nome: ");
        String nomeDoUsu = obterDados.next();
        System.out.println("Digite seu nome: ");
        int idadeDoUsu = obterDados.nextInt();

        if (idadeDoUsu < 5 ){
            System.out.println("O usuário "+ nomeDoUsu + " é muito pequeno, idade minima de 5 anos de idade");
        }
        else if (idadeDoUsu >= 5 && idadeDoUsu <= 7){
            System.out.println("O usuário " + nomeDoUsu + " é de classe infantil A");
        }
        else if (idadeDoUsu >= 8 && idadeDoUsu <= 10){
            System.out.println("O usuário " + nomeDoUsu + " é de classe infantil B");
        }
        else if (idadeDoUsu >= 11 && idadeDoUsu <= 13){
            System.out.println("O usuário " + nomeDoUsu + " é de classe juvenil A");
        }
        else if (idadeDoUsu >= 14 && idadeDoUsu <= 17){
            System.out.println("O usuário " + nomeDoUsu + " é de classe juvenil B");
        }
        else if (idadeDoUsu > 18){
            System.out.println("O usuário " + nomeDoUsu + " é adulto");
        }
        else{
            System.out.println("Idade n correspondente");
        }

    }
}
