package Revisão;
import java.util.Scanner;

public class separaPalavras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavra;
        String[] palavrasPequenas = new String[10];
        String[] palavrasGrandes = new String[10];
        
        for(int i=0; i < 10; i++){
            System.out.print("Insira uma palavra (" + (10-i) + ") restantes: ");
            palavra = teclado.nextLine();
            // separa as palavras em diferentes arrays
            if(palavra.length() > 7){
                palavrasGrandes[i] = palavra;
            } else if (palavra.length() <= 7 && palavra.length() > 0) {
                palavrasPequenas[i] = palavra;
            }
        }
        teclado.close();
        palavrasGrandes(palavrasGrandes);
        palavrasPequenas(palavrasPequenas);
    }

    public static void palavrasGrandes(String[] arr){
        int contador = 0;

        for(int i=0; i<10; i++){
            if(arr[i] != null){
                System.out.println("Palavra: " + arr[i] + " | Tamanho: " + arr[i].length());
                contador ++;
            }
        }
        System.out.println("Quantidade de palavras: " + contador + "\n");
    }

    public static void palavrasPequenas(String[] arr){
        int contador = 0;

        for(int i=0; i<10; i++){
            if(arr[i] != null){
                System.out.println("Palavra: " + arr[i] + " | Tamanho: " + arr[i].length());
                contador ++;
            }
        }
        System.out.println("Quantidade de palavras: " + contador + "\n");

    }
    
}
