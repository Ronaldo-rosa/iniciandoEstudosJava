package exemplomatriz;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [][] matriz = new int[2][3];
        for (int l = 0; l < 2; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("Matriz["+l+"]["+c+"]: ");
                matriz[l][c] = ler.nextInt();
            }
        }
        for (int l = 0; l < 2; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("%02d ",matriz[l][c]);

            }
            System.out.println();
    }   }
}
