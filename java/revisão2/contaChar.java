package revisão2;
import java.util.Scanner;

public class contaChar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira uma palavra: ");
        String palavra = teclado.nextLine();
        teclado.close();

        contaPalavra(palavra);
    }

    public static void contaPalavra(String s){
        s.toLowerCase().trim();
        char[] frase = s.toCharArray();
        int[] palavras = new int[256];

        for(char caractere : frase){
            palavras[caractere]++;
        }
        for(int i = 0; i < palavras.length; i++){
            if(palavras[i] > 0) System.out.println((char) i + ": " + palavras[i]);
        }
    }
}
