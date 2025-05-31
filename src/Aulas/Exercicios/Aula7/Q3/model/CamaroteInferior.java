package Aulas.Exercicios.Aula7.Q3.model;

public class CamaroteInferior extends Vip {
    private String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao){
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao(){
        return localizacao;
    }

    public void imprimeLocalizacao(){
        System.out.println("Localização"+ localizacao);
    }
}
