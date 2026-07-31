/*
Luca Borges
20250103587
*/
package prova2;

public class Cubo extends Solido{
    private double lado;

    // construtores
    public Cubo(){}
    public Cubo(int id, String descricao, double lado){
        super(id, descricao);
        this.lado = lado;
    }
    // getters e setters
    public void setLado(double lado){
        this.lado = lado;
    }
    public double getLado(){
        return lado;
    }

    @Override
    public double volume() {
        return lado*lado*lado;
    }
    @Override
    public double areaSuperficial() {
        return 6*lado*lado;
    }
    @Override
    public String paraString() {
        return ("Cubo = id: " + id + " descrição: " + descricao + ". Volume: " + volume() + " Área superficial: " + areaSuperficial());
    }
}
