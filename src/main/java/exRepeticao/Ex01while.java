package exRepeticao;
import java.util.Scanner;
/*Leia um número do teclado e mostre a tabuada desse número.
 */
public class Ex01while {
    public static void main(String[] args){
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = obterDados.nextInt();
        int cont = 1;
        while (cont <= 10){
            System.out.println(numero+"X"+cont+"="+(numero*cont));
            cont++;
        }
    }
}
