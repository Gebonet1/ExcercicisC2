import javax.swing.JOptionPane;

public class EX_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String texto=JOptionPane.showInputDialog("Introduce un tamaño del array");
	        int num[]=new int[Integer.parseInt(texto)];
	        
	        
	        
	        
	
	 rellenarNumAleatorioArray(num, 0, 9);
	 
     mostrarArray(num);
 }

 public static void rellenarNumAleatorioArray(int array[], int a, int b){
     for(int i=0;i<array.length;i++){
         array[i]=((int)Math.floor(Math.random()*(a-b)+b));
     }
 }

 public static void mostrarArray(int array[]){
     for(int i=0;i<array.length;i++){
         System.out.println("En el indice "+i+" esta el valor "+array[i]);
     }
 }
}
	
	


