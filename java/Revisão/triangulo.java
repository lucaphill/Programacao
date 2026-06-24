package Revisão;
import java.util.Scanner;
public class triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira 3 valores sepadados por espaços para os lados do triangulo: (virgula para decimais)");
        
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();

        teclado.close();
        // é um triangulo?
        if(a < (b+c) && b < (a+c) && c < (a+b)){
            System.out.print("É um triangulo ");
            // verificações
            if( a == b && b == c) System.out.println("equilatero");
            else if( a == b || a == c || b == c) System.out.println("isóceles");
            else if(a != b && b != c) System.out.println("escaleno");
        }
    }
}
