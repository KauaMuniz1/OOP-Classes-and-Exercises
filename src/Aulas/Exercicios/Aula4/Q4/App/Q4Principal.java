package Aulas.Exercicios.Aula4.Q4.App;
import Aulas.Exercicios.Aula4.Q4.model.Q4Lista;

import java.util.Scanner;

public class Q4Principal {
    public static void main(String[] args) {
        Q4Lista l = new Q4Lista();
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("------------MENU----------\n");
            System.out.println("Escolha uma das opções abaixo\n");
            System.out.println("Opção 1: inicializar a lista");
            System.out.println("Opção 2: Verificar se a lista está vazia");
            System.out.println("Opção 3: Verificar se a lista está cheia");
            System.out.println("Opção 4: Exibir lista");
            System.out.println("Opção 5: Buscar na lista");
            System.out.println("Opção 6: Adicionar na lista");
            System.out.println("Opção 7: Remover na lista");
            System.out.println("Opção 8: Sair do programa");
            System.out.println("Digite sua opção: ");

            int opc = sc.nextInt();

            while(true) {
                switch (opc) {
                    case 1:
                        System.out.println("Digite o tamanho da lista: ");
                        int inicializar = sc.nextInt();
                        l.inicializar(inicializar);

                    case 2:
                        if(l.estaVazia()){
                            System.out.println("A lista está vazia");
                        }

                    case 3:
                        if(l.estaCheia()){
                            System.out.println("A lista está cheia");
                        }

                    case 4:
                        l.exibirLista();

                    case 5:
                        System.out.println("Digite o número que você quer buscar:  ");
                        int buscar = sc.nextInt();
                        l.buscar(buscar);

                    case 6:
                        System.out.println("Digite o número que voce quer add na lista: ");
                        int adicionar = sc.nextInt();
                        l.add(adicionar);

                    case 7:
                        System.out.println("Digite o numero que voce quer remover na lista: ");
                        int remover = sc.nextInt();
                        l.remover(remover);

                    case 8:
                        break;

                    default:
                        break;
                }
            }

        /*l.inicializar(10);
        System.out.println("Esta vazia: "+l.estaVazia());
        System.out.println("Está cheia: "+l.estaCheia());
        l.exibirLista();
        l.add(5);
        l.exibirLista();
        l.add(12);
        l.exibirLista();
        l.add(3);
        l.add(4);
        l.exibirLista();
        System.out.println("Posicão 5: "+l.buscar(5));
        l.exibirLista();
        l.remover(5);
        l.exibirLista(); */

        }
    }
}
