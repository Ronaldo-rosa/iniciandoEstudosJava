package aula03;
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        //A jornada de trabalho semanal de um funcionário é de 40 horas.
        // O funcionário que trabalhar mais de 40 horas receberá hora extra,
        // cujo cálculo é o valor da hora regular com um acréscimo de 50%.
        // Escreva um algoritmo que leia o número de horas trabalhadas em um mês,
        // o salário por hora e escreva o salário total do funcionário,
        // que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
        // (considere que o mês possua 4 semanas exatas).
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite o número de horas trabalhadas na semana:");
        float horasTrabalhadas = obterDados.nextFloat();
        System.out.println("Digite o valor ganho por hora:");
        float valorGanhoHora = obterDados.nextFloat();
        float valorTotal;
        // Considerando que o mês tem 4 semanas
        float horasPorMes = horasTrabalhadas * 4; // 40 horas por semana * 4 semanas
        float valorNormalMes = 160 * valorGanhoHora;
        float valorHoraExtra = valorGanhoHora * 1.5f; // Valor da hora extra
        if (horasPorMes > 160 ) {
            float horasExtras = (horasPorMes - 160) * valorHoraExtra;
            valorTotal = horasExtras + valorNormalMes;
        } else {
            valorTotal = valorNormalMes;
        }
        System.out.println("Salário a receber é de: " + valorTotal);
    }
}
