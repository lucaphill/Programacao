/*
gera os numeros de um dado
*/
public class dados{
    public static void main(String[] args){
        int[] valoresDado = new int[4];
        int soma = 0;
        for(int i = 0; i < 3; i++){
            valoresDado[i] = (int)(Math.random()*6)+1;
            soma += valoresDado[i];
        }
        System.err.println("Números sorteados:");
        for(int i = 0; i < 3; i++){
            System.err.println(valoresDado[i]);
        }
        System.err.println("Total = " + soma);

    }
}