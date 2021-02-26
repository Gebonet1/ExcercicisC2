import javax.swing.JOptionPane;

public class Prova {

	public static void main(String[] args) {
		pedirNotasMedia();
	}
	



public static double pedirNotasMedia() {
	int lista[] = new int[5];
	
	double media=0;
	for (int i = 0; i < 4; i++) {
		String numero = JOptionPane.showInputDialog("Introduce la nota " + i + ":");
		lista[i] = Integer.parseInt(numero);
		media = media + lista[i];
	}
	;
	return media;
}}