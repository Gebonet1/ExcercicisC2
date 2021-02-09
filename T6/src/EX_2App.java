import java.util.Random;

import javax.swing.JOptionPane;

public class EX_2App {

	public static void main(String[] args) {
		generarNumero();
	}
	public static void generarNumero() {
		 String r=JOptionPane.showInputDialog("Introduce el primer numero");
		 int r1=Integer.parseInt(r);
		 String d=JOptionPane.showInputDialog("Introduce el segundo numero");
		 int d1=Integer.parseInt(d);
		 Random ran = new Random(); 
		 int nxt = r1+ran.nextInt(d1);
		 JOptionPane.showMessageDialog(null,"El resultado és " +nxt);
		
	}
}
