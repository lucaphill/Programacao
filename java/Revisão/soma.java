package Revisão;
import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero = 0;
        double soma=0;

        while (numero > -1) {
            System.out.println("Digite um número: (negativo para sair)");
            numero = teclado.nextDouble();
            if(numero < 0) break;
            soma += numero;
        }
        teclado.close();
        System.out.println("O total foi: "+ soma);
    }
}
