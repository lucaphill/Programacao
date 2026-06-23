package Revisão;
import java.util.Scanner;

public class revisao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual operação quer fazer?\n1 - soma\n2 - subtração\n3 - multiplicação\n4 - divisão");
        int escolha = teclado.nextInt();

        System.out.println("Insira dois números decimais: ");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        teclado.close();
        if(escolha == 4 && num2 == 0) {
            System.out.println("Operação invalida"); 
            return;
        }

        // fazendo as operações
        switch (escolha) {
            case 1:
                System.out.println("A soma é: " + (num1 + num2));
                break;
            case 2:
                System.out.println("A subtração é: " + (num1 - num2));
                break;
            case 3:
                System.out.println("A multiplicação é: " + (num1 * num2));
                break;
            case 4:
                System.out.println("A soma é: " + (num1 / num2));
                break;
            default:
                System.out.println("Insira uma opção valida");
                break;
        } 
    }
}
