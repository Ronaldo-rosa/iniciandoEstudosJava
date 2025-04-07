package aula04vetores;
/*Ler um vetor de números, de 10 elementos. Declarar outro vetor inverso, copiar todos os elementos de números de trás para frente para o vetor inverso.
 */
public class Ex03 {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        int[] vetorInverso = new int[10];
        System.out.println("Posição vetor: ");
        for (int i = 0, j = vetor.length - 1; i < vetor.length; i++, j--) {
            vetorInverso[i] = vetor[j];
        }
        System.out.println("Original || inverso");
        System.out.println("___________________");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%05d | %05d%n", vetor[i], vetorInverso[i]);
        }

        }
    }

