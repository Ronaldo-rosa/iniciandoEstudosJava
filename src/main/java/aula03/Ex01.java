package aula03;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner (System.in);
       // Crie um programa em que o usuário informa o nome de um mês (ex: janeiro)
        //e o programa exibe o número correspondente a esse mesmo mês (ex: 1);
        System.out.println("Digite um número inteiro correspondente ao mês: ");
        int numeroMes = obterDados.nextInt();
        switch (numeroMes){
            case 1:
                System.out.println("Mês correspondente a esse número é: Janeiro");
                break;
            case 2:
                System.out.println("Mês correspondente a esse número é: Fevereiro");
                break;
            case 3:
                System.out.println("Mês correspondente a esse número é: Março");
                break;
            case 4:
                System.out.println("Mês correspondente a esse número é: Abril");
                break;
            case 5:
                System.out.println("Mês correspondente a esse número é: Maio");
                break;
            case 6:
                System.out.println("Mês correspondente a esse número é: Junho");
                break;
            case 7:
                System.out.println("Mês correspondente a esse número é: Julho");
                break;
            case 8:
                System.out.println("Mês correspondente a esse número é: Agosto");
                break;
            case 9:
                System.out.println("Mês correspondente a esse número é: Setembro");
                break;
            case 10:
                System.out.println("Mês correspondente a esse número é: Outubro");
                break;
            case 11:
                System.out.println("Mês correspondente a esse número é: Novembro");
                break;
            case 12:
                System.out.println("Mês correspondente a esse número é: Dezembro");
                break;
            default:
                System.out.println("Número não encontrado");


        }
    }
}
