package aula05;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;
/*Faça um programa para gerar automaticamente números entre 1 e 99 de uma cartela de bingo. Sabendo que cada cartela deverá conter 5 linhas de 5 números, gere estes dados de modo a não ter números repetidos dentro das cartelas. O programa deve exibir na tela a cartela gerada.
 */
public class Ex09 {
    public static void main(String[] args) {
        int linha = 5;
        int coluna = 5;
        int[][] cartela = new int[linha][coluna];
        Random random = new Random();
        Set<Integer> numerosUsados = new HashSet<>();/*cria um conjuto vazio que armazena números inteiros. O Hashset não permite valores duplicados*/

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                int numero;
                do {
                    numero = random.nextInt(99) + 1;/*limita o valor aleatório de 1 a 99*/
                }while (numerosUsados.contains(numero));
                cartela[i][j] = numero;
                numerosUsados.add(numero);
            }
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%02d ", cartela[i][j]);
            }
            System.out.println();
        }
    }
}
