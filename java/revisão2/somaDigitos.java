package revisão2;
import java.util.Scanner;

public class somaDigitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira um número: ");
        String num = teclado.nextLine();
        teclado.close();
        int soma = 0;

        for(int i = 0; i < num.length(); i++){
            int num2 = Character.getNumericValue(num.charAt(i));
            soma += num2;
        }
        System.out.println(soma);
    }
}
