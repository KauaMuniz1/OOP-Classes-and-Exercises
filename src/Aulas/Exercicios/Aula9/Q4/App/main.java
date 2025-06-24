package Aulas.Exercicios.Aula9.Q4.App;

import Aulas.Exercicios.Aula9.Q4.model.*;

public class main {
    public static void main(String[] args) {
        ED pilha = new Pilha();
        ED fila = new Fila();
        ED filaPrioridade = new FilaPrioridade();

        pilha.adicionar("A");
        pilha.adicionar("B");
        pilha.adicionar("C");

        System.out.println("Pilha: " + pilha.remover());
        System.out.println("Pilha: " + pilha.remover());

        fila.adicionar("X");
        fila.adicionar("Y");
        fila.adicionar("Z");

        System.out.println("Fila: " + fila.remover());
        System.out.println("Fila: " + fila.remover());


        filaPrioridade.adicionar(10);
        filaPrioridade.adicionar(30);
        filaPrioridade.adicionar(20);

        System.out.println("FilaPrioridade: " + filaPrioridade.remover());
        System.out.println("FilaPrioridade: " + filaPrioridade.remover());
    }
}
