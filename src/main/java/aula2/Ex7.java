package aula2;
import  java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        //Faça uma classe Java que leia a altura e o peso de uma pessoa e calcule seu IMC IMC = peso/altura²
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        float altura = obterDados.nextFloat();
        System.out.println("Digite seu peso: ");
        float peso = obterDados.nextFloat();
        Float IndDeMassaCorporal = peso / (altura * altura);
        System.out.println("Seu IMC é de: " + IndDeMassaCorporal);
    }
}
