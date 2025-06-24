package Aulas.Exercicios;

import java.util.Scanner;

public class PrincipalAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Início");

        //Alunoo a1 = new Alunoo();

        Alunoo vetor[] = new Alunoo[5];

        System.out.println("Escrevva os dados do aluno abaixo\n");

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = new Alunoo();
            System.out.println("Digite o nome do aluno "+(i + 1)+":");
            vetor[i].setNome(scanner.next());

            System.out.println("Digite a nota do trabalho"+(i+1)+":");
            vetor[i].setT1(scanner.nextFloat());

            System.out.println("Digite a nota do ");
        }



        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i].getNome());
        }
        scanner.close();
    }
}
