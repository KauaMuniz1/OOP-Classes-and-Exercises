package Aulas.Exercicios.Aula3.App;

import Aulas.Exercicios.Aula3.model.Cliente;
import Aulas.Exercicios.Aula3.model.EntradaDados;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Criando cliente 1: ");
        Cliente cliente1 = EntradaDados.criarCliente(input);

        System.out.println("Criando cliente 2: ");
        Cliente cliente2 = EntradaDados.criarCliente(input);

        System.out.println("\nCriando o terceiro cliente");
        Cliente cliente3 = EntradaDados.criarCliente(input);

        int opcao;

        do {
            System.out.println("\n------------------ MENU ----------------------");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Ver Saldo");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Depositar para qual cliente (1,2 ou 3): ");
                    int clienteDep = input.nextInt();
                    System.out.println("Valor a depositar: ");
                    double valorDep = input.nextDouble();
                    input.nextLine();

                    if (clienteDep == 1) {
                        cliente1.depositar(valorDep);
                    } else if (clienteDep == 2) {
                        cliente2.depositar(valorDep);
                    } else if (clienteDep == 3) {
                        cliente3.depositar(valorDep);
                    } else {
                        System.out.println("Cliente inválido");
                    }
                    break;

                case 2:
                    System.out.println("Sacar de qual cliente (1, 2 ou 3)? ");
                    int clienteSaq = input.nextInt();
                    System.out.println("Valor a sacar: ");
                    double valorSaq = input.nextDouble();
                    input.nextLine();
                    if (clienteSaq == 1) {
                        cliente1.sacar(valorSaq);
                    } else if (clienteSaq == 2) {
                        cliente2.sacar(valorSaq);
                    } else if (clienteSaq == 3) {
                        cliente3.sacar(valorSaq);
                    } else {
                        System.out.println("Cliente inválido");
                    }
                    break;

                case 3:
                    System.out.println("Transferir de qual cliente (1 ou 2)? ");
                    int de = input.nextInt();
                    System.out.println("Para qual cliente (1 ou 2)? ");
                    int para = input.nextInt();
                    System.out.println("Valor a transferir: ");
                    double valorTransf = input.nextDouble();
                    input.nextLine();
                    if (de == 1 && para == 2) {
                        cliente1.transferir(cliente2, valorTransf);
                    } else if (de == 2 && para == 1) {
                        cliente2.transferir(cliente1, valorTransf);
                    } else if (de == 2 && para == 3) {
                        cliente2.transferir(cliente3, valorTransf);
                    } else if (de == 3 && para == 1) {
                        cliente3.transferir(cliente1,valorTransf);
                    } else if (de == 3 && para == 2) {
                        cliente3.transferir(cliente2,valorTransf);
                    } else if (de == 1 && para == 3) {
                        cliente1.transferir(cliente3,valorTransf);
                    } else {
                        System.out.println("Transferência inválida");
                    }
                    break;

                case 4:
                    cliente1.mostrarSaldo();
                    cliente2.mostrarSaldo();
                    cliente3.mostrarSaldo();
                    break;

                case 0:
                    System.out.println("\nRelatório de saldo das contas após as operações: ");
                    cliente1.mostrarSaldo();
                    cliente2.mostrarSaldo();
                    cliente3.mostrarSaldo();
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida");

            }
        }while (opcao != 0);
        input.close();
    }
}
