import javax.swing.JOptionPane;

public class EX_3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String numero=JOptionPane.showInputDialog("El primer lado del cuadraro");
		 int numero1=Integer.parseInt(numero);
		 esPrimo(numero1);
	}
	public static boolean esPrimo(int numero){
		  int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}
}
