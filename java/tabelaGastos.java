/******************************************************************************
tabela de gastos
*******************************************************************************/
public class tabelaGastos
{
	public static void main(String[] args) {
	    float m1 =15000.00f;
	    float m2 =23000.00f;
	    float m3 =17000.00f;
	    float total, media;
	    
	    total = m1 + m2 + m3;
	    media = total/3;
	    
	    System.out.println("total: R$ " + total);
		System.out.println("media: R$ " + media);
	}
}
