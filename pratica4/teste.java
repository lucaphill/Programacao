package pratica4;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Empresa empresa = new Empresa();

        while (true) {
            System.out.println("O que você quer fazer?\n0 para cadastrar empregado\n1 para demitir alguém\n2 para dar um aumento\n3 para listar os empregados\n4 para sair");
            int num = teclado.nextInt();
            if(num == 4) break;
            else if (num == 0){
                System.out.print("Id: ");
                int id = teclado.nextInt();
                teclado.nextLine();
                System.out.print("Nome: ");
                String nome = teclado.nextLine();
                System.out.print("Salario Bruto(R$): ");
                double sal = teclado.nextDouble();
                empresa.cadastrarEmpregado(id, nome, sal);

            } else if(num == 1){
                System.out.print("Id: ");
                int id = teclado.nextInt();
                empresa.demitirEmpregado(id);

            } else if(num == 2){
                System.out.print("Id: ");
                int id = teclado.nextInt();
                System.out.print("Porcentagem de aumento: ");
                double aumento = teclado.nextDouble();
                empresa.aplicarAumento(id, aumento);

            } else if(num == 3){
                empresa.listaEmpregados();
            }            
        }
        teclado.close();
    }
}
