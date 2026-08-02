package praticas.pratica4;

public class Empresa {
    private Empregado[] empregados;
    private int totalEmpregados;

    // construtores
    public Empresa(){
        empregados = new Empregado[100];
    }

    // funções
    public void cadastrarEmpregado(int id, String nome, double salario){
        if(totalEmpregados >= 100){
            System.out.println("Máximo de empregados atingido");
            return;
        }

        for(int i = 0; i < 100; i++){
            if(empregados[i] == null){
                empregados[i] = new Empregado(id, nome, salario);
                totalEmpregados++;
                break;
            }
        }
    }

    public void aplicarAumento(int id, double percentual){
        for (Empregado empregado : empregados){
            if(empregado != null && empregado.getId() == id){
                empregado.aumentarSalario(percentual);
            }
        }
    }

    public boolean demitirEmpregado(int id){
        for(int i = 0; i < empregados.length; i++){
            if(empregados[i] != null && empregados[i].getId() == id){
                empregados[i] = null;
                totalEmpregados--;
                return true;
            }
        }
        return false;
    }

    public void listaEmpregados(){
        boolean temp = true;
        for (Empregado empregado : empregados){
            if(empregado != null){
                System.out.println(empregado.toString());
                temp = false;
            }
        }
        if(temp){
                System.out.println("Não ha pessoas empregadas");
            }
    }
}
