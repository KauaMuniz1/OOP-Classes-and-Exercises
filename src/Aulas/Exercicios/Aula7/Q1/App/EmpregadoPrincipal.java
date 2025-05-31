package Aulas.Exercicios.Aula7.Q1.App;

import Aulas.Exercicios.Aula7.Q1.model.Empregado;
import Aulas.Exercicios.Aula7.Q1.model.EmpregadoComissionado;
import Aulas.Exercicios.Aula7.Q1.model.EmpregadoComissionadoComBase;

public class EmpregadoPrincipal {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Claudio", "12345678901", 10);

        System.out.println("Empregado: "+empregado.getNome()+" - CPF: "+empregado.getCPF()+ " - salario: "+empregado.getSalario());

        EmpregadoComissionado empregadoComissionado = new EmpregadoComissionado("Luis", "100", 1000, 2, 10);

        System.out.println("Empregado: "+empregadoComissionado.getNome()+" - CPF: "+empregadoComissionado.getCPF()+ " - salario: "+empregadoComissionado.calcularSalario());


        EmpregadoComissionadoComBase empregadoComissionadoComBase = new EmpregadoComissionadoComBase("Leonel", "1002020", 10, 1020, 10, 900);

        System.out.println("Empregado: "+empregadoComissionadoComBase.getNome()+" - CPF: "+empregadoComissionadoComBase.getCPF()+ " - vendas: "+empregadoComissionadoComBase.getVendas()+ " - Salario: "+empregadoComissionadoComBase.calcularSalario()+ " - Percentual: "+ empregadoComissionadoComBase.getPercentual());




    }
}
