/*
Luca Borges
20250103587
*/
package prova2;
import java.util.*;

public class PrincipalV {
    public static void main(String[] args) {
        SolidosControle controle = new SolidosControle();
        Scanner teclado = new Scanner(System.in);
        // pegando as informações de cada solido
        controle.cadastrarSolido(teclado);


        // mostra as informações de cada item de forma bonitinha
        controle.mostrarSolidos();

        // demostração busca por id
        int t = 0;
        do{
            System.out.println("Digite um id pra procurar (-1 pra sair): ");
            t = teclado.nextInt();
            if(t == -1) break;
            System.out.println(controle.buscaPorId(t).paraString());
        }
        while (t != -1);
        teclado.close();
    }
}
/* RESPOSTA SOBRE A VANTAGEM SOBRE UM ARRAYLIST
    diferente do arrayList, o hash map usa hashing para classificar os dados, isso deixa ele muito eficiente pra fazer buscas por id, incersões e remoções em um tempo médio de O(1).
    => O(1) Em media leva um tempo constante para pegar o valor, mas pode ir piorando se cair muitos pontos no mesmo lugar

    Isso é ainda mais rápido que se usar um ArrayList que o tempo médio é O(n) pq a posição é diferente do id
    => O(n) função linear em relação a n
    
    Pelo que eu entendi pra ele fazer isso ele passa os dados por uma função de hash que te da o valor de onde o arquivo deve ser guardado / acessado.
    Passando algo na função ela te devolve o hash code (que é o valor que acabei de falar)

    Então basicamente a maior vantagem e a velocidade e escalabilidade em comparação com o arrayList
*/