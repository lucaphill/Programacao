package Revisão;
import java.util.Scanner;

public class mataPalavras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] palavras = new String[6];
        String[] palavrasGrandes = new String[6];

        // pega as palavras
        for(int i = 0; i < 6; i++){
            System.out.println("Digite uma palavra: (" + (6-i) + ") restantes:");
            palavras[i] = teclado.nextLine();

            // verifica e armazena em outro array quando as palavras forem > 4
            if(palavras[i].length() >= 5){
                palavrasGrandes[i] = palavras[i];
            }
        }
        teclado.close();
        // printa as palavras grandes
        System.out.println("Palavras com mais de 5 letras: ");
        for (int j = 0; j < 6; j++){
            if(palavrasGrandes[j] != null){
                System.out.println(palavrasGrandes[j]);
            }
        }
    }
}
