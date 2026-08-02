// Luca Borges 20250103587
package praticas.pratica4Extra;

public class gerente extends Empregado{
    private int bonus = 3000;

    //construtor
    public gerente(int id, String nome, double salario, double imposto){
        super(id, nome, salario, imposto);
    }

    @Override
    public double calculaSalarioLiquido(double salario, double imposto){
        double liquido;
        liquido = salario + bonus - imposto;
        return liquido;
    }
    public String toString(){
        String dados;
        dados = ("Gerente\n" + "Id: " + id + " Nome: " + nome + " Salário: " + calculaSalarioLiquido(salario, imposto) + " Imposto: " + imposto);
        return dados;
    }
    
}
