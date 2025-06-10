package Aulas.Exercicios.Aula8.Q3.model;

import java.util.List;

public class FuncionarioTecnico extends Funcionario {
    protected String nivel;

    public FuncionarioTecnico(String nome, String codigo, double salario, String nivel) {
        super(nome, codigo, salario);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public Funcionario cadastrarFuncionario(){
        System.out.println("----Cadastro de funcionario Técnico-----\n");
        super.cadastrarFuncionario();
        System.out.println("Digite o nivel: ");
        String nivel = scanner.nextLine();
        setNivel(nivel);

        FuncionarioTecnico novoFuncionario = new FuncionarioTecnico(nome,codigo, salario, nivel);
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
                "\nivel: "+nivel;
    }
}
