package Aulas.Exercicios.Aula8.Q3.model;

import java.util.List;

public class FuncionarioDocente extends Funcionario{
    protected String titulacao;

    public FuncionarioDocente(String nome, String codigo, double salario, String titulacao){
        super(nome, codigo, salario);
        this.titulacao = titulacao;
    }

    public void setTitulacao(String titulacao){
        this.titulacao = titulacao;
    }

    public String getTitulacao(){
        return titulacao;
    }

    @Override
    public Funcionario cadastrarFuncionario(){
        System.out.println("----Cadastro de funcionario Docente-----\n");
        super.cadastrarFuncionario();
        System.out.println("Digite a titulação: ");
        String titulação = scanner.nextLine();
        setTitulacao(titulacao);

        FuncionarioDocente novoFuncionario = new FuncionarioDocente(nome, codigo, salario, titulacao);
        return novoFuncionario;
    }

    @Override
    public void listarFuncionario(List<Funcionario> operarios){
        super.listarFuncionario(operarios);
    }


    @Override
    public void buscarFuncionario(List<Funcionario> operarios, String funcionarioBuscado){
        super.buscarFuncionario(operarios, funcionarioBuscado);
    }


    @Override
    public String relatorio(){
        return "---Docente --\nNome: "+nome+
                "\nCodigo: "+codigo+
                "\nSalario: "+salario+
                "\nTitulaçao: "+titulacao;
    }

}
