package Aulas.Exercicios.Aula8.Q1.model;

public class PecaImportada extends Peca {
    private float taxaImportacao;
    private float taxaFrete;

    public PecaImportada(String nome, float custo, float lucro, float taxaImportacao, float taxaFrete){
        super(nome, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.taxaFrete = taxaImportacao;

    }
    public float getTaxaImportacao(){
        return taxaImportacao;
    }

    public float getTaxaFrete(){
        return taxaFrete;
    }

    @Override
    public float calculoPreco(float custo, float lucro){
        return custo + lucro + taxaFrete + taxaImportacao;
    }

    @Override
    public String exibir(){
        return "Nome: "+ getNome()+
                "Custo: "+getCusto()+
                "Lucro: "+getLucro()+
                "Taxa de importacao: "+taxaImportacao+
                "Taxa de frete: "+taxaFrete;
    }
}
