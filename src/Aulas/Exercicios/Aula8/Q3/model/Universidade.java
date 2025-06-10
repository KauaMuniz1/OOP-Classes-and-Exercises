package Aulas.Exercicios.Aula8.Q3.model;
import java.util.Scanner;
public class Universidade {
    protected String nome;
    protected Departamento[] departamentos;
    protected int numeroMaximoDepartamentos;
    protected int quantidadeDepartamentos;

    public Universidade(String nome, int numeroMaximoDepartamentos){
        this.nome = nome;
        this.numeroMaximoDepartamentos = numeroMaximoDepartamentos;
        this.departamentos = new Departamento[numeroMaximoDepartamentos];
        this.quantidadeDepartamentos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento[] getDepartamento() {
        return departamentos;
    }

    public void setDepartamento(Departamento[] departamento) {
        this.departamentos = departamento;
    }

    public int getNumeroMaximoDepartamentos() {
        return numeroMaximoDepartamentos;
    }

    public void setNumeroMaximoDepartamentos(int numeroMaximoDepartamentos) {
        this.numeroMaximoDepartamentos = numeroMaximoDepartamentos;
    }

    public int getQuantidadeDepartamentos() {
        return quantidadeDepartamentos;
    }

    public void setQuantidadeDepartamentos(int quantidadeDepartamentos) {
        this.quantidadeDepartamentos = quantidadeDepartamentos;
    }

    public void adicionarDepartamento(Departamento novoDepartamento){

        if(this.quantidadeDepartamentos == this.numeroMaximoDepartamentos){
            System.out.println("Limite de departamentos excedido");
            return;
        }
        this.departamentos[this.quantidadeDepartamentos] = novoDepartamento;
        this.quantidadeDepartamentos++;
    }

    public void criarDepartamento(String nome, String codigo,  Funcionario funcionarios[]){
        Departamento novoDepartamento = new Departamento(nome, codigo, funcionarios);
        adicionarDepartamento(novoDepartamento);
    }

    public boolean verificarDepartamento(String nome){
        for(int i = 0; i < quantidadeDepartamentos;i++){
            if(departamentos[i].getNome().equalsIgnoreCase(nome)){
                return true;
            }
        }
        return false;
    }

    public Departamento buscarDepartamento(String nome){
        for(int i = 0; i < quantidadeDepartamentos; i++){
            if(departamentos[i].getNome().equalsIgnoreCase(nome)){
                return departamentos[i];
            }
        }
        return null;
    }



}
