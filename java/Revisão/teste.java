package Revisão;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um num de 1-5: ");
        int v = sc.nextInt(); String vogal = null;
        switch(v) {
            case 1: vogal = "a";
                break;
            case 2: vogal = "e";
            case 3: vogal = "i";
            case 4: vogal = "o";
                break;
            case 5: vogal = "u";
                break;
            default: vogal = "Não há mês correspondente";
                break;
        }
        System.out.println(vogal);
        sc.close();
    }
}
