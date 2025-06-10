package Aulas.Exercicios.Aula8.Q2.model;

public class ProdutoNacional extends Produto{
    private double taxa;

    public ProdutoNacional(String descricao, double valor){
        super(descricao, valor);
        this.taxa = 0.05 *valor;
    }

    public double getTaxa(){
        return taxa;
    }

    @Override
    public String relatorio(){
        double valorFinal = getValor()+getImposto()+taxa;
        return "Produto Nacional - \nDescrição: "+getDescricao()+
                "\nValor: "+getValor()+
                "\nImposto: "+getImposto()+
                "\nTaxa: "+taxa+
                "\nValor final: "+valorFinal;
    }

}
