package aula04vetores;

import java.util.Scanner;

/*Ler um vetor C de 10 nomes de pessoas, após pedir que o usuário digite um nome qualquer de pessoa. Escrever a mensagem ACHEI, se o nome estiver armazenado no vetor C ou NÃO ACHEI caso contrário.
 */
public class Ex06 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        String nomePesq;
        boolean achei = false;
        String[] nomes = {
                "Alice", "Bruno", "Carlos", "Diana", "Eduardo",
                "Fernanda", "Gustavo", "Helena", "Igor", "Juliana"
        };
            System.out.println("Digite um nome: ");
            nomePesq = obterDados.nextLine();
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomePesq)){
                achei = true;
            }
        }
        if (achei){
            System.out.println("achei");
        }

        else {
            System.out.println("Não achei");
        }

    }
}
