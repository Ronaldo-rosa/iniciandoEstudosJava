package aula03;
//Usando o comando de seleção condicional simples “IF”, faça um programa que leia uma senha de 8 caracteres
//inteiros e verifique se a senha informada equivale a senha predefinida no programa.
//Se for válida informe na tela "Acesso Autorizado. Caso a senha não estiver correta informe "
//Acesso negado".
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);
        System.out.println("Digite sua senha:");
        String senhaCadastrada = obterDados.next();
        System.out.println("Digite sau senha: ");
        String conferirSenha = obterDados.next();
        if (senhaCadastrada.equals(conferirSenha)){
            System.out.println("Bem vindo");
        }

        else {
            System.out.println("Senhas não compativeis");
        }
    }
}
