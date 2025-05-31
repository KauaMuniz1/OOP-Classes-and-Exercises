package Aulas.Exercicios.Aula7.Q2.App;
import Aulas.Exercicios.Aula7.Q2.model.Usuario;
import Aulas.Exercicios.Aula7.Q2.model.Admin;
import Aulas.Exercicios.Aula7.Q2.model.AlunoSub;
import Aulas.Exercicios.Aula7.Q2.model.Professor;

public class UsuariosPrincipal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Oto", "oto.ifma.edu.br");

        String[] permissoesAdm = {"Ver perfil", "Adicionar", "Expulsar"};
        Admin admin = new Admin("Leonel", "Leonel.ifma.edu.br", permissoesAdm);

        String[] disciplinasProfessor = {"Circuitos", "Arduino", "Eletronica", "Mais Circuitos", "Circuitos extras", "logisim", "Robotica", "Teoria dos circuitos", "Pensamento circuitacional"};
        Professor professor = new Professor("Claudio", "Claudio@ifma.edu.br", disciplinasProfessor);

        AlunoSub aluno = new AlunoSub("Kaua", "kauafreitas@ifma.edu.br", "0026","Agropecuaria");

        System.out.println("-------USUARIO------");
        System.out.println(usuario.exibirPerfil());

        System.out.println("-------ADMIN----------");
        System.out.println(admin.exibirPerfil());

        System.out.println("------PROFESSOR--------");
        System.out.println(professor.exibirPerfil());

        System.out.println("-------ALUNO------------");
        System.out.println(aluno.exibirPerfil());    }
}
