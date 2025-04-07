package aula03;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        //A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado,
        // ficou de recuperação ou foi reprovado. A média de aprovação é
        // a média de recuperação a média do reprovado é <
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno");
        float primeiraNota = obterDados.nextFloat();
        System.out.println("Digite a segunda nota");
        float segundaNota = obterDados.nextFloat();
        System.out.println("Digite a terceira nota");
        float terceiraNota = obterDados.nextFloat();
        float media = (primeiraNota + segundaNota + terceiraNota) / 3;

        if (media <=6 ){
            System.out.println("Aluno em recuperação");
        }
        else {
            System.out.println("Aluno apto");
        }
    }
}
