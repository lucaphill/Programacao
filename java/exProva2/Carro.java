package exProva2;

public class Carro extends Veiculo{
    private int quantidadePortas;
    // construtor
    public Carro(String marca, String modelo, String ano, int quantidadePortas){
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }
    public Carro(){

    }
    // setters e getters
    public void setQuantidadePortas(int quantidadePortas){
        this.quantidadePortas = quantidadePortas;
    }
    public int getQuantidadePortas(){
        return quantidadePortas;
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando");
    }
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando");        
    }
    @Override
    public String toString() {
        return ("CARRO = qPortas: "+ quantidadePortas + " Marca: " + marca +" Modelo: " + modelo + " Ano: " + ano);
    }
}
