package Aulas.Exercicios.Aula8.Q2.model;

public class Produto {
    protected String descricao;
    protected double valor;
    protected double imposto;

    public Produto(String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
        this.imposto = 0.10 * valor;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public void setImposto(double imposto){
        this.imposto = imposto;
    }

    public String getDescricao(){
        return descricao;
    }

    public double getValor(){
        return valor;
    }

    public double getImposto(){
        return imposto;
    }

    public String relatorio(){
        double valorFinal = valor + imposto;

        return "Descricao: "+descricao+
                "\nValor: "+valor+
                "\nimposto: "+imposto+
                "\nValor final: "+valorFinal;
    }
}
