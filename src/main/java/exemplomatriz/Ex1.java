package exemplomatriz;

import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        // tipo[][] nome = new tipo [nlinhas][ncolunas]
        int [][] matriz = new int[4][5];
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 5; c++) {
                matriz[l][c] = aleatorio.nextInt(1,99);
                System.out.printf("%02d ", matriz[l][c]);
            }
            System.out.println();
        }
    }
}
