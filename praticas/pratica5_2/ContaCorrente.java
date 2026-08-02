package praticas.pratica5_2;

public class ContaCorrente extends ContaBancaria{
    
    public ContaCorrente(int id, String titular, double saldo){
        super(id, titular, saldo);
    }

    public void depositar(double valor){
        setSaldo(getSaldo()+valor);
        System.out.println("Valor depositado");
    }

    public void sacar(double valor){
        setSaldo(getSaldo() - valor - 2);
        System.out.println("Valor sacado");
    }

    public void info(){
        System.out.println("=========================");
        System.out.println("ID: "+getId());
        System.out.println("Titular"+getTitular());
        System.out.println("Saldo: R$"+getSaldo());
        System.out.println("=========================");
    }

}
