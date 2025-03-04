package aula2;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        //Faça uma classe Java que peça as 4 notas bimestrais e mostre a média
        Scanner obterDados = new Scanner(System.in);

        System.out.println("Digite a primeira nota do bimestre:");
        int nota1 = obterDados.nextInt();
        System.out.println("Digite a segunda nota do bimestre:");
        int nota2 = obterDados.nextInt();
        System.out.println("Digite a terceira nota do bimestre:");
        int nota3 = obterDados.nextInt();
        System.out.println("Digite a quarta nota do bimestre:");
        int nota4 = obterDados.nextInt();
        float totalBimestral = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Media do aluno é de: " + totalBimestral);
    }
}
