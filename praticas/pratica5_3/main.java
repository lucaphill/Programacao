/*
Luca Borges 20250103587
Thiago Sales 20250103602
*/
package praticas.pratica5_3;
import java.util.*;

public class main {
    public static void main(String[] args) {
        ArrayList<carteiraInvestimentos> carteiras = new ArrayList<carteiraInvestimentos>();
        ArrayList<Integer> tiposCarteira = new ArrayList<Integer>();
        final int quantCarteiras = 5;

        /* 
        com base num número aleatório entre 0 e 2 ele gera um padrão diferente de investimentos, todos tem dados basicamente iguais, a diferença é o valor investido em cada
        */
        for (int i = 0; i < quantCarteiras; i++){
            int temp = random();
            tiposCarteira.add(temp);

            if(temp == 0){
                carteiras.add(new carteiraInvestimentos());
                carteiras.get(i).adicionarAtivo(new acao("compra 0", 2000));
                carteiras.get(i).adicionarAtivo(new tesouroDireto("compra 00", 2000));
                carteiras.get(i).adicionarAtivo(new cdb("compra 000", 2000));
            }
            else if (temp == 1){
                carteiras.add(new carteiraInvestimentos());
                carteiras.get(i).adicionarAtivo(new acao("compra 1", 500));
                carteiras.get(i).adicionarAtivo(new tesouroDireto("compra 11", 500));
                carteiras.get(i).adicionarAtivo(new cdb("compra 111", 500));
            }
            else if (temp == 2){
                carteiras.add(new carteiraInvestimentos());
                carteiras.get(i).adicionarAtivo(new acao("compra 2", 3000));
                carteiras.get(i).adicionarAtivo(new tesouroDireto("compra 22", 3000));
                carteiras.get(i).adicionarAtivo(new cdb("compra 222", 3000));
            }
            else {
                System.out.println("Algum erro aconteceu na randomização de itens");
                    break;
            }
        }

        /*
        tenta tirar 1000 reais de cada tipo com base no index, como tudo é aleatório eu deixei essa parte fixa
        */
        for (int i = 0; i < carteiras.size(); i++){
            System.out.println("Carteira tipo: " + tiposCarteira.get(i));
            System.out.println("Valor investido após 12 meses: R$ " + carteiras.get(i).calcularValorTotal(12)); 
            if(i == 1 || i == 0){
                // restaga o primeiro ativo se possivel
                if(carteiras.get(i).resgatar("compra "+tiposCarteira.get(i), 1000, 12)){
                    System.out.println("Parabéns, você resgatou seu 1° ativo com sucesso");
                } else System.out.println("Não foi possível restagar o 1° ativo");
            }
            else if(i == 2){
                // restaga o segundo ativo se possivel
                if(carteiras.get(i).resgatar("compra "+tiposCarteira.get(i)+tiposCarteira.get(i), 1000, 12)){
                    System.out.println("Parabéns, você resgatou seu 2° ativo com sucesso");
                } else System.out.println("Não foi possível restagar o 2° ativo");
            }
            else if(i==3 || i == 4){
                // restaga o terceiro ativo se possivel
                if(carteiras.get(i).resgatar("compra "+tiposCarteira.get(i)+tiposCarteira.get(i)+tiposCarteira.get(i), 1000, 12)){
                    System.out.println("Parabéns, você resgatou seu 3° ativo com sucesso");
                } else System.out.println("Não foi possível restagar o 3° ativo");
            }
        }
    }

    public static int random(){
        return (int) (Math.random()*3);
    }
}
