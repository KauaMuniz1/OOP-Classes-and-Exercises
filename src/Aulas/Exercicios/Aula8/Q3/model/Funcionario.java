package Aulas.Exercicios.Aula8.Q3.model;

import java.util.List;
import java.util.Scanner;

public class Funcionario extends Object{
    protected String nome;
    protected String codigo;
    protected double salario;

    Scanner scanner = new Scanner(System.in);

    public Funcionario( String nome, String codigo, double salario) {
        this.salario = salario;
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario cadastrarFuncionario(){
        System.out.println("Digite o nome do funcionario: ");
        String cadastroFuncionarioNome = scanner.nextLine();
        setNome(cadastroFuncionarioNome);

        System.out.println("Digite o código do funcionário: ");
        String cadastroFuncionarioCodigo = scanner.nextLine();
        setCodigo(cadastroFuncionarioCodigo);

        System.out.println("Digite o salário do funcionario: ");
        double cadastroFuncionariosalario = scanner.nextDouble();
        setSalario(cadastroFuncionariosalario);

        Funcionario novoFuncionario = new Funcionario(cadastroFuncionarioNome, cadastroFuncionarioCodigo, cadastroFuncionariosalario);

        return novoFuncionario;

    }

    public void listarFuncionario(List<Funcionario> operarios){
        int i = 0;
        while(i<operarios.size()){
            operarios.get(i).relatorio();
            i++;
        }
    }

    public void buscarFuncionario(List<Funcionario> operarios, String funcionarioBuscado){
        System.out.println("Insira o nome a qual voce quer buscar: ");
        funcionarioBuscado = scanner.nextLine();

        int verificador = 0;

        for(int i = 0; i <operarios.size(); i++){
            if(operarios.get(i).getNome().equalsIgnoreCase(funcionarioBuscado)){
                operarios.get(i).relatorio();
                verificador++;

            }

        }
        if (verificador == 1){
            System.out.println("Nome encontrado");
        }
        else{
            System.out.println("Funcionario não encontrado");
        }
    }

    public String relatorio(){
        return "\nNome: "+nome+
                "\nCodigo: "+codigo+
                "\nSalario: "+salario;

    }
}
