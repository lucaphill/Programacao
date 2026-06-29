package revisão2;
import java.util.Scanner;

public class piramideAsterisco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Inrisa o n. de linhas da piramide: ");
        int linhas = teclado.nextInt();
        int max = linhas*2 -1;
        teclado.close();

        for(int i = 1; i <= linhas; i++){
            for(int j = 0; j < max; j++){
                if (j <= max/2 + (i-1) && j >= max/2 - (i-1)){
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
