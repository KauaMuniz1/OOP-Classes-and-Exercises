package Aulas.Exercicios.Aula9.Q3.model;

public abstract class Veiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int anoDeFabricacao;

    public Veiculo(){

    }
    public Veiculo(String placa, String marca, String modelo, int anoDeFabricacao){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public abstract String exibirDados();

}
