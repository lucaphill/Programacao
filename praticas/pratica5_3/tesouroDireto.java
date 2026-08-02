package praticas.pratica5_3;

public class tesouroDireto extends ativoFinanceiro {
    // construtores
    public tesouroDireto(){

    }
    public tesouroDireto(String nome, double valor_investido){
        this.nome = nome;
        this.valor_investido = valor_investido;
    }

    @Override
    public String obterTipo() {
        return "tesouro Direto";
    }
    @Override
    public double calculaRetorno(int meses) {
        return valor_investido + (valor_investido * (meses*0.03));
    }
    @Override
    public boolean podeResgatar(double valor, int meses) {
        return true;
    }
}
