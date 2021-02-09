import javax.swing.JOptionPane;

public class EX5_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String numero=JOptionPane.showInputDialog("Di un numero");
		 int num=Integer.parseInt(numero);
		 String resultado=decimalBinario(num);
		 System.out.println(resultado);
		 
	}
public static String decimalBinario(int num) {
	String binario= Integer.toBinaryString(num);
	return binario;
}
}
