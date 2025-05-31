package Aulas.Exercicios.Aula4.Q1.App;

import Aulas.Exercicios.Aula4.Q1.model.Aluno;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Início");

        Aluno a1 = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("\nDigite a matricula do alUno: ");
        String matricula = scanner.nextLine();

        System.out.println("\nDigite A Nota 1 do aluno: ");
        float n1 = scanner.nextFloat();

        System.out.println("\nDigite A Nota 2 do aluno: ");
        float n2 = scanner.nextFloat();

        System.out.println("\nDigite A Nota do trabalho 1 do aluno: ");
        float t1 = scanner.nextFloat();

        System.out.println("\nDigite A Nota do trabalho 2 do aluno: ");
        float t2 = scanner.nextFloat();

        a1.setNome(nome);
        a1.setMatricula(matricula);
        a1.setN1(n1);
        a1.setN2(n2);
        a1.setT1(t1);
        a1.setT2(t2);

        System.out.println(a1.getNome());
        System.out.println(a1.getMatricula());
        System.out.println(a1.getN1());
        System.out.println(a1.getN2());
        System.out.println(a1.getT1());
        System.out.println(a1.getT2());
        System.out.println(a1.calcularMedia());
    }
}
