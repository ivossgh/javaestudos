public class Nubank{
    private String usuario;
    private double saldo;

    public Nubank(String usuario, double saldo){
        this.usuario=usuario;
        this.saldo=saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println(valor + "Depositado com Sucesso");
    }

    public void sacar(double valor){
        if(valor<=saldo){
            saldo -= valor;
            System.out.println(valor + "Sacado com Sucesso");
        }else{
            System.out.println("Saque no valor de: " + valor + "Negado, consulte seu Saldo");
        }
    }
    public double getSaldo(){
        return saldo;
    }

    public String getUsuario(){
        return usuario;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}