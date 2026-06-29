package revisão2;
import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // pegando o imput do usuário
        System.out.print("Digite seu peso(kg):");
        float peso = teclado.nextFloat();
        System.out.print("Digite sua altura(m):");
        float altura = teclado.nextFloat();
        teclado.close();

        float imc = (peso/(altura*altura));

        if(imc <= 0) System.out.println("Insira um valor valido");
        else if(imc < 18.5) System.out.println("Abaixo do peso");
        else if(imc < 24.5) System.out.println("Peso normal");
        else if(imc < 29.9) System.out.println("Sobrepeso");
        else System.out.println("Obesidade");
    }
}