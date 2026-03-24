public class Conta{
    private String titular;
    private double saldo;

    public Conta(String titular, double saldo){
        this.titular=titular;
        this.saldo=saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println(saldo + "Depositado com Sucesso");
    }
    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println(valor + " Saque realizado com Sucesso");
        }else{
            System.out.println("Saque negado, check seu saldo");
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }
}