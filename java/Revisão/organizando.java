package Revisão;
import java.util.Scanner;

public class organizando {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de elementos (Máx. 50): ");
        int casas = teclado.nextInt();
        teclado.close();
        // verifica se o número é valido
        if(casas > 50 || casas < 0){
            System.out.println("Número invalido");
            return;
        }
        // cria o array
        int[] array = new int[casas];
        // coloca valores aleatórios entre 1 e 100 no array
        array = radomizaArray(array);
        // mostra o array antes do bubble sort
        System.out.print("Array desorganizado: ");
        printaArray(array);
        // organiza o array e printa ele organizado
        array = bubbleSort(array);
        System.out.print("Array organizado: ");
        printaArray(array);

    }

    public static int[] radomizaArray(int[] numeros){
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int)(Math.random()*100);
        }
        return numeros;
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

    public static int[] bubbleSort(int[] arr){
        int temporario;
        boolean mudou;

        while(true){
            mudou = false;
            for(int i = 1; i < arr.length; i++) {
                if(arr[i] < arr[i-1]){
                    temporario = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temporario;
                    mudou = true;
                }
            }
            if(mudou == false) break;
        }
        return arr;
    }
}
