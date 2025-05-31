package Aulas.Exercicios.Aula5.model;

public class Alunow {
    private String nome;
    private float n1;
    private float n2;

    public Alunow(){
        this.nome = "";
        this.n1 = 0;
        this.n2 = 0;

    }
    public Alunow(String nome, float n1, float n2){
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
    }

    public float media(){
        return (n1+n2)/2.0f;
    }

    public boolean aprovado(){
        if(media()>=5){
            return true;
        }
        else{
            return false;
        }
    }

    public String getNome(){
        return nome;
    }

    public float getN1(){
        return n1;
    }

    public float getN2(){
        return n2;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setN1(float n1){
        this.n1 = n1;
    }

    public void setN2(float n2){
        this.n2 = n2;
    }
}
