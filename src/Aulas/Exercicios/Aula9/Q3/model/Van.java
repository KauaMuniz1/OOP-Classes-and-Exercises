package Aulas.Exercicios.Aula9.Q3.model;

import java.util.ArrayList;

public class Van extends Veiculo implements Alugavel {
    protected int numPassageiros;
    int valorAluguel = 180;

    public Van(String placa, String marca, String modelo, int anoDeFabricacao, int numPassageiros) {
        super(placa, marca, modelo, anoDeFabricacao);
        this.numPassageiros = numPassageiros;

    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    @Override
    public double calcularValorAluguel(int dias){
        return valorAluguel * dias;
    }

    @Override
    public String exibirDados(){
        return ("\nCarro: \nPlaca: "+super.placa+
                "\nMarca: "+super.marca+
                "\nModelo: "+super.modelo+
                "\nAno de fabricação: "+super.anoDeFabricacao+
                "\nCapacidade máxima de passageiros: "+getNumPassageiros());    }
}
