package Aulas.Exercicios.Aula5.App;
import Aulas.Exercicios.Aula5.model.Alunow;
import java.util.Scanner;

public class PrincipalAlunow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int totalAlunos = 100;
        Alunow[] vetor = new Alunow[totalAlunos];


        for (int i = 0; i < totalAlunos; i++) {
            System.out.printf("\nDigite o nome do aluno %d: ", i + 1);
            String nome = sc.nextLine().trim();

            System.out.printf("Digite a nota 1 de %s: ", nome);
            float n1 = sc.nextFloat();

            System.out.printf("Digite a nota 2 de %s: ", nome);
            float n2 = sc.nextFloat();
            sc.nextLine(); // consome o newline

            vetor[i] = new Alunow(nome, n1, n2);
        }


        System.out.println("\n--- Resultado dos Alunos ---");
        for (Alunow aluno : vetor) {
            System.out.printf("%s — Média: %.2f — %s%n",
                    aluno.getNome(),
                    aluno.media(),
                    aluno.aprovado() ? "Aprovado" : "Reprovado"
            );
        }

        sc.close();

    }
}
