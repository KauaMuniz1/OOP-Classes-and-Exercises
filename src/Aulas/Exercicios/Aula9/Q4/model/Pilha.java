package Aulas.Exercicios.Aula9.Q4.model;

import java.util.ArrayList;

public class Pilha implements ED {
    private ArrayList<Object> elementos = new ArrayList<>();

    @Override
    public void adicionar(Object elemento){
        elementos.add(elemento);
    }

    @Override
    public Object remover(){
        if(elementos.isEmpty()) return null;
        return elementos.remove(elementos.size() -1);
    }
}
