package Revisão;
import javax.swing.JOptionPane;

public class primos {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Insira um número maior que 2");
        int num = Integer.parseInt(numero); 
        int contador=1;
        int proibido = 0;

        for(int i = 2; i < num; i++){
            proibido = 0;
            if(i%2 == 0) continue;
            for(int j = 2; j < i; j++){
                if(i%j == 0) {
                    proibido = 1;
                    break;
                }
            }
            if(proibido == 1) continue;
            contador++;
        }
        System.out.println("O número " + num + " tem " + contador + " números primos em si");
    }
}
