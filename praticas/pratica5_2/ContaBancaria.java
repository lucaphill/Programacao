package praticas.pratica5_2;

public abstract class ContaBancaria implements operacoes {

    private int id;
    private String titular;
    private double saldo;


    //construtor
    public ContaBancaria(int id, String titular, double saldo){
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }

    //gets e sets
    public int getId(){
        return id;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}