package Aulas.Exercicios.Aula7.Q2.model;

public class AlunoSub extends Usuario {
    private String matricula;
    private String curso;

    public AlunoSub(String nome, String email, String matricula, String curso){
        super(nome, email);
        this.matricula = matricula;
        this.curso = curso;
    }
    public String getMatricula(){
        return matricula;
    }

    public String getCurso(){
        return curso;
    }

    @Override
    public String exibirPerfil() {
        return "Nome: "+getNome()+
                " Email: "+getEmail()+
                " Matricula: "+matricula+
                " Curso: "+curso;
    }
}
