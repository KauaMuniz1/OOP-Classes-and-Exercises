package Aulas.Exercicios.Aula7.Q1.model;

public class EmpregadoComissionadoComBase extends EmpregadoComissionado {
    private double salarioBase;

    public EmpregadoComissionadoComBase(String nome, String CPF, int vendas, double salario, double percentual, double salarioBase){
        super(nome, CPF, salario, vendas, percentual);
        this.salarioBase = salarioBase;
    }


    @Override
    public double calcularSalario(){
        return salarioBase + super.calcularSalario();
    }

}
