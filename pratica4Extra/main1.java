// Luca Borges 20250103587
package pratica4Extra;

public class main1 {
    public static void main(String[] args) {
        Empregado pessoa1 = new estagiario(10, "luca", 2000, 250);
        Empregado pessoa2 = new operador(20, "walter", 3000, 500);
        Empregado pessoa3 = new gerente(30, "nycolas", 5000, 700);

        /*
        Como calcula salario é uma função imbutida no toString(show info) então vou chamar só elas pra conferir os resultados.
        */
        System.out.println(pessoa1.toString());
        System.out.println();
        System.out.println(pessoa2.toString());
        System.out.println();
        System.out.println(pessoa3.toString());


    }
}
