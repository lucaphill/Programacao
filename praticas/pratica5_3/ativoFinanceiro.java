/*
Luca Borges 20250103587
Thiago Sales 20250103602
*/
package praticas.pratica5_3;

public abstract class ativoFinanceiro {
    public String nome;
    protected double valor_investido;
    
    // getters e setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setValor_investido(double valor_investido){
        this.valor_investido = valor_investido;
    }
    public double getValor_investido(){
        return valor_investido;
    }

    public abstract String obterTipo();
    public abstract double calculaRetorno(int meses);
    public abstract boolean podeResgatar(double valor, int meses);
}
