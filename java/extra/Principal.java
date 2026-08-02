package extra;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Scanner teclado = new Scanner(System.in);
        System.out.print("Quandos usuarios quer cadastrar? ");
        int quantidade = teclado.nextInt();
        teclado.nextLine(); // para tirar o lixo do buffer
        
        for (int i = 0; i < quantidade; i++){
            System.out.print("Insira o tipo do "+(i+1)+"° passageiro (c pra comum, e pra estudante e i pra idoso)? ");
            String tipo = teclado.nextLine();

            System.out.print("Insira o nome do passageiro? ");
            String nome = teclado.nextLine();
            
            System.out.print("Insira id do passageiro? ");
            int id = teclado.nextInt();
            teclado.nextLine();

            // define qual cliente adicionar
            if(tipo.equalsIgnoreCase("c")){
                clientes.add(new Comum(nome, id));
            } else if(tipo.equalsIgnoreCase("e")){
                System.out.print("Insira o n° do estudante:");
                int n = teclado.nextInt();
                teclado.nextLine();

                clientes.add(new Estudante(nome, id, n));
            } else if (tipo.equalsIgnoreCase("i")){
                System.out.print("Insira a idade do idoso: ");
                int idade = teclado.nextInt();
                teclado.nextLine();

                clientes.add(new Idoso(nome, id, idade));
            }
        }
        teclado.close();

        for(Cliente cliente : clientes){
            System.out.println(cliente.toString());
        }
    }
}
