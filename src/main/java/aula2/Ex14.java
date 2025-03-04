package aula2;
import  java.util.Scanner;
/*Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
Sabendo-se que o preço do combustível é de R$ 4,15, escreva um programa para ler:
a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia,
o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros.
Calcular e escrever: a média do consumo em Km/L e o lucro (líquido) do dia.*/
public class Ex14 {
    public static void main(String[] args){
        Scanner obterDados = new Scanner(System.in);
        float PrecoCombustivel = 4.15f;
        System.out.println("Marcação do Odômetro no inicio do dia: ");
        float MarcacaoOdometroInicioDoDia = obterDados.nextFloat();
        System.out.println("Marcação do Odômetro no final do dia: ");
        float MarcacaoOdometroFinalDoDia = obterDados.nextFloat();
        System.out.println("Quantidade de combustivel gasto: ");
        float CombustivelGasto = obterDados.nextFloat();
        System.out.println("Quantidade recebida dos clientes: ");
        float ValorRecebidoClientes = obterDados.nextFloat();
        float GastoCombustivelPorKmRodado =  (MarcacaoOdometroFinalDoDia - MarcacaoOdometroInicioDoDia) / CombustivelGasto;
        float LucroDoDia = ValorRecebidoClientes - (CombustivelGasto * PrecoCombustivel);
        System.out.println("Media de consumo de Km/l: " + GastoCombustivelPorKmRodado);
        System.out.println("Lucro Bruto: " + LucroDoDia);
        obterDados.close();
        //Fechamento do Scanner (obterDados.close();) para evitar vazamento de recursos.
    }
}
