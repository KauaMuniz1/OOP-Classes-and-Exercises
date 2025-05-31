package Aulas.Exercicios.Aula7.Q3.App;

import Aulas.Exercicios.Aula7.Q3.model.Ingresso;
import Aulas.Exercicios.Aula7.Q3.model.Normal;
import Aulas.Exercicios.Aula7.Q3.model.Vip;
import Aulas.Exercicios.Aula7.Q3.model.CamaroteInferior;
import Aulas.Exercicios.Aula7.Q3.model.CamaroteSuperior;

public class IngressosPrincipal {
    public static void main(String[] args) {
        // Ingresso comum
        Ingresso ingresso = new Ingresso(50.0);
        System.out.println("--- Ingresso Comum ---");
        ingresso.imprimeValor();

        Normal normal = new Normal(60.0);
        System.out.println("\n---Ingresso Normal ---");
        normal.imprimeTipo();
        normal.imprimeValor();

        Vip vip = new Vip(70.0, 30.0);
        System.out.println("\n--- Ingresso VIP ---");
        System.out.println("Valor VIP: R$ " + vip.getValorVip());

        CamaroteInferior inferior = new CamaroteInferior(80.0, 40.0, "Setor A, Fila 3");
        System.out.println("\n--- Camarote Inferior ---");
        inferior.imprimeLocalizacao();
        System.out.println("Valor Camarote Inferior: R$ " + inferior.getValorVip());

        CamaroteSuperior superior = new CamaroteSuperior(90.0, 50.0, 20.0);
        System.out.println("\n--- Camarote Superior ---");
        System.out.println("Valor Camarote Superior: R$ " + superior.getValorAdicionalSuperior());
    }
}
