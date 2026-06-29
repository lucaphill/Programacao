package revisão2;
import java.util.Scanner;

public class fivonachi {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um número pequeno:");
        int valor = teclado.nextInt();
        int[] sequencia = fibonacci(valor);
        teclado.close();

        for (int numero : sequencia){
            System.out.print(numero + " ");
        }
        System.out.println("");
    }

    public static int[] fibonacci(int num){
        int[] arr = new int[num];

        if(num >= 1) arr[0] = 0;
        if(num >= 2) arr[1] = 1;
        for(int i = 2; i < num; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr;
    }
}
