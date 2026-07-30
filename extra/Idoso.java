package extra;

public class Idoso extends Cliente {
    private int idade;

    public Idoso(String nome, int id, int idade){
        super(nome, id);
        this.idade = idade;
    }
    // getters e setters
    public void setidade(int idade){
        this.idade = idade;
    }
    public int getNCarterinha(){
        return idade;
    }


    @Override
    public double calculaTarifa() {
        if (idade > 60) return 0;
        else {
            System.out.println("Idade invalida");
            return -1;
        }
    }
    @Override
    public String toString() {
        return ("Idoso, idade: " + idade +"\n"+ "nome: "+ nome + " id: " + id + " Tarifa: " + calculaTarifa());
    }
}
