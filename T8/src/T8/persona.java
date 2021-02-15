package T8;
public class persona {
protected String edad;
protected String nombre;
protected String DNI;
protected final  char SEXO='M';
protected int peso;// en kg
protected int altura;// en cm

	public persona() {
		// TODO Auto-generated constructor stub
		this.edad="";
		this.nombre="";
		this.DNI="";
		this.peso=0;
		this.altura=0;
		
	}
	public persona(String edad, String nombre, String dNI, int peso, int altura) {
		this.edad = edad;
		this.nombre = nombre;
		DNI = dNI;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	public persona (String nombre,String edad, char sexo) {
	this.nombre=nombre;
	this.edad=edad;
	sexo='M';
	this.nombre="";
	this.DNI="";
	this.peso = 0;
	this.altura = 0;
	
	
	}
	

}
