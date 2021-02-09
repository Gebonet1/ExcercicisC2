import javax.swing.JOptionPane;

public class EX_10 {

	    public static void main(String[] args) {
	   
	        String texto=JOptionPane.showInputDialog("Introduce un tamaño de array");
	        int num[]=new int[Integer.parseInt(texto)];
	   
	        rellenarNumPrAleatorioArray(num, 1, 100);
	   
	        mostrarArray(num);
	         
	        int resultado=mayor(num);
	        System.out.println("El primo más grande es el "+resultado);
	    }
	   
	    public static void rellenarNumPrAleatorioArray(int array[], int x, int y){
	   
	        int i=0;
	  
	        while(i<array.length){           
	            int num=((int)Math.floor(Math.random()*(x-y)+y));           
	            if (esPrimo(num)){              
	                array[i]=num;               
	                i++;            
	            }       
	        }   
	    }   
	    private static boolean esPrimo (int num){       
	          
	        if (num<=1){
	            return false;
	        }else{
	  
	            int prueba;         
	            int contador=0;
	            prueba=(int)Math.sqrt(num);
	            for (;prueba>1;prueba--){
	                if (num%prueba==0){
	                    contador+=1;
	                }
	            }
	            return contador < 1;
	        }
	    }
	   
	    public static void mostrarArray(int array[]){
	        for(int i=0;i<array.length;i++){
	            System.out.println("En el indice "+i+" esta el valor "+array[i]);
	        }
	    }
	     
	    public static int mayor(int array[]){
	        int mayor=0;
	        for(int i=0;i<array.length;i++){
	            if(array[i]>mayor){
	                mayor=array[i];
	            }
	        }
	         
	        return mayor;
	    }
	     
	}

}
