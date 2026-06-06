/******************************************************************************
tabela de vitórias
*******************************************************************************/
import java.io.*;
import java.util.Scanner;

public class tabelaDeVitorias
{
	public static void main(String[] args) {
	    int brasil, lanterna, parcial, total;
	    Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("Insira quantos pontos o Brasil fez: ");
	    brasil = teclado.nextInt();
	    System.out.println("Insira quantos pontos o lanterna fez: ");
	    lanterna = teclado.nextInt();
	    
	    parcial = brasil - lanterna;
	    
	    if(parcial < 0) {
	        parcial *= -1;
	    }
	    total = parcial/3;
	    
	    System.out.println("Vitórias: " + total);
	}
}
