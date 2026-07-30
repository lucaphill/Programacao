package extra;

public abstract class Cliente {
    protected String nome;
    protected int id;
    public static double VALOR_BASE = 100;

    // construtores
    public Cliente(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    // getters e setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public abstract double calculaTarifa();
    public abstract String toString();

}
