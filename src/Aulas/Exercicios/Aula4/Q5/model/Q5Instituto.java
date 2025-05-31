package Aulas.Exercicios.Aula4.Q5.model;

public class Q5Instituto {
    private String nome;
    private Q5Departamento[] departamentos;
    private int numDepartamentos;

    public Q5Instituto(String nome, int capacidadeDepartamentos) {
        this.nome = nome;
        this.departamentos = new Q5Departamento[capacidadeDepartamentos];
        this.numDepartamentos = 0;
    }

    public boolean adicionarDepartamento(Q5Departamento departamento) {
        if (numDepartamentos == departamentos.length) {
            return false;
        }
        departamentos[numDepartamentos++] = departamento;
        return true;
    }

    public void imprimirDados() {
        System.out.println("Instituto: " + nome);
        for (int i = 0; i < numDepartamentos; i++) {
            departamentos[i].imprimirDados();
            System.out.println();
        }
    }
}
