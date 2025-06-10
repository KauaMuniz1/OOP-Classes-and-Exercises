package Aulas.Exercicios.Aula8.Q3.model;

import java.util.Scanner;

public class Departamento {
    protected String codigo;
    protected String nome;
    protected Funcionario[] funcionarios;
    protected int contFuncionario;
    protected int numeroMaxFuncionario;
    protected int quantidadeFuncionarios;

    Scanner scanner = new Scanner(System.in);

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getNumeroMaxFuncionario() {
        return numeroMaxFuncionario;
    }

    public void setNumeroMaxFuncionario(int numeroMaxFuncionario) {
        this.numeroMaxFuncionario = numeroMaxFuncionario;
    }

    public int getContFuncionario() {
        return contFuncionario;
    }

    public void setContFuncionario(int contFuncionario) {
        this.contFuncionario = contFuncionario;
    }

    public Departamento(String codigo, String nome, Funcionario[] funcionarios){
        this.codigo = codigo;
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }


    public void adicionarFuncionario(Funcionario funcionario){
        System.out.println("Digite o nome do funcionario a ser adicionado: ");
        if(numeroMaxFuncionario == quantidadeFuncionarios){
            System.out.println("Já tá cheio");
        }
        funcionarios[quantidadeFuncionarios] = funcionario.cadastrarFuncionario();
        quantidadeFuncionarios++;
    }

    public void criarFuncionario(){
        System.out.println("Digite o tipo do funcionario: \n1 - tecnico\n2 - docente\n");
        int opcao = Integer.parseInt(scanner.nextLine());
        if(opcao == 1 ){
            FuncionarioTecnico novoFuncionario = new FuncionarioTecnico(null,null,0,null);
            adicionarFuncionario(novoFuncionario);
        }
        else if(opcao == 2){
            FuncionarioDocente novoFuncionario = new FuncionarioDocente(null, null, 0, null);
            adicionarFuncionario(novoFuncionario);
        }else{
            System.out.println("Opcao invalida");
        }
    }

    public void buscarFuncionario(String nome) {
        System.out.println("Digite o seu nome: ");
        nome = scanner.nextLine();

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            if (nome.equalsIgnoreCase(funcionarios[i].nome)) {
                System.out.println(funcionarios[i]);
            }
        }
    }

    public void calcularGastos(){
        double gasto = 0;

        for(int i  = 0; i < this.quantidadeFuncionarios; i++){
            gasto += funcionarios[i].getSalario();
        }
        System.out.println(gasto);

    }

    public String relatorio(){
        return "Departamento: \nNome: "+nome+
                "\nCodigo: "+codigo+
                "\nQuantidade de funcionarios: "+funcionarios;
    }
}
