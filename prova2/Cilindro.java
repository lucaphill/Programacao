/*
Luca Borges
20250103587
*/
package prova2;

public class Cilindro extends Solido{
    private double altura;
    private double raio;
    // construtores
    public Cilindro(){}
    public Cilindro(int id, String descricao, double raio, double altura){
        super(id, descricao);
        this.raio = raio;
        this.altura = altura;
    }

    // getters e setters
    public void setRaio(double raio){
        this.raio = raio;
    }
    public double getRaio(){
        return raio;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }


    @Override
    public double volume() {
        return Math.PI * raio*raio * altura;
    }
    @Override
    public double areaSuperficial() {
        return 2 * Math.PI * raio * (raio+altura);
    }
    @Override
    public String paraString() {
        return ("Cilindro = id: " + id + " descrição: " + descricao + ". Volume: " + volume() + " Área superficial: " + areaSuperficial());
    }
}
