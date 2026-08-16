package prova2;
import java.util.*;

public class SolidosControle {
    Map<Integer, Solido> solidosById = new HashMap<>();

    public void adicionar(Solido solido){
        solidosById.put(solido.getId(), solido);
    }
    public Solido buscaPorId(int id){
        return solidosById.get(id);
    }
    public void mostrarSolidos(){
        for(Solido solido : solidosById.values()){
            System.out.println(solido.paraString());
        }
    }

    public void cadastrarSolido(Scanner teclado){
        System.out.print("Quantos solidos quer calcular? ");
        int q = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < q; i++) {
            System.out.print("Qual tipo do solido? (cubo, esfera, cilindro) ");
            String tipo = teclado.nextLine();

            System.out.print("Insira um id para o solido: ");
            int id = teclado.nextInt();
            teclado.nextLine();

            System.out.print("Insira uma breve descrição do solido: ");
            String descricao = teclado.nextLine();

            if (tipo.equalsIgnoreCase("cubo")) {
                System.out.print("Insira o tamanho do lado do seu cubo: ");
                double lado = teclado.nextDouble();
                teclado.nextLine();
                adicionar(new Cubo(id, descricao, lado));
            } else if (tipo.equalsIgnoreCase("esfera")) {
                System.out.print("Insira o raio da sua esfera: ");
                double raio = teclado.nextDouble();
                teclado.nextLine();
                adicionar(new Esfera(id, descricao, raio));
            } else if (tipo.equalsIgnoreCase("cilindro")) {
                System.out.print("Insira o raio do seu cilindro: ");
                double raio = teclado.nextDouble();
                teclado.nextLine();
                System.out.print("Insira a altura dele: ");
                double altura = teclado.nextDouble();
                teclado.nextLine();
                adicionar(new Cilindro(id, descricao, raio, altura));
            } else {
                System.out.println("solido invalido");
            }
        }
    }
}
