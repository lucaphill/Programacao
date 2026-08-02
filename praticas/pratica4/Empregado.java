package praticas.pratica4;

public class Empregado {
    private int id;
    private String nome;
    private double salario;
    private double imposto;

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
    public void aumentarSalario(double percentual){
        this.salario += percentual * (salario/100);
    }

    public double calculaSalarioLiquido(double salario, double imposto){
        double liquido;
        liquido = salario - imposto;
        return liquido;
    }

    public int geraId(int id){
        return (int)(Math.random()*1000);

    }

    public String toString(){
        String dados;
        dados = ("Id: " + id + " Nome: " + nome + " Salário: " + calculaSalarioLiquido(salario, imposto) + " Imposto: " + imposto);
        return dados;
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
