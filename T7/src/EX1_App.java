import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JOptionPane;

//author: Gerard Bonet Bustos.
public class EX1_App {
	final static int TOTAL_ALUMNOS = 2;
    private static int media;
    public static Hashtable<String, Integer> diccionario = new Hashtable<String, Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < TOTAL_ALUMNOS; i++) {
	
			NotasMedia();
		}
		/*Enumeration<Integer> e =diccionario.elements();
		while(e.hasMoreElements())
			  System.out.println(e.nextElement());*/
		
		}

	public static void NotasMedia() {
		int lista[] = new int[5];
		String nombre = "";
		nombre = JOptionPane.showInputDialog("Introduce el Nombre: ");
	    for (int i = 0; i < 4; i++) {
			String numero = JOptionPane.showInputDialog("Introduce la nota " + i + ":");
			lista[i] = Integer.parseInt(numero);
			media = media + lista[i];
		}
          media=media/4;
          diccionario.put(nombre,media);
		
	}
		
			
     }
		 



