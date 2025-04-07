package aula03;
import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        /*Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque
        e quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média
        ((quantidade média = quantidade máxima + quantidade mínima)/2).
        Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem
        'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.*/
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite a quantidade atual de seu estoque:");
        int quantidadeAtual = obterDados.nextInt();
        System.out.println("Qual a capacidade maxima de seu estoque?");
        int quantidadeMaxima = obterDados.nextInt();
        System.out.println("Qual a quantidade minima do seu estoque?");
        int quantidadeMinima = obterDados.nextInt();
        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;
        if(quantidadeAtual >= quantidadeMedia){
            System.out.println("Não efetuar compra");
            return;
        }
        System.out.println("Efetuar compra");
    }
}
