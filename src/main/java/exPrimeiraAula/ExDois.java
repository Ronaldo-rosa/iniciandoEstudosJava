package exPrimeiraAula;
import  java.util.Scanner;
public class ExDois {
    /*Escreva um programa que leia o nome e o sobrenome de uma pessoa separadamente
    e mostre uma mensagem, “Bem vindo Nome Sobrenome”.*/

    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = obterDados.next();
        System.out.println("Digite seu sobrenome: ");
        String Sobrenome = obterDados.next();
        System.out.println("Bem vindo: " + nome + ' ' + Sobrenome);

    }


}
