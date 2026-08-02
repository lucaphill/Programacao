package extra;

public class Estudante extends Cliente {
    private int nCarteirinha;

    public Estudante(String nome, int id, int nCarteirinha){
        super(nome, id);
        this.nCarteirinha = nCarteirinha;
    }
    // getters e setters
    public void setNCarteirinha(int nCarteirinha){
        this.nCarteirinha = nCarteirinha;
    }
    public int getNCarterinha(){
        return nCarteirinha;
    }


    @Override
    public double calculaTarifa() {
        return VALOR_BASE / 2;
    }
    @Override
    public String toString() {
        return ("Estudante n° " + nCarteirinha +"\n"+ "nome: "+ nome + " id: " + id + " Tarifa: " + calculaTarifa());
    }
}
