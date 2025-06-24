package Aulas.Exercicios.Aula9.Q4.model;
import java.util.ArrayList;
public class FilaPrioridade implements ED{
    private ArrayList<Object> elementos = new ArrayList<>();

    @Override
    public void adicionar(Object elemento) {
        if (elemento instanceof Integer) {
            int valor = (Integer) elemento;
            int index = 0;
            for (Object e : elementos) {
                int v = (Integer) e;
                if (valor > v) {
                    break;
                }
                index++;
            }
            elementos.add(index, valor);
        } else {
            elementos.add(elemento);
        }
    }

    @Override
    public Object remover() {
        if (elementos.isEmpty()) return null;
        return elementos.remove(0);
    }
}
