package aula03;
import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        //Ler o código de um produto e exibir seu tipo de acordo com a tabela:
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite o código do produto");
        int codigoProduto = obterDados.nextInt();
        switch (codigoProduto){
            case 1:
                System.out.println("Caderno");
                break;
            case 2:
                System.out.println("Lápis");
                break;
            case 3:
                System.out.println("Borracha");
                break;
            default:
                System.out.println("Diversos");
        }
    }
}
