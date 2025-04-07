package aula05;

import java.util.Scanner;

/*1 - Ler 6 números inteiros para preencher uma matriz D 2x3, ou seja, com 2 linhas e 3 colunas (considere que não serão informados valores duplicados). A seguir, ler um número inteiro X e escrever uma mensagem indicando se o valor de X existe ou não na matriz D.
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        int linha = 2;
        int coluna = 3;
        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("Matriz [%02d] [%02d]:%n ", i,j);
                matriz[i][j] = obterDados.nextInt();
            }
        }

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.printf("%02d ",matriz[i][j]);
            }
            System.out.println();
        }
    }
}

