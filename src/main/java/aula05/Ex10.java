package aula05;

import java.util.Random;

/*10 - Dada uma matriz B, determine a linha de B que possui a maior soma de seus elementos. */
public class Ex10 {
    public static void main(String[] args) {
        int linha = 5;
        int coluna = 5;
        int[][] matrizB = new int[linha][coluna];
        Random aleatorio = new Random();

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matrizB[i][j] = aleatorio.nextInt(50);
            }
        }
        System.out.println("Matriz");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                System.out.printf("%02d ", matrizB[i][j]);
            }
            System.out.println();
        }

        // Variáveis para armazenar a maior soma e a linha correspondente
        int maiorSoma = Integer.MIN_VALUE; // Inicia com o menor valor possível
        int linhaMaiorSoma = -1; // Índice da linha com a maior soma

        // Calcula a soma de cada linha e encontra a maior
        for (int i = 0; i < matrizB.length; i++) {
            int somaLinha = 0; // Zera a soma para cada nova linha
            for (int j = 0; j < matrizB[i].length; j++) {
                somaLinha += matrizB[i][j];
            }

            // Verifica se a soma atual é a maior
            if (somaLinha > maiorSoma) {
                maiorSoma = somaLinha;
                linhaMaiorSoma = i;
            }
        }

        // Resultado
        System.out.println("\nMaior soma: " + maiorSoma);
        System.out.println("Linha com maior soma: " + linhaMaiorSoma);

    }
}
/*Não entendi direito a verificação de maiores, analisar melhor o código depois*/
