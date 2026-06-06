/*
Calcula um desconto de produtos
*/
import java.util.Scanner;

public class reajuste {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float valor;
        float novoValor;

        while (true){
            System.out.println("Insira um valor para calcula o acrescimo: ");
            
            valor = teclado.nextFloat();
            if(valor == 0) break;

            // calcula o desconto
            novoValor = valor + (0.12f * valor);

            System.out.println("O novo valor é: " + Math.round(novoValor));
        }
        teclado.close();
    }
}
