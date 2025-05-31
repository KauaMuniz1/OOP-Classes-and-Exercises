package Aulas.Exercicios.Aula7.Q3.model;

public class Ingresso {
    private double valor;

    public Ingresso(double valor){
        this.valor = valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

    public void imprimeTipo(){
        System.out.println("Ingreso normal");;
    }

    public double imprimeValor(){
        return valor;
    }

}
