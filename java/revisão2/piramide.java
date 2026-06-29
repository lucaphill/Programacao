package revisão2;
import java.util.Scanner;

public class piramide {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira um número pra base da piramide:");
        int piramide = teclado.nextInt();
        teclado.close();

        for(int i = 1; i <= piramide; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
