package Aulas.Exercicios.Aula4.Q5.model;

public class Q5Docente {
    private int codigo;
    private String nome;
    private String funcao;
    private double salario;

    public Q5Docente(int codigo, String nome, String funcao, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void imprimirDados() {
        System.out.println("    Docente Código: " + codigo);
        System.out.println("    Nome: " + nome);
        System.out.println("    Função: " + funcao);
        System.out.printf("    Salário: R$%.2f%n", salario);
    }
}
