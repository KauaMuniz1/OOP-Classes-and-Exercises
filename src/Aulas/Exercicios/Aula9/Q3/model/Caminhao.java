package Aulas.Exercicios.Aula9.Q3.model;

public class Caminhao extends Veiculo implements Alugavel {
    private int capacidadeCarga;
    private double valorAluguelPorDia = 250;

    public Caminhao(String placa, String marca, String modelo, int anoDeFabricacao, int capacidadeCarga) {
        super(placa, marca, modelo, anoDeFabricacao);
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public double calcularValorAluguel(int dias) {
        return valorAluguelPorDia * dias;
    }

    @Override
    public String exibirDados() {
        return ("\nCaminhão: \nPlaca: " + placa +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nAno de fabricação: " + anoDeFabricacao +
                "\nCapacidade de carga: " + capacidadeCarga + " kg");
    }
}
