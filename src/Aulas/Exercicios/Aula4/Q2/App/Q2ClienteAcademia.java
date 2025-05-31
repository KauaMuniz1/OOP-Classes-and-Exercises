package Aulas.Exercicios.Aula4.Q2.App;

public class Q2ClienteAcademia {
    private String nome;
    private int idade;
    private float altura;
    private float peso;

    public Q2ClienteAcademia(String nome, int idade, float altura, float peso){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public float getAltura(){
        return altura;
    }

    public float getPeso(){
        return peso;
    }

    public boolean isMenorDeIdade(){
        return idade < 18;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public boolean temDesconto() {
        return isMenorDeIdade();
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + (isMenorDeIdade() ? " (Menor de idade)" : " (Maior de idade)"));
        System.out.printf("Peso: %.2f kg%n", peso);
        System.out.printf("Altura: %.2f m%n", altura);
        System.out.printf("IMC: %.2f%n", calcularIMC());
        System.out.println("Desconto: " + (temDesconto() ? "Sim" : "Não"));
    }


}
