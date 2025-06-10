package Aulas.Exercicios.Aula8.Q2.model;

public class ProdutoEstadual extends Produto{
    public ProdutoEstadual(String descricao, double valor){
        super(descricao, valor);
    }

    @Override
    public String relatorio(){
        double valorFinal = getValor() + getImposto();
        return "Produto Estadual: \n - Descrição: "+getDescricao()+
                "\nValor: "+getValor()+
                "\nImposto: "+getImposto()+
                "\nValor Final: "+valorFinal;
    }

}
