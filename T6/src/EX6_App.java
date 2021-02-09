import javax.swing.JOptionPane;

public class EX6_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String numero=JOptionPane.showInputDialog("Di un numero");
		 int num=Integer.parseInt(numero);
		 contar(num);
	}
 public static void contar(int num) {
	 String x = Integer.toString(num);
	 System.out.println("El entero tiene"+x.length());
	 
 }
}
