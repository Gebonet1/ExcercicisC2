import javax.swing.JOptionPane;

public class EX11_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String texto=JOptionPane.showInputDialog("Introduce un tamaño");
    int tamanio=Integer.parseInt(texto);


    int array1[]=new int [tamanio];
    int array2[];

    rellenarNumAleatorioArray(array1, 10, 100);

    array2=array1;

    array1=new int[tamanio];

    rellenarNumAleatorioArray(array1, 10, 100);

    int array3[]=multiplicador(array1, array2);


    System.out.println("Array1");
    mostrarArray(array1);

    System.out.println("Array2");
    mostrarArray(array2);

    System.out.println("Array3");
    mostrarArray(array3);

}

	    public static void rellenarNumAleatorioArray(int array[], int x, int y){
	        for(int i=0;i<array.length;i++){
	            array[i]=((int)Math.floor(Math.random()*(x-y)+y));
	        }
	    }
	 
	    public static void mostrarArray(int array[]){
	        for(int i=0;i<array.length;i++){
	            System.out.println("En el indice "+i+" esta el valor "+array[i]);
	        }
	    }
	 
	    public static int[] multiplicador(int array1[], int array2[]){
	        int array3[]=new int[array1.length];
	        for(int i=0;i<array1.length;i++){
	            array3[i]=array1[i]*array2[i];
	        }
	        return array3;
	    }
	}
	