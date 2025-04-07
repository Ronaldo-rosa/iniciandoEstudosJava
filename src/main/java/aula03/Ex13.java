package aula03;
import  java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        //Criar um programa para identificar o valor a ser pago por um plano de saúde
        // dada a idade do conveniado considerando que todos pagam R$ 100
        // mais um adicional conforme os seguintes dados:
        //a) crianças com menos de 10 anos pagam R$80;
        //b) conveniados com idade entre 10 e 30 anos pagam R$50;
        //c) conveniados com idade entre 40 e 60 anos pagam R$ 95;
        //d) conveniados com mais de 60 anos pagam R$130.
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite a idade do conveniado");
        int idadeConveniado = obterDados.nextInt();
        int valorPago;
        if (idadeConveniado <= 10 ){
            valorPago = 100 + 80;
            System.out.println("O conveniado pagará: " + valorPago);
        }
        else if (idadeConveniado > 10 && idadeConveniado < 40){
            valorPago = 100 + 50;
            System.out.println("O conveniado pagará: " + valorPago);
        }
        else if (idadeConveniado >= 40 && idadeConveniado <= 60){
            valorPago = 100 + 95;
            System.out.println("O conveniado pagará: " + valorPago);
        }
        else{
            valorPago = 100 + 130;
            System.out.println("O conveniado pagará: " + valorPago);
        }


    }
}
