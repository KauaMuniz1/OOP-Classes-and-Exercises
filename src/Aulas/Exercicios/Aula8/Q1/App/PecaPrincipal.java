package Aulas.Exercicios.Aula8.Q1.App;
import Aulas.Exercicios.Aula8.Q1.model.Peca;
import Aulas.Exercicios.Aula8.Q1.model.PecaImportada;

public class PecaPrincipal {
    public static void main(String[] args) {
        Peca peca1 = new Peca("Chave", 2, 2);
        System.out.println("Peca: "+peca1.exibir());

        System.out.println("Preço final: R$" + peca1.calculoPreco(peca1.getCusto(), peca1.getLucro()));

        PecaImportada peca2 = new PecaImportada("Agua Importada", 10.00f, 5.00f, 2.00f, 3.00f);
        System.out.println("PEÇA IMPORTADA:");
        System.out.println(peca2.exibir());
        System.out.println("Preço final: R$" + peca2.calculoPreco(peca2.getCusto(), peca2.getLucro()));


    }
}
