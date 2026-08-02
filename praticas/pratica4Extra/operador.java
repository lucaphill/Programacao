// Luca Borges 20250103587
package praticas.pratica4Extra;

public class operador extends Empregado{
    private int alimentacao = 500;
    private int transporte = 500;

    // construtor
    public operador(int id, String nome, double salario, double imposto){
        super(id, nome, salario, imposto);
    }

    @Override
    public double calculaSalarioLiquido(double salario, double imposto){
        double liquido;
        liquido = salario + (alimentacao + transporte) - imposto;
        return liquido;
    }
    public String toString(){
        String dados;
        dados = ("Operador\n" + "Id: " + id + " Nome: " + nome + " Salário: " + calculaSalarioLiquido(salario, imposto) + " Imposto: " + imposto);
        return dados;
    }
    
}
