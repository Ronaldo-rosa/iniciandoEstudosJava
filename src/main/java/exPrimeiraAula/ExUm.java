package exPrimeiraAula;
import java.util.Scanner;
public class ExUm {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        int numero = obterDados.nextInt();
        float numeroVirgula = obterDados.nextFloat();
        String palavra = obterDados.next();
        char letra = obterDados.next().charAt(0);

        System.out.println("O número informado foi: " + numero);
        System.out.println("O número informado tipo real é: " + numeroVirgula);
        System.out.println("A frase informada é: " + palavra);
        System.out.println("A letra informada é: " + letra);
    }
}
