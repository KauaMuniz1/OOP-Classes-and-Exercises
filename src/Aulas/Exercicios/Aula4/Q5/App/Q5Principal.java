package Aulas.Exercicios.Aula4.Q5.App;
import Aulas.Exercicios.Aula4.Q5.model.Q5Instituto;
import Aulas.Exercicios.Aula4.Q5.model.Q5Departamento;
import Aulas.Exercicios.Aula4.Q5.model.Q5Docente;
import java.util.Scanner;

public class Q5Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do Instituto: ");
        String nomeInstituto = sc.nextLine();
        System.out.print("Quantos departamentos deseja cadastrar? ");
        int qntDept = sc.nextInt();
        sc.nextLine();

        Q5Instituto instituto = new Q5Instituto(nomeInstituto, qntDept);

        for (int i = 0; i < qntDept; i++) {
            System.out.printf("---- Departamento %d ----%n", i + 1);
            System.out.print("Código do Departamento: ");
            String codDept = sc.nextLine();
            System.out.print("Nome do Departamento: ");
            String nomeDept = sc.nextLine();
            System.out.print("Telefone do Departamento: ");
            String telDept = sc.nextLine();
            System.out.print("Quantos docentes neste departamento? ");
            int qntDoc = sc.nextInt();
            sc.nextLine();

            Q5Departamento dept = new Q5Departamento(codDept, nomeDept, telDept, qntDoc);
            for (int j = 0; j < qntDoc; j++) {
                System.out.printf("  --- Docente %d --- %n", j + 1);
                System.out.print("  Código do Docente: ");
                int codDoc = sc.nextInt();
                sc.nextLine();
                System.out.print("  Nome do Docente: ");
                String nomeDoc = sc.nextLine();
                System.out.print("  Função do Docente: ");
                String funcao = sc.nextLine();
                System.out.print("  Salário do Docente: R$");
                double salario = sc.nextDouble();
                sc.nextLine();

                Q5Docente docente = new Q5Docente(codDoc, nomeDoc, funcao, salario);
                dept.adicionarDocente(docente);
            }
            instituto.adicionarDepartamento(dept);
            System.out.println();
        }

        System.out.println("=== Estrutura do Instituto ===");
        instituto.imprimirDados();
        sc.close();
    }
}
