/*
Verifica se uma palavra tem 10 caracteres
*/
import java.util.Scanner;

public class VerificaCaractere {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavra;
        char[] letras = new char[25];
        int contador = 0;
        char teste;

        while (true){
            System.out.println("Digite uma palavra: ");
            palavra = teclado.nextLine();
            contador = palavra.length();

            System.out.println("A palavra: " + palavra + " possui " + contador + " caracteres");
            if(contador > 10){
                System.out.println("> A palavra possui mais de 10 caracteres!");
            }
            System.out.println("Quer colocar outra palavra? (-/n) ");
            teste = teclado.nextLine().charAt(0);

            if(teste == 'n') break;
            contador = 0;
        }
        teclado.close();
    }
}
