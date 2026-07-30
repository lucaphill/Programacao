package extra;

public class Comum extends Cliente {

    public Comum(String nome, int id){
        super(nome, id);
    }


    @Override
    public double calculaTarifa() {
        return VALOR_BASE;
    }
    @Override
    public String toString() {
        return ("Comum\n"+ "nome: "+ nome + " id: " + id + " Tarifa: " + calculaTarifa());
    }
}
