/*
Luca Borges
20250103587
*/
package prova2;

public class Esfera extends Solido{
    private double raio;
    // construtores
    public Esfera(){}
    public Esfera(int id, String descricao, double raio){
        super(id, descricao);
        this.raio = raio;
    }

    // getters e setters
    public void setRaio(double raio){
        this.raio = raio;
    }
    public double getRaio(){
        return raio;
    }
    

    @Override
    public double volume() {
        return 4.0/3.0 * Math.PI * (raio*raio*raio);
    }
    @Override
    public double areaSuperficial() {
        return 4 * Math.PI * raio*raio;
    }
    @Override
    public String paraString() {
        return ("Esfera = id: " + id + " descrição: " + descricao + ". Volume: " + volume() + " Área superficial: " + areaSuperficial());
    }
}
