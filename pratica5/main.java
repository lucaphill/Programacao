package pratica5;
import java.util.*;

public class main {
    public static void main(String[] args) {
        ArrayList <publicacao> publicacoes = new ArrayList<publicacao>();

        for (int i = 0; i < 30; i++){
            int temp = random();
            switch (temp) {
                case 0:
                    publicacoes.add(new livro("Kalciferum","Nycolas", 1666));
                    break;
                case 1:
                    publicacoes.add(new revista("Recreio", "Thiago", 2024));
                    break;
                case 2:
                    publicacoes.add(new artigo("A vantagem dos jogos", "Luca", 2000));
                    break;
                default:
                    System.out.println("Algum erro aconteceu na randomização de itens");
                    break;
            }
        }
        for (publicacao p : publicacoes){
            System.out.println(p.obterTipo() +": "+ p.getTitulo()+" "+ p.getAutor()+" "+p.getAnoPublicacao());
        }
    }


    public static int random(){
        return (int) (Math.random()*3);
    }
    
}
