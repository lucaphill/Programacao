package pratica5_2;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(0, "Luca", 10000);
        ContaPoupanca c2 = new ContaPoupanca(1, "Jeypi", 1);
        ContaSalario c3 = new ContaSalario(2, "Brilhante", 30000);

        c1.info();
        c1.depositar(100);
        c1.info();
        c1.sacar(100);
        c1.info();
        
        
        c2.info();
        c2.depositar(100);
        c2.info();
        c2.sacar(110);
        c2.info();
        c2.sacar(100);
        c2.info();

        c3.info();
        c3.depositar(100);
        c3.info();
        c3.sacar(1000);
        c3.info();
        c3.sacar(1000);
        c3.info();
    }
}
