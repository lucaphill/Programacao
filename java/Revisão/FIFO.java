package Revisão;
import java.util.Scanner;

public class FIFO {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] palavras = new String[5];
        int contador=0;

        while (true) {
            System.out.print("Digite uma palavra (ou 'sair' para encerrar):");
            String palavra = teclado.nextLine();
            if(palavra.equalsIgnoreCase("sair")) break;
            contador++;

            // histórico
            palavras = fifo(palavras, palavra);
            System.out.println("Histórico");
            for(int i=0; i<5; i++){
                if(contador > 5 && palavras[i] != null) {
                    System.out.println("Mensagem " + (i+1 + (contador - 5)) + ": " + palavras[i]);
                } else if (palavras[i] != null){
                    System.out.println("Mensagem " + (i+1) + ": " + palavras[i]);
                }
            }
        }
        teclado.close();
    }

    public static String[] fifo(String[] arr, String palavra){
        if(arr[4] != null){
            for(int i=1; i<5; i++){
                arr[i-1] = arr [i];
            }
            arr[4] = palavra;
        } else {
            for(int i=0; i<5; i++){
                if(arr[i] == null) {
                    arr[i] = palavra;
                    break;
                }
            }
        }
        return arr;
    }
}
