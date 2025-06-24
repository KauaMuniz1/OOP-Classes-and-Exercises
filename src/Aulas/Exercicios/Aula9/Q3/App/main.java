package Aulas.Exercicios.Aula9.Q3.App;

import Aulas.Exercicios.Aula9.Q3.model.*;

public class main {
    public static void main(String[] args) {
        Frota frota = new Frota();

        Carro carro = new Carro("HNP-1020", "Fiat", "Cronos", 2022, 4);
        Caminhao caminhao = new Caminhao("CML-7770", "Mercedes-Benz", "Actros", 2018, 32000);
        Van van = new Van("JQL-3840", "Renault", "Master", 2021, 16);

        frota.adicionarVeiculo(carro);
        frota.adicionarVeiculo(caminhao);
        frota.adicionarVeiculo(van);

        frota.listarTodos();
        frota.exibirAlugueis(3);
    }
}
