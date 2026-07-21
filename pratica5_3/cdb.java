package pratica5_3;

public class cdb extends ativoFinanceiro{
    // construtores
    public cdb(){

    }
    public cdb(String nome, double valor_investido){
        this.nome = nome;
        this.valor_investido = valor_investido;
    }

    @Override
    public String obterTipo() {
        return "CDB";
    }
    @Override
    public double calculaRetorno(int meses) {
        return valor_investido + (valor_investido * (meses*0.04));
    }
    @Override
    public boolean podeResgatar(double valor, int meses) {
        if(valor < calculaRetorno(meses)*0.5) return true;
        else return false;
    }
}
