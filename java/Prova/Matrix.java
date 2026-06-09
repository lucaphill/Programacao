package Prova;
/*
Luca Borges 20250103587
Thiago Sales 20250103602
Operações com matrizes
*/
import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero entre 2 e 5: ");
        int num = sc.nextInt();

        int[][] matriz = matriz(num);
        System.out.println("Matriz:");
        printaMatriz(matriz);
        System.out.println();

        sc.close();

        System.out.println("Matriz transposta: ");
        int [][] transposta = transpoeMatriz(matriz);
        printaMatriz(transposta);
        System.out.println();

        System.out.println("Produto da diagonal principal: ");
        int diagonal1 = produtoDiagonalPrincipal(matriz);
        System.out.println(diagonal1);
        System.out.println();

        System.out.println("Produto da diagonal secundaria");
        int diagonal2 = produtoDiagonalSecundaria(matriz);
        System.out.println(diagonal2);
        System.out.println();

        if(num == 2){
            determinante2x2(matriz);
        }
        else if(num == 3){
            determinante3x3(matriz);
        }
    }


    public static int[][] matriz (int n){
        int[][] rand_matriz = new int[n][n];
        Random random = new Random();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                rand_matriz[i][j] = random.nextInt(-10, 11);
            }
        }
        return rand_matriz;
    }


    public static void printaMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int[][] transpoeMatriz(int[][] matriz){
        // definindo o tamanho da matriz
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        // definindo a matriz e preechendo ela
        int[][] transposta = new int[colunas][linhas];
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }


    public static int produtoDiagonalPrincipal(int[][] matriz){
        int diagonal = 1;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == j){
                    diagonal *= matriz[i][j];
                }
            }
        }
        return diagonal;
    }


    public static int produtoDiagonalSecundaria(int[][] matriz){
        int diagonal = 1;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i + j == matriz.length -1){
                    diagonal *= matriz[i][j];
                }
            }
        }
        return diagonal;
    } 


    public static void determinante2x2(int[][] m){
        int det = (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
        System.out.println("Determinante: "+det);
    }


    public static void determinante3x3(int[][] m){
        int a = m[0][0], b = m[0][1], c = m[0][2];
        int d = m[1][0], e = m[1][1], f = m[1][2];
        int g = m[2][0], h = m[2][1], i = m[2][2];

        int det = (a*e*i + b*f*g + d*h*c) - (c*e*g + f*h*a + i*b*d);

        System.out.println("Determinante: "+det);
    }
}

