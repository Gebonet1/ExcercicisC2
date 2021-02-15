package T8;
import java.util.Random;

class password {
	public int longitud = 8;
	public String contrasenya;

	public password() {
		// TODO Auto-generated constructor stub
		this.longitud = 8;
	    this.contrasenya = "";
        generarContrasenya(longitud,contrasenya);
        
        
		}
	
	public String generarContrasenya(int longitud, String contrasenya) {
		this.longitud = longitud;
		this.contrasenya = contrasenya;
		int num=0;
		String num1="";
		do {
		Random rnd = new Random();
	     num = (int) (rnd.nextDouble() * 100000000 + 999999999);
	     num1=String.valueOf(num);
		}while(num1.length()!=longitud);
		 num1=contrasenya;
        
		return contrasenya;
		

	}
	
}
