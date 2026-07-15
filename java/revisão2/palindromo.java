package revisão2;
import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira uma palavra pra ver se é palindromo: ");
        String palavra = teclado.nextLine();

        teclado.close();
        boolean v = ehpalidromo(palavra);

        if(v) System.out.println("Palindromo");
        else System.out.println("Não é palindromo");
    }

    public static boolean ehpalidromo(String s){
        System.out.println(s);
        s = s.trim();

        String s2 = "";
        int tamanho = s.length() -1;

        for(int i = 0; i <= tamanho; i++){
            String temporario = String.valueOf(s.charAt(tamanho - i));

            s2 = s2.concat(temporario);            
        }/*
        Uma forma muito mais fácil de fazer a mesma coisa...
        
        String inverso = new StringBuilder(s).reverse().toString();
        */


        System.out.println(s2);
        boolean resultado = s.equalsIgnoreCase(s2);

        return resultado;
    }
}
