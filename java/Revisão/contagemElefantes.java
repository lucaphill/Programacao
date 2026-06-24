package Revisão;
import java.util.Scanner;

public class contagemElefantes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número de elefates: ");
        int elefantes = teclado.nextInt();

        teclado.close();
        for(int i = elefantes; i > 0; i--){
            if(i == 1){
                System.out.println(i + " elefante imcomoda");
                break;
            }
            System.out.print(i);
            for(int j = 0; j < i; j++){
                System.out.print(" elefantes");
            }
            System.out.println(" incomodam");
        }
    }
}
