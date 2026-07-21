package pratica5_3;
import java.util.*;

public class main {
    public static void main(String[] args) {
        ArrayList<carteiraInvestimentos> carteira = new ArrayList<carteiraInvestimentos>();

        for (int i = 0; i < 10; i++){
            int temp = random();
            switch (temp) {
                case 0:
                    ativos.add(new acao("compra xxx", 2000));
                    break;
                case 1:
                    ativos.add(new tesouroDireto("compra xx", 2000));
                    break;
                case 2:
                    ativos.add(new cdb("compra x", 2000));
                    break;
                default:
                    System.out.println("Algum erro aconteceu na randomização de itens");
                    break;
            }
        }

        for (ativoFinanceiro a : ativos){
            System.out.println(a.obterTipo() +": "+ a.calculaRetorno(6) +" "+ a.podeResgatar(1000, (int)(Math.random()*7)));
        }
    }

    public static int random(){
        return (int) (Math.random()*3);
    }
}
