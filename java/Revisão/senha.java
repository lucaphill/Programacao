package Revisão;
import javax.swing.JOptionPane;

public class senha {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Insira sua senha de acesso: ");
        // verifica a senha
        if(verificaSenha(senha)){
            JOptionPane.showMessageDialog(null, "Acesso permitido");
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negado");
        }
        
    }

    public static boolean verificaSenha(String senha){
        if(senha.equalsIgnoreCase("java123")){
            return true;
        } else {
            return false;
        }
    }
}
