import javax.swing.JOptionPane;

public class EX_1App {

	public static void main(String[] args) {
   AreaCirculo();
   areaCuadraro();
   areaTriangulo();
   
	}
	
public static void AreaCirculo( ) {
	
	 String radio=JOptionPane.showInputDialog("Introduce el radio");
	 double radioDouble=Double.parseDouble(radio);
	 double radio_2=Math.pow(radioDouble,2);
	 double resultado=Math.PI*radio_2;
	 
    JOptionPane.showMessageDialog(null,"El resultado és " +resultado);
    
    
}
public static void areaCuadraro() {

	 String lado=JOptionPane.showInputDialog("El primer lado del cuadraro");
	 double ladoDouble=Double.parseDouble(lado);	
	 String lado1=JOptionPane.showInputDialog("El segundo lado del cuadrado");
	 double ladoDouble1=Double.parseDouble(lado1);
	 double resultado=ladoDouble*ladoDouble1;
	    JOptionPane.showMessageDialog(null,"El resultado és " +resultado);
	 
	 
	
}
public static void areaTriangulo() {

	 String base=JOptionPane.showInputDialog("Base del triangulo?");
	 double baseDouble=Double.parseDouble(base);	
	 String altura=JOptionPane.showInputDialog("Altura del triangulo?");
	 double alturaDouble=Double.parseDouble(altura);
	 double resultado=baseDouble*alturaDouble;
	    JOptionPane.showMessageDialog(null,"El resultado és " +resultado);
	 
	 
	
}

}

