package pratica5_2;

import java.time.LocalDate;

public class ContaSalario extends ContaBancaria{
    private LocalDate ultimosaque = null;
    int mes = LocalDate.now().getMonthValue();

    public ContaSalario(int id, String titular, double saldo){
        super(id, titular, saldo);
    }

    public void depositar(double valor){
        setSaldo(getSaldo()+valor);
        System.out.println("Valor depositado");
    }

    public void sacar(double valor){
        LocalDate mes_atual= LocalDate.now();

        if(ultimosaque == null || mes_atual.getMonthValue() != ultimosaque.getMonthValue()){
            setSaldo(getSaldo()-valor);
            ultimosaque = mes_atual;
            System.out.println("Saque realizado");
        } else {
            System.out.println("Você já sacou esse mês");
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