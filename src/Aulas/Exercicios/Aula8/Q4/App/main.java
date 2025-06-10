package Aulas.Exercicios.Aula8.Q4.App;
import Aulas.Exercicios.Aula8.Q4.model.Lista;
import Aulas.Exercicios.Aula8.Q4.model.ListaOrdenada;

public class main {
    public static void main(String[] args) {
        ListaOrdenada listaOrdenada = new ListaOrdenada(10);
        Lista lista2 = new Lista(10);

        for(int i = 10; i > 0; i--){
            listaOrdenada.adicionar(i);
            lista2.adicionar(i);
        }

    listaOrdenada.relatorio();
        listaOrdenada.remove(3);
        listaOrdenada.relatorio();

    lista2.relatorio();

    System.out.println("Tamanho: "+listaOrdenada.getQuantidadeElemento());
    System.out.println("Buscar: "+listaOrdenada.buscar(2));

    }
}
