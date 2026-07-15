package pratica4;
import java.util.Scanner;

public class mainP1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Empregado emp1 = new Empregado();

        System.out.print("Nome: ");
        emp1.setNome(teclado.nextLine());
        System.out.print("Salario Bruto(R$): ");
        emp1.setSalario(teclado.nextDouble());
        System.out.print("Imposto: ");
        emp1.setImposto(teclado.nextDouble());
        teclado.close();
        
        System.out.println(emp1.toString());
        emp1.aumentarSalario(10);

        System.out.println(emp1.toString());
    }
    
}
