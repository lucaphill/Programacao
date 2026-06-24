package Revisão;
import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o número de elementos (máx. 50): ");
        int quantidade = teclado.nextInt();
        teclado.close();

        int[] array = new int[quantidade];

        array = randomiza(array);
        System.out.println("Array desordenado: ");
        printaArray(array);
        // agora aplicamos o selection sort
    
    }
    
    public static int[] randomiza(int[] arr){
        for(int i=0; i< arr.length; i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }

    public static void printaArray(int[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1) {
                System.out.println(arr[i] + "]");
                break;
            }
            System.out.print(arr[i] + ", ");
        }
    }

    public static int[] selectSort(int[] arr){
        for(int i=0; i< arr.length -1; i++){
            int temporario =  arr[i];
            for(int j=0; j< arr.length; j++){
                
            }

        }

        return arr;
    }
}
