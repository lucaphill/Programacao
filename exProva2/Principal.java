package exProva2;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        for(int i = 0; i < 10; i++){
            if(random() == 1) veiculos.add(new Carro("Quid", "Asale", "15/03/27", 4));
            else if(random() == 0) veiculos.add(new Moto("Ronda", "Civiq", "15/03/10", 150));
        }

        for(Veiculo veiculo : veiculos){
            veiculo.acelerar();
        }

    }
    public static int random(){
        return (int) (Math.random()*2);
    }
}
