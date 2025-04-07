package aula03;
import  java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        //Solicite o nome e a idade de duas pessoas. Em seguida exiba o nome da pessoa mais velha
        // e o nome da pessoa mais nova.
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite o nome da primeira pessoa");
        String nomePrimeiraPessoa = obterDados.next();
        System.out.println("Qual a idade da pessoa?");
        int idadePrimeiraPessoa = obterDados.nextInt();
        System.out.println("Digite o nome da segunda pessoa");
        String nomeSegundaPessoa = obterDados.next();
        System.out.println("Qual a idade da pessoa?");
        int idadeSegundaPessoa = obterDados.nextInt();
        if (idadePrimeiraPessoa > idadeSegundaPessoa){
            System.out.println(nomePrimeiraPessoa + nomeSegundaPessoa);
        }
        else if (idadePrimeiraPessoa < idadeSegundaPessoa){
            System.out.println(nomeSegundaPessoa + " " + nomePrimeiraPessoa);
        }
        else {
            System.out.println("ERRO");
        }
    }
}
