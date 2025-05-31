package Aulas.Exercicios.Aula7.Q1.model;

public class EmpregadoComissionado extends Empregado {
    protected int vendas;
    protected double percentual;
    public EmpregadoComissionado(String nome, String CPF, double salario, int vendas, double percentual){
        super(nome, CPF, salario);
        this.vendas = vendas;
        this.percentual = percentual;
    }
    public int getVendas(){
        return vendas;
    }

    public double getPercentual(){
        return percentual;
    }

    @Override
    public double calcularSalario(){
        return vendas * percentual;
    }

}
