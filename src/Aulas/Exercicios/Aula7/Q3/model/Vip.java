package Aulas.Exercicios.Aula7.Q3.model;

public class Vip extends Ingresso {
    private double valorAdicional;

    public Vip(double valor, double valorAdicional){
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorVip(){
        return getValor() + valorAdicional;
    }

}
