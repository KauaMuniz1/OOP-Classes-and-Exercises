package Aulas.Exercicios.Aula8.Q4.model;

public class Lista {
    protected int tamanho;
    protected int quantidadeElemento = 0;
    protected int[] lista;

    public Lista(int tamanho){
        this.tamanho = tamanho;
        this.lista = new int[tamanho];
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void adicionar(int elemento){
        if(quantidadeElemento >= tamanho){
            System.out.println("Lista cheia!");
            return;
        }
        lista[quantidadeElemento] = elemento;
        quantidadeElemento++;
    }

    public int getQuantidadeElemento(){
        return quantidadeElemento;
    }

    public void remove(int elemento){
        int posicao = -1;

        for(int i = 0; i < quantidadeElemento; i++){
            if(lista[i] == elemento){
                posicao = i;
                break;
            }
        }
        if(posicao != -1){
            for(int i = posicao; i <quantidadeElemento -1; i++){
                lista[i] = lista[i+1];
            }
            lista[quantidadeElemento-1] = 0;
            quantidadeElemento--;
        }else{
            System.out.println("Elemento não encontrado");
        }

    }

    public int buscar(int posicao){
        if(posicao < 0 || posicao >= quantidadeElemento){
            System.out.println("Posicao invalida");
            return -1;
        }
        return lista[posicao];
    }

    public void relatorio(){
        System.out.println("Lista: ");
        System.out.print("[ ");
        for(int i = 0; i < quantidadeElemento; i++){
            System.out.print(lista[i] + " ");
        }
        System.out.println("]");

    }

}


