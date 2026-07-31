/*
Luca Borges
20250103587
*/
package prova2;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Solido> solidos = new ArrayList<Solido>();

        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos solidos quer calcular? ");
        int q = teclado.nextInt();
        teclado.nextLine();
        // pegando as informações de cada solido
        for(int i = 0 ; i < q; i++){
            System.out.print("Qual tipo do solido? (cubo, esfera, cilindro) ");
            String tipo = teclado.nextLine();

            System.out.print("Insira um id para o solido: ");
            int id = teclado.nextInt();
            teclado.nextLine();

            System.out.print("Insira uma breve descrição do solido: ");
            String descricao = teclado.nextLine();

            // pegando informações extras dependendo do solido
            if(tipo.equalsIgnoreCase("cubo")){
                System.out.print("Inrira o tamanho do lado do seu cubo: ");
                double lado = teclado.nextDouble();
                teclado.nextLine();

                solidos.add(new Cubo(id, descricao, lado));
            } else if(tipo.equalsIgnoreCase("esfera")){
                System.out.print("Inrira o raio da sua esfera: ");
                double raio = teclado.nextDouble();
                teclado.nextLine();

                solidos.add(new Esfera(id, descricao, raio));
            } else if(tipo.equalsIgnoreCase("cilindro")){
                System.out.print("Inrira o raio do seu cilindro: ");
                double raio = teclado.nextDouble();
                teclado.nextLine();
                System.out.print("Insira a altura dele: ");
                double altura = teclado.nextDouble();
                teclado.nextLine();

                solidos.add(new Cilindro(id, descricao, raio, altura));
            } else System.out.println("solido invalido");
        }
        teclado.close();

        // mostra as informações de cada item de forma bonitinha
        System.out.println();
        for(Solido solido : solidos){
            System.out.println(solido.paraString());
        }
    }
}
