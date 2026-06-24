package Revisão;
import java.text.DecimalFormat;

public class opecacoesMatriz {
    public static void main(String[] args) {
        int[][] B = {
                    { 2, -3, 5 },
                    { -1, 4, 0 },
                    { 7, 8, -6 },
                    { 9, -2, 1 }
                };
        // gera uma matriz aleatória
        int[][] A = geraMatriz(4,3);
        // operações basicas
        int[][] S = operacaoMatriz(A, B, '+');
        int[][] D = operacaoMatriz(A, B,'-' );
        int[][] M =  operacaoMatriz(A, B, '*');

        // mostrando as matrizes
        System.out.println("Matriz A (gerada): ");
        printaMatrix(A);
        System.out.println("===========");

        System.out.println("Matriz B (dada)");
        printaMatrix(B);
        System.out.println("===========");

        System.out.println("Matriz S (a+b)");
        printaMatrix(S);
        System.out.println("===========");

        System.out.println("Matriz D (a-b)");
        printaMatrix(D);
        System.out.println("===========");

        System.out.println("Matriz M (a*b)");
        printaMatrix(M);
        System.out.println("===========");
    }


    public static int[][] geraMatriz(int coluna, int linha){
        int[][] mat = new int[coluna][linha];
        for(int i=0; i<coluna; i++){
            for(int j=0; j<linha; j++){
                mat[i][j] = (int)((Math.random()*200)-100);
            }
        }
        return mat;
    }


    public static int[][] operacaoMatriz(int[][] a, int[][]b, char operacao) {
        int [][] s = new int[4][3];

        if (operacao == '+') {
            for(int i=0; i<4; i++){
                for(int j=0; j<3; j++){
                    s[i][j] = a[i][j] + b[i][j];
                }
            }
        } else if (operacao == '-'){
            for(int i=0; i< 4; i++){
                for(int j=0; j<3; j++){
                    s[i][j] = a[i][j] - b[i][j];
                }
            }
        } else if (operacao == '*'){
            for(int i=0; i<4; i++){
                for(int j=0; j<3; j++){
                    s[i][j] = a[i][j] * b[i][j];
                }
            }
        }
        return s;
    }


    public static void printaMatrix(int[][] matrix){
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("000");

        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                System.out.print(df.format(matrix[i][j]) + " ");
            }
            System.out.println();
        }
    }

}