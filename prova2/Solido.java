/*
Luca Borges
20250103587
*/
package prova2;

public abstract class Solido {
    protected int id;
    protected String descricao;

    // construtores
    public Solido(){}
    public Solido(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }
    // getters e setters
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }

    public abstract double volume();
    public abstract double areaSuperficial();
    public abstract String paraString();

}
