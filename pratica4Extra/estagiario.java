// Luca Borges 20250103587
package pratica4Extra;

public class estagiario extends Empregado{
    private int alimentacao = 500;

    // construtor
    public estagiario(int id, String nome, double salario, double imposto){
        super(id, nome, salario, imposto);
    }

    @Override
    public double calculaSalarioLiquido(double salario, double imposto){
        double liquido;
        liquido = salario + alimentacao - imposto;
        return liquido;
    }
    public String toString(){
        String dados;
        dados = ("Estagiario\n" + "Id: " + id + " Nome: " + nome + " Salário: " + calculaSalarioLiquido(salario, imposto) + " Imposto: " + imposto);
        return dados;
    }
    
}
