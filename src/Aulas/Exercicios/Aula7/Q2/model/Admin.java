package Aulas.Exercicios.Aula7.Q2.model;

import java.util.Arrays;

public class Admin extends Usuario {
    private String[] permissoes;

    public Admin(String nome, String email, String[] permissoes){
        super(nome,email);
        this.permissoes = permissoes;
    }

    @Override
    public String exibirPerfil(){
        return "Nome: " +getNome()+
                " Email: "+getEmail()+
                " Permissoes: "+Arrays.toString(permissoes);
    }

}
