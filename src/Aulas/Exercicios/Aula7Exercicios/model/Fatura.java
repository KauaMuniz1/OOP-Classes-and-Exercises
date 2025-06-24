package Aulas.Exercicios.Aula7Exercicios.model;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidadeComprada;
    private double precoItem;

    public Fatura(String numero, String descricao, int quantidadeComprada, double precoItem){
        this.numero = numero;
        this.descricao = descricao;
        this.precoItem = precoItem;
        this.quantidadeComprada = quantidadeComprada;
    }

    public String getNumero(){
        return numero;

    }

    public String getDescricao(){
        return descricao;
    }

    public int getQuantidadeComprada(){
        return quantidadeComprada;
    }

    public double getPrecoItem(){
        return precoItem;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setDescricao(String descricao){
        this.numero = numero;
    }

    public void setQuantidadeComprada(int quantidadeComprada){
        if(quantidadeComprada > 0){
            this.quantidadeComprada = quantidadeComprada;
        }else {
            this.quantidadeComprada = quantidadeComprada;
        }
    }

    public void setPrecoItem(double precoItem){
        if(precoItem > 0){
            this.precoItem = precoItem;
        }else{
            this.precoItem = precoItem;
        }
    }
}
