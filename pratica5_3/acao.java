package pratica5_3;

public class acao extends ativoFinanceiro {
    // construtores
    public acao(){

    }
    public acao(String nome, double valor_investido){
        this.nome = nome;
        this.valor_investido = valor_investido;
    }

    @Override
    public double calculaRetorno(int meses) {
        return valor_investido + (valor_investido * (meses*0.08));
    }
    @Override
    public boolean podeResgatar(double valor, int meses) {
        if(meses >= 6) return true;
        else return false;
    }
}
