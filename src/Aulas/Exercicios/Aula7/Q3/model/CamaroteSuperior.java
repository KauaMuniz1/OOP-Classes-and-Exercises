package Aulas.Exercicios.Aula7.Q3.model;

public class CamaroteSuperior extends Vip {
    private double valorAdicionalSuperior;

    public CamaroteSuperior(double valor, double valorAdicional, double valorAdicionalSuperior){
        super(valor, valorAdicional);
        this.valorAdicionalSuperior = valorAdicionalSuperior;
    }

    public double getValorAdicionalSuperior(){
        return getValorVip()+valorAdicionalSuperior;
    }

}
