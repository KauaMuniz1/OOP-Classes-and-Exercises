package Aulas.Exercicios.Aula7.Q2.model;

import java.util.Arrays;

public class Professor extends Usuario {
    protected String[] disciplinas;

    public Professor(String nome, String email, String[] disciplinas){
        super(nome, email);
        this.disciplinas = disciplinas;
    }

    public void setDisciplinas(String[] disciplinas){
        this.disciplinas = disciplinas;
    }

    public String[] getDisciplinas(){
        return disciplinas;
    }

    @Override
    public String exibirPerfil(){
        return "Nome: "+getNome()+
                " Email: "+getEmail()+
                " Disciplinas: "+Arrays.toString(disciplinas);
    }


}
