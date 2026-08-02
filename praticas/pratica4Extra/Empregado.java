// Luca Borges 20250103587
package praticas.pratica4Extra;

public abstract class Empregado {
    protected int id;
    protected String nome;
    protected double salario;
    protected double imposto;

    // construtores
    public Empregado(){
        id = geraId(id);
    }
    public Empregado(int id, String nome, double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }
    public Empregado(int id, String nome, double salario, double imposto){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.imposto = imposto;
    }

    // funções
    public abstract double calculaSalarioLiquido(double salario, double imposto);
    public abstract String toString();

    public void aumentarSalario(double percentual){
        this.salario += percentual * (salario/100);
    }

    public int geraId(int id){
        return (int)(Math.random()*1000);
    }

    // getters e setters
    public int getId(){
        return id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setSalario (double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    public void setImposto(double imposto){
        this.imposto = imposto;
    }
    public double getImposto(){
        return imposto;
    }
}
