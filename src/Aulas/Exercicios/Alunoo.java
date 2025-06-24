package Aulas.Exercicios;

public class Alunoo {
    private String nome;
    private String matricula;
    private float n1, n2, t1, t2;

    public float calcularMedia(){
        float media = (n1+n2+t1+t2)/4;
        return media;
    }

    public boolean isAprovado(){
        float media = calcularMedia();
        if(media >= 5){
            return true;
        }
        else {
            return false;
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setN1(float n1){
        this.n1 = n1;
    }

    public void setN2(float n2){
        this.n2 = n2;
    }

    public void setT1(float t1){
        this.t1 = t1;
    }

    public void setT2(float t2){
        this.t2 = t2;
    }



    public String getNome(){
        return this.nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public float getN1(){
        return this.n1;
    }

    public float getN2(){
        return this.n2;
    }

    public float getT1(){
        return this.t1;
    }

    public float getT2(){
        return this.t2;
    }



}

