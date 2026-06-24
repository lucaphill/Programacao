package Revisão;
import java.util.Scanner;

public class verificanotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira sua nota: (0-10: use virgula pra decimais)");
        double nota = teclado.nextDouble();

        // fim do imput
        teclado.close();
        if(nota < 0 || nota > 10){
            System.out.println("Nota invalida");
            return;
        }
        int notaInt = (int)nota;

        switch (notaInt) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Você foi reprovada/o");
                break;
            case 5:
            case 6:
                System.out.println("Você está de recuperação");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Você está aprovada/o");   
                break; 
            default:
                System.out.println("Insira uma nota valida");
                break;
        }

        if(nota > 8.5 && nota != notaInt){
            System.out.println("Aprovada/o com merito");
        }
    }
}
