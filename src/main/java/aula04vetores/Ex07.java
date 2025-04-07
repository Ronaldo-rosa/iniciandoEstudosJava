package aula04vetores;

import java.util.Random;

public class Ex07 {
    public static void main(String[] args) {
        String[] nomes = {
                "Ana", "Bruno", "Carlos", "Daniela", "Eduardo",
                "Fernanda", "Gustavo", "Helena", "Igor", "Juliana"
        };

        double[] notas1 = new double[10]; // Primeira nota
        double[] notas2 = new double[10]; // Segunda nota
        Random random = new Random();

        // Gerando notas aleatórias (0.0 a 10.0)
        for (int i = 0; i < 10; i++) {
            notas1[i] = random.nextDouble(10);
            notas2[i] = random.nextDouble(10);
        }

        // Exibindo todas as notas
        System.out.println("Notas dos alunos:");
        System.out.println("------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-8s: %.1f | %.1f%n", nomes[i], notas1[i], notas2[i]);
        }

        // Calculando a MÉDIA GERAL da turma
        double somaTotal = 0;
        for (int i = 0; i < 10; i++) {
            somaTotal += notas1[i] + notas2[i]; // Soma todas as notas
        }
        double mediaGeral = somaTotal / 20; // 10 alunos * 2 notas cada

        System.out.printf("\nMédia geral da turma: %.1f%n", mediaGeral);

        // Contando alunos acima da média geral
        int acimaDaMedia = 0;
        for (int i = 0; i < 10; i++) {
            double mediaAluno = (notas1[i] + notas2[i]) / 2;
            if (mediaAluno > mediaGeral) {
                acimaDaMedia++;
            }
        }

        System.out.println("Alunos acima da média: " + acimaDaMedia);
    }
}