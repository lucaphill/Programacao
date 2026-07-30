package exProva2;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected String ano;
    // construtores
    public Veiculo(){

    }
    public Veiculo(String marca, String modelo, String ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    // getters e setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setAno(String ano){
        this.ano = ano;
    }
    public String getAno(){
        return ano;
    }

    // metodos
    public abstract void frear();
    public abstract void acelerar();
    public abstract String toString();
}
