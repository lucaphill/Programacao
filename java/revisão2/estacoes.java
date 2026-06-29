package revisão2;
import java.util.Scanner;

public class estacoes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um número entre 1 e 12 correspondente ao mês");
        int mes = teclado.nextInt();
        teclado.close();

        switch (mes) {
            case 1:
            case 2:
            case 3:
                System.out.println("Você está no verão");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Você está no outono");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Você está no inverno");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Você está na primavera");
                break;
            default:
                System.out.println("Mês invalido");
                break;
        }
    }
}
