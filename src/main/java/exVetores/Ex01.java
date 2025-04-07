package exVetores;

public class Ex01 {
    public static void main(String[] args) {
        /*Faça a leitura de um vetor de 10 números, em seguida mostre o vetor na tela
        int[] v1 = new int[10];*/

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] =i;
            System.out.println(vetor[i]+" "+i);
        }
    }
}
