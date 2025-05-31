package Aulas.Exercicios.Aula4.Q5.model;

public class Q5Departamento {
    private String codigo;
    private String nome;
    private String telefone;
    private Q5Docente[] docentes;
    private int numDocentes;

    public Q5Departamento(String codigo, String nome, String telefone, int capacidadeDocentes) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.docentes = new Q5Docente[capacidadeDocentes];
        this.numDocentes = 0;
    }

    public boolean adicionarDocente(Q5Docente docente) {
        if (numDocentes == docentes.length) {
            return false;
        }
        docentes[numDocentes++] = docente;
        return true;
    }

    public void imprimirDados() {
        System.out.println("  Departamento Código: " + codigo);
        System.out.println("  Nome: " + nome);
        System.out.println("  Telefone: " + telefone);
        System.out.println("  Docentes:");
        for (int i = 0; i < numDocentes; i++) {
            docentes[i].imprimirDados();
            System.out.println();
        }
    }
}
