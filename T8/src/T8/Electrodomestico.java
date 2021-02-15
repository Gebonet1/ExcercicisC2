package T8;


public class Electrodomestico {

	final static int DPRECIO = 100;
	final static String DCOLOR = "blanco";
	final static char  CONSUMO_E='F';
	final static int DPESO = 5;
	
	protected static double precioBase;
	protected static String color;
	protected static int peso;
	protected static char consumoEnergetico;
	
	public Electrodomestico() {
		super();
		Electrodomestico.color=DCOLOR;
		Electrodomestico.consumoEnergetico = CONSUMO_E;
		
	}
	
	public static double getPrecioBase() {
		return precioBase;
	}

	public static void setPrecioBase(double precioBase) {
		Electrodomestico.precioBase = precioBase;
	}

	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		Electrodomestico.color = color;
	}

	public static int getPeso() {
		return peso;
	}

	public static void setPeso(int peso) {
		Electrodomestico.peso = peso;
	}

	public static char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public static void setConsumoEnergetico(char consumoEnergetico) {
		Electrodomestico.consumoEnergetico = consumoEnergetico;
	}

	public Electrodomestico(double precioBase,int peso) {
		this.precioBase=precioBase;
		this.peso=peso;
		this.color=DCOLOR;
		this.consumoEnergetico=CONSUMO_E;
		
		
	}
	private String comprobarColor(String color) {
		// Comprueba si el color es válido, en caso contrario devuelve el valor por defecto.
		if(!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")) color= DCOLOR; 
        return color;
	}

	private char comprobarConsumoEnergetico(char consumoEnergetico) {
		// Comprueba si el carácter de la clase es válido, en caso contrario devuelve el valor por defecto.
		if(consumoEnergetico != 'A' && consumoEnergetico != 'B' && consumoEnergetico != 'C' && consumoEnergetico != 'D' && consumoEnergetico != 'E' && consumoEnergetico != 'F' ) consumoEnergetico = CONSUMO_E;
		return consumoEnergetico;
	}
	
	
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico=comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
		
	}
	}