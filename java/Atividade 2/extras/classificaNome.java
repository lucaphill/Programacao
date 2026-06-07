/*
Realiza operações de classificação com strings
*/
package extras;
import javax.swing.JOptionPane;

public class classificaNome {
    public static void main(String[]args){
        String nome;
        String[] nomes = new String[5];

        nome = JOptionPane.showInputDialog("Insira 5 nomes separados por espaços: ");
        nomes = nome.split(" ");

        VerificaLetra(nomes);
        String maior = TamanhoString(nomes);
        Capitalismo(maior);
    }


    public static void VerificaLetra(String[] arr){
        System.out.println("Nomes que começam com a:");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].startsWith("A") || arr[i].startsWith("a")){
                System.out.println(arr[i]);
            }
        }
    }


    public static String TamanhoString(String[] arr) {
        String maior = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > maior.length()){
                maior = arr[i];
            }
        }
        return maior;
    }


    public static void Capitalismo(String string) {
        String alto = string.toUpperCase();
        System.out.println("Maior nome em upperCase: " + alto);
    }
}
