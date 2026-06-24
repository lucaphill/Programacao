package Revisão;
import java.util.Scanner;

public class novaTabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();

        teclado.close();
        for(int i = 1; i < 11; i++){
            if(i*numero%2 != 0)
            System.out.println(i + " * " + numero + " = " + (i*numero));
        }
    }
}
