import javax.swing.JOptionPane;

public class EX4_App {
	public static void main(String[] args) {
		 String numero=JOptionPane.showInputDialog("Di un numero");
		 int num=Integer.parseInt(numero);
	     int resultado=factorial(num);
	     System.out.println(Integer.toString(resultado));
		
}
	public static int factorial(int num) {
		int iFac=0;
		for (int x=2;x<=num;x++) {
			  iFac = iFac * x;}
		return iFac;
		
		
	}
	}
