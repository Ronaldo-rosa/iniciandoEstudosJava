package aula03;
import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        /*Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
        Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
        Também testar se saldo atual for maior ou igual a zero escrever a mensagem
        'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.*/
        Scanner obterObjeto = new Scanner(System.in);
        System.out.println("Digite o número de sau conta:");
        int numeroConta = obterObjeto.nextInt();
        System.out.println("Digite seu saldo");
        float saldoConta = obterObjeto.nextFloat();
        System.out.println("Digite seu débito");
        float debitoConta = obterObjeto.nextFloat();
        System.out.println("Digite seu crédito");
        float creditoConta = obterObjeto.nextFloat();
        float saldoAtual = saldoConta - debitoConta +creditoConta;
        if (saldoAtual>=0){
            System.out.println("conta registrada no número: " +numeroConta + " tem saldo positivo");
            return;
        }
        System.out.println("Saldo negativo");
    }
}
