/*
Luca Borges 20250103587
Programa: contagem regressiva de patos :)
*/
package prova_pratica;
import java.util.Scanner;

public class patos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite quantos patos você tem: ");
        int patos = teclado.nextInt();
        teclado.close();

        // mostra os patos
        for(int i = patos; i > 0; i--){
            if(patos == 1){ 
                System.out.println("1 patinho nadando na lagoa");
                break;
            }
            System.out.print(i);
            for(int j = i; j > 0; j--){
                System.out.print(" patinhos");
            }
            System.out.println(" nadando na lagoa");
        }   
    }
}
