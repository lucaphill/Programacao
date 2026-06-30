/*
Luca Borges 20250103587
Programa: classifica temperaturas
*/
package prova_pratica;
import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] temp = new int[10];
        System.out.println("Digite 10 temperaturas inteiras (°C) separadas por espaços: ");
        for(int i = 0; i < 10; i++){
            temp[i] = teclado.nextInt();
        }
        teclado.close();

        // separando os arrays
        int[] altas = new int[10];
        int[] baixas = new int[10];
        int a = 0, b = 0;

        for(int t : temp){
            if(t >= 20){
                altas[a] = t;
                a++;
            } else {
                baixas[b] = t;
                b++;
            }
        }

        for(int i = b; i < 10; i++){
            baixas[i] = 100;
        }
        diasQuentes(altas);
        diasFrios(baixas);
    }

    public static void diasQuentes(int[] arr){
        for(int n : arr){
            if(n <= 20) continue;
            else if(n <= 25) System.out.println("Está "+ n + "°C, uma temperatura amena");
            else if(n <= 35) System.out.println("Está "+ n + "°C, uma temperatura quente");
            else if(n >= 36) System.out.println("Está "+ n + "°C, uma temperatura muito quente");
        }
    }

    public static void diasFrios(int[] arr){
        int contador = 0;
        int menor = 100;

        for(int n : arr){
            if(n == 100) break;
            contador++;
            if(n < menor) menor = n;
        }

        System.out.println("Tiveram: " + contador + " dias frios nesse período\nNo dia mais frio fez " + menor + "°C");
    }
}
