package Revisão;
import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero=0;
        int par=0;
        int impar=0;
        
        for(int i = 0; i < 10; i++){
            System.out.println("Insira um número: ");
            numero = teclado.nextInt();

            if(numero%2 == 0){
                par++;
            } else {
                impar++;
            }
        }
        teclado.close();
        System.out.println("O total de números foi:\npar: " + par + "\nimpar: " + impar);
    }
}
