package Aulas.Exercicios.Aula8.Q2.model;

public class ProdutoImportado extends ProdutoNacional {
    private double taxaImportacao;

    public ProdutoImportado(String descricao, double valor){
        super(descricao, valor);
        this.taxaImportacao = 0.5*valor;
    }

    public void setTaxaImportacao(double taxaImportacao){
        this.taxaImportacao = taxaImportacao;
    }

    public double getTaxaImportacao(){
        return taxaImportacao;
    }

    @Override

    public String relatorio(){
        double valorFinal = getValor()+getImposto()+getTaxa()+getTaxaImportacao();
        return "Produto Importado: \nDescrição: "+getDescricao()+
                "\nValor: "+getValor()+
                "\nImposto: "+getImposto()+
                "\nTaxa: "+getTaxa()+
                "\nTaxa de importação: "+taxaImportacao+
                "\nValor final: "+valorFinal;

    }
}
