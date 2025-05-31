package Aulas.Exercicios.Aula3.model;

import java.util.Scanner;

public class EntradaDados {
    public static Cliente criarCliente(Scanner input){
        System.out.println("Digite o nome do cliente: ");
        String nome = input.nextLine();

        System.out.println("Digite o saldo inicial da conta: ");
        double saldo = input.nextDouble();
        input.nextLine();

        return new Cliente(nome, saldo);
    }
}
