package exProva2;

public class Moto extends Veiculo{
    private int cilindrada;
    // construtor
    public Moto(String marca, String modelo, String ano, int cilindrada){
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }
    public Moto(){

    }
    // setters e getters
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
    public int getCilindrada(){
        return cilindrada;
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando");
    }
    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando");        
    }
    @Override
    public String toString() {
        return ("MOTO = cilindradas: "+ cilindrada + " Marca: " + marca +" Modelo: " + modelo + " Ano: " + ano);
    }
}
