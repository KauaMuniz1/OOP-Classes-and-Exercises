package Aulas.Exercicios.Aula8.Q2.App;
import Aulas.Exercicios.Aula8.Q2.model.Produto;
import Aulas.Exercicios.Aula8.Q2.model.ProdutoEstadual;
import Aulas.Exercicios.Aula8.Q2.model.ProdutoImportado;
import Aulas.Exercicios.Aula8.Q2.model.ProdutoNacional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos estaduais produtos voce quer cadastrar: ");
        int quantidadeEstaduais = scanner.nextInt();
        ProdutoEstadual[] produtoEstaduais = new ProdutoEstadual[quantidadeEstaduais];

        System.out.println("Digite quantos Nacionais produtos voce quer cadastrar: ");
        int quantidadeNacionais = scanner.nextInt();
        ProdutoNacional[] produtoNacionais = new ProdutoNacional[quantidadeNacionais];


        System.out.println("Digite quantos produtos importados voce quer cadastrar: ");
        int quantidadeImportados = scanner.nextInt();
        ProdutoImportado[] produtoImportados = new ProdutoImportado[quantidadeImportados];

        int contEstaduais = 0;
        int contNacionais = 0;
        int contImportados = 0;

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 – Cadastrar Produto Estadual");
            System.out.println("2 – Cadastrar Produto Nacional");
            System.out.println("3 – Cadastrar Produto Importado");
            System.out.println("4 – Exibir Produtos Estaduais");
            System.out.println("5 – Exibir Produtos Nacionais");
            System.out.println("6 – Exibir Produtos Importados");
            System.out.println("7 – Exibir Todos Produtos");
            System.out.println("9 – SAIR");
            System.out.print("Escolha a opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (contEstaduais < produtoEstaduais.length) {
                        System.out.print("Descrição: ");
                        String descricao = scanner.nextLine();

                        System.out.print("Valor: ");
                        double valor = scanner.nextDouble();

                        produtoEstaduais[contEstaduais] = new ProdutoEstadual(descricao, valor);
                        contEstaduais++;

                        System.out.println("Produto Estadual cadastrado!");
                    } else {
                        System.out.println("Limite de produtos estaduais atingido!");
                    }break;

                case 2:
                    if (contNacionais < produtoNacionais.length) {
                        System.out.println("Descricao: ");
                        String descricao = scanner.nextLine();

                        System.out.println("Valor: ");
                        double valor = scanner.nextDouble();

                        produtoNacionais[contNacionais] = new ProdutoNacional(descricao, valor);
                        contNacionais++;

                        System.out.println("Produto Nacional cadastrado!");
                    } else {
                        System.out.println("Limite de produtos nacionais atingido");
                    }break;

                case 3:
                    if (contImportados < produtoImportados.length) {
                        System.out.println("Descricao: ");
                        String descricao = scanner.nextLine();

                        System.out.println("Valor: ");
                        double valor = scanner.nextDouble();

                        produtoImportados[contImportados] = new ProdutoImportado(descricao, valor);
                        contImportados++;

                        System.out.println("Produto importado cadastrado!");
                    } else {
                        System.out.println("Limite de produtos importados atingido");
                    }break;

                case 4:
                    for (int i = 0; i < contEstaduais; i++) {
                        System.out.println(produtoEstaduais[i].relatorio());
                    }break;

                case 5:
                    for (int i = 0; i < contNacionais; i++) {
                        System.out.println(produtoNacionais[i].relatorio());
                    }break;

                case 6:
                    for (int i = 0; i < contImportados; i++) {
                        System.out.println(produtoImportados[i].relatorio());
                    }break;

                case 7:
                    for (int i = 0; i < contEstaduais; i++) {
                        System.out.println(produtoEstaduais[i].relatorio());
                    }

                    for (int i = 0; i < contNacionais; i++) {
                        System.out.println(produtoNacionais[i].relatorio());
                    }

                    for (int i = 0; i < contImportados; i++) {
                        System.out.println(produtoImportados[i].relatorio());
                    }break;


                case 9:
                    System.out.println("Saindo do programa, tchauzinho");
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }

        }while (opcao != 9) ;


        scanner.close();
    }

}
