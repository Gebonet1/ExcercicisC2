import javax.swing.JOptionPane;

public class EX8_App {
	public static void main(String[] args) {
	int array[]= new int[10];	
	llenarArray(array);
	mostrarArray(array);
	
		
	}
public static void llenarArray(int array[] ) {
	for(int i=0;i<array.length;i++) {
		String texto=JOptionPane.showInputDialog("Introduce un número");
        array[i]=Integer.parseInt(texto);}
	}

public static void mostrarArray(int array[]) {
	 for(int i=0;i<array.length;i++){
         System.out.println("En el indice "+i+" esta el valor "+array[i]);
	
}
}

}