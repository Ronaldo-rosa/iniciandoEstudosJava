package exVetores;

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        int[] numerosOriginais = new int[100];
        int[] numerosDobro = new int[100]; // Vetor para os dobros
        Random random = new Random();

        for (int i = 0; i < numerosOriginais.length; i++) {
            numerosOriginais[i] = random.nextInt(100); // Gera de 0 a 99
            numerosDobro[i] = numerosOriginais[i] * 2; // Armazena o dobro

            System.out.printf("Posição: %3d / Original: %3d / Dobro: %3d%n",
                    i, numerosOriginais[i], numerosDobro[i]);
        }
    }
}