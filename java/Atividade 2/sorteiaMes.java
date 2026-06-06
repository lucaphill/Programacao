/*
Sorteia um mês
*/
public class sorteiaMes {
    public static void main(String[] args){
        String[] meses = {"jan", "fev", "mar", "abril", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
        int aleatorio = (int)(Math.random()*12);
        
        System.out.println("Mês:" + meses[aleatorio]);

    }
}
