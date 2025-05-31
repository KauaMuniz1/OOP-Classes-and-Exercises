package Aulas.Exercicios.Aula7.Q1.model;

public class Empregado {
    public String Nome;
    public String CPF;
    public double salario;

    public void setNome(String nome){
        this.Nome = nome;
    }
    public String getNome(){
        return Nome;
    }

    public void setCPF(String cpf){
        this.CPF = cpf;
    }

    public String getCPF(){
        return CPF;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }

    public Empregado(String nome, String CPF, double salario){
        this.Nome = nome;
        this.CPF = CPF;
        this.salario = salario;
    }

    public double calcularSalario(){
        return salario;
    }
}
