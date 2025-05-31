package Aulas.Exercicios.Aula3.model;

public class Cliente {
    private String nome;
    private double saldo;

    public Cliente(String nome, double saldoInicial){
        this.nome = nome;
        this.saldo = saldoInicial;
    }
    public String getNome(){
        return nome;
    }
    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito de R$ "+ valor + "realizado com sucesso");
        }
        else{
            System.out.println("Valor inválido para deposito");
        }
    }

    public void sacar(double valor){
        if(valor > 0 && saldo >= valor){
            saldo -= valor;
            System.out.println("Saque de "+ valor + "realizado com sucesso");
        }else{
            System.out.println("Saldo insuficiente ou valor inválido");
        }

    }

    public void transferir(Cliente destino, double valor){
        if(valor > 0 && saldo >= valor){
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$ "+ valor + "para " +destino.getNome()+ "Realizado com sucesso");
        }else {
            System.out.println("Transferencia não realizada, verifique o saldo ou valor: ");
        }
    }

    public void mostrarSaldo(){
        System.out.println(nome+ " Saldo atual R$"+ saldo);
    }
}
