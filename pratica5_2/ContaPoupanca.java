package pratica5_2;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(int id, String titular, double saldo){
        super(id, titular, saldo);
    }

    public void depositar(double valor){
        setSaldo(getSaldo()+valor);
        System.out.println("Valor depositado");
    }

    public void sacar(double valor){
        if (getSaldo() >= 0) {
            setSaldo(getSaldo() - valor);
            if (getSaldo() < 0) {
                setSaldo(getSaldo() + valor);
                System.out.println("Saldo insuficiente");
            } else{
                System.out.println("Valor sacado");
            }
        } else if (getSaldo() < 0) {
            System.out.println("Saldo insuficiente");
        }
    }

    public void info(){
        System.out.println("=========================");
        System.out.println("ID: "+getId());
        System.out.println("Titular"+getTitular());
        System.out.println("Saldo: R$"+getSaldo());
        System.out.println("=========================");
    }
}
