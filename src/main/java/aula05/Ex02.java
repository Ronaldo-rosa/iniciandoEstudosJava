package aula05;
/*2 - Carregar uma matriz SOMA 4x4, calcular e escrever as seguintes somas:
a) da linha de índice 3
b) da coluna de índice 2
c) de todos os elementos da matriz
*/
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        try(Scanner obterDados = new Scanner(System.in)){
            int linha = 4;
            int coluna = 4;
            int[][] matriz = new int[linha][coluna];
            /*obtem os dados da matriz*/
            System.out.println("Digite o números das linhas e colunas da matriz");
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    System.out.printf("Matriz [%02d][%02d]: ", i, j);
                    matriz[i][j] = obterDados.nextInt();
                }
            }
            /*mostra a matriz*/
            for (int i = 0; i < linha; i++) {
                for (int j = 0; j < coluna; j++) {
                    System.out.printf("%02d ", matriz[i][j]);
                }
                System.out.println();
            }
            /*soma das linhas da matriz*/
            int somalinha=0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    somalinha += matriz[i][j];
                }
                System.out.println("Soma da Linha " + i + ": " + somalinha);
            }
            /*soma da coluna da matriz*/
            int colunas = matriz[0].length;
            for (int j = 0; j < coluna; j++) {
                int somaColuna = 0;
                for (int i = 0; i < matriz.length; i++) {
                    somaColuna += matriz[i][j];
                }
                System.out.println("Soma da Coluna " + j + ": " + somaColuna);
            }
        }
    }
}
