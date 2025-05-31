package Aulas.Exercicios.Aula4.Q2.model;
import Aulas.Exercicios.Aula4.Q2.App.Q2ClienteAcademia;

import java.util.Scanner;

public class Q2Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos deseja cadastrar? ");
        int qntAlunos = sc.nextInt();
        sc.nextLine();

        Q2ClienteAcademia[] alunos = new Q2ClienteAcademia[qntAlunos];

        for (int i = 0; i < qntAlunos; i++) {
            System.out.printf("---- Aluno %d ----%n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Peso (kg): ");
            float peso = sc.nextFloat();
            System.out.print("Altura (m): ");
            float altura = sc.nextFloat();
            sc.nextLine();

            alunos[i] = new Q2ClienteAcademia(nome, idade, altura, peso);
            System.out.println();
        }

        System.out.println("=== Relatório de Alunos ===\n");
        for (Q2ClienteAcademia aluno : alunos) {
            aluno.imprimirDados();
            System.out.println("---------------------------");
        }

        sc.close();
    }
}
