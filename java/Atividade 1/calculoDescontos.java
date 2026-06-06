/******************************************************************************
calculo de desconto
*******************************************************************************/
import javax.swing.JOptionPane;

public class calculoDescontos
{
	public static void main(String[] args) {
	    float prod, desc, valorDesconto;
	    String produto = JOptionPane.showInputDialog("Insira o valor de um produto: ");
	    String desconto = JOptionPane.showInputDialog("Insira o valor percentual do desconto: ");

        prod = Float.parseFloat(produto);
        desc = Float.parseFloat(desconto);
        
        valorDesconto = (prod*desc)/100;
        
        System.out.println("Desconto: " + valorDesconto);
        System.out.println("Valor final: " + (prod - valorDesconto));
	}
}
