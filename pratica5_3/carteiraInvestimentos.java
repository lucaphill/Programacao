package pratica5_3;
import java.util.*;

public class carteiraInvestimentos {
    ArrayList<ativoFinanceiro> ativos = new ArrayList<ativoFinanceiro>();

    public void adicionarAtivo(ativoFinanceiro ativo){
        ativos.add(ativo);
    }

    public double calcularValorTotal(int meses){
        double sum = 0;
        for (ativoFinanceiro a : ativos){
            sum += a.calculaRetorno(meses);
        }
        return sum;
    }

    public boolean resgatar(String nomeAtivo, double valor, int meses){
        for (int i = 0; i < ativos.size(); i++){
            if (ativos.get(i).getNome().equalsIgnoreCase(nomeAtivo)){
                if(ativos.get(i).podeResgatar(valor, meses)){
                    ativos.remove(i);
                    return true;
                }
            }
        }
        return false;
    }
}
