package Aulas.Exercicios.Aula9.Q3.model;

import java.util.ArrayList;

public class Frota {
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void adicionarVeiculo(Veiculo v) {
        veiculos.add(v);
    }

    public void listarTodos() {
        System.out.println("\n=== Veículos cadastrados ===");
        for (Veiculo v : veiculos) {
            System.out.println(v.exibirDados());
        }
    }

    public void exibirAlugueis(int dias) {
        System.out.println("\n=== Veículos Alugáveis (" + dias + " dias) ===");
        for (Veiculo v : veiculos) {
            if (v instanceof Alugavel) {
                Alugavel alugavel = (Alugavel) v;
                System.out.println(v.exibirDados() +
                        "\nValor para " + dias + " dia(s): R$ " + alugavel.calcularValorAluguel(dias) + "\n");
            }
        }
    }
}
