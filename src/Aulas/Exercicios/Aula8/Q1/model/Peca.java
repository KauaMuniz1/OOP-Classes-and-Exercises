package Aulas.Exercicios.Aula8.Q1.model;

public class Peca {
    private String nome;
    private float custo;
    private float lucro;

    public Peca(String nome, float custo, float lucro){
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }

    public String getNome(){
        return nome;
    }

    public float getCusto(){
        return custo;
    }

    public float getLucro(){
        return lucro;
    }

    public float calculoPreco(float custo, float lucro){
        return custo+lucro;
    }

    public String exibir(){
        return "Nome: "+nome+
                "Custo:"+custo+
                "Lucro: "+lucro;
    }

}
