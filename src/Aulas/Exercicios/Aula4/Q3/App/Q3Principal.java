package Aulas.Exercicios.Aula4.Q3.App;
import Aulas.Exercicios.Aula4.Q3.model.Q3contaBancaria;

import java.util.Scanner;

public class Q3Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas contas deseja cadastrar? ");
        int qntContas = sc.nextInt();
        sc.nextLine();

        Q3contaBancaria[] contas = new Q3contaBancaria[qntContas];

        for (int i = 0; i < qntContas; i++) {
            System.out.printf("---- Conta %d ----%n", i + 1);
            System.out.print("Número da Conta: ");
            int numeroConta = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome do Cliente: ");
            String nomeCliente = sc.nextLine();
            System.out.print("Saldo Inicial: R$");
            double saldo = sc.nextDouble();
            sc.nextLine();

            contas[i] = new Q3contaBancaria(numeroConta, nomeCliente, saldo);
            System.out.println();
        }

        // Exibindo dados das contas
        System.out.println("--- Relatório de Contas ---\n");
        for (Q3contaBancaria conta : contas) {
            conta.imprimirDados();
            System.out.println("---------------------------");
        }

        System.out.print("Deseja realizar operações? (s/n): ");
        String operacoes = sc.nextLine();

        while (operacoes.equalsIgnoreCase("s")) {
            System.out.print("Informe o número da conta: ");
            int numeroBusca = sc.nextInt();
            sc.nextLine();

            Q3contaBancaria contaSelecionada = null;
            for (Q3contaBancaria c : contas) {
                if (c.getNumeroConta() == numeroBusca) {
                    contaSelecionada = c;
                    break;
                }
            }

            if (contaSelecionada == null) {
                System.out.println("Conta não encontrada.");
            } else {
                System.out.print("Deseja (1) Depositar ou (2) Sacar? ");
                int tipoOperacao = sc.nextInt();
                System.out.print("Informe o valor: R$");
                double valor = sc.nextDouble();
                sc.nextLine();

                if (tipoOperacao == 1) {
                    contaSelecionada.depositar(valor);
                } else if (tipoOperacao == 2) {
                    contaSelecionada.sacar(valor);
                } else {
                    System.out.println("Operação inválida.");
                }
            }

            System.out.print("Deseja realizar outra operação? (s/n): ");
            operacoes = sc.nextLine();
        }

        sc.close();
    }

}
