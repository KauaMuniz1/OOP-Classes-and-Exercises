package Aulas.Exercicios.Aula8.Q4.model;

public class ListaOrdenada extends Lista {

    public ListaOrdenada(int tamanho) {
        super(tamanho);
    }

    @Override
    public void adicionar(int elemento) {
        if (quantidadeElemento >= tamanho) {
            System.out.println("Lista cheia! ");
            return;
        }
        int posicao = 0;
        while (posicao < quantidadeElemento && lista[posicao] < elemento){
            posicao++;
        }

        for(int i = quantidadeElemento; i > posicao; i--){
            lista[i] = lista[i-1];
        }

        lista[posicao] = elemento;
        quantidadeElemento++;

    }
}

