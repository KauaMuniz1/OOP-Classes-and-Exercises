package Aulas.Exercicios.Aula4.Q4.model;

public class Q4Lista {
   //Atributos
    private int vetor[]; // ponteiro para o vetor
    private int cont;
    private int max; //numero de elementos do vetor

    public void inicializar(int max){
        cont = 0;
        vetor = new int[max]; //necessário instanciar o vetor
        this.max = max;

    }

    public boolean estaVazia(){
        if(cont == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean estaCheia(){
        if(cont == max){
            return true;
        }else{
            return false;
        }
    }

    public void add(int elemento){
        if(!estaCheia()){
            vetor[cont] = elemento;
            cont++;
        }
    }

    public int buscar(int elemento){ //retornar a posição do elemento
        for(int i = 0; i < cont; i++){
            if(vetor[i] == elemento){
                return i;
            }
        }
        return -1;
    }

    public void remover(int elemento){
        //é possível reaproveitar a busca para encontrar o elemento
        //como não é uma lista ordenada, a remoção pode ser realizada da última posição
        int pos = buscar(elemento);
        if(pos != -1){
            vetor[pos] = vetor[cont -1];
            cont--;
        }
    }

    public void exibirLista(){
        if(!estaVazia()){
            System.out.print("\n | ");
            for(int i = 0; i < cont; i++){
                System.out.println(vetor[i]+ " | ");
            }
            System.out.println();
        }else {
            System.out.println("\nLISTA VAZIA = |   | ");
        }
    }

}
