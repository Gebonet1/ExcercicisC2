import javax.swing.JOptionPane;

public class EX7_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = JOptionPane.showInputDialog("Di un numero de euros para convertir");
		double num = Double.parseDouble(numero);
		libras(num);
		dolar(num);
		yenes(num);

	}

	public static void libras(double num) {
		double libra = 0.86;
		double resultado = libra * num;
		System.out.println("Són" + resultado + "libras");
	}

	public static void dolar(double num) {
		double dolar = 1.28611;
		double resultado = dolar * num;
		System.out.println("Són" + resultado + "$");
	}

	public static void yenes(double num) {
		double yenes = 129.852;
		double resultado = yenes * num;
		System.out.println("Són" + resultado + "yens");
	}

}
