package Aulas.Exercicios.Aula9.Q3.model;

public class Carro extends Veiculo implements Alugavel{
    private int valorAluguel = 120;
    private int numeroPortas;

    public Carro(String placa, String marca, String modelo, int anoDeFabricacao, int numeroPortas){
        super(placa, marca, modelo, anoDeFabricacao);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas(){
        return numeroPortas;
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
                "\nNumero de portas: "+numeroPortas);

    }
}
