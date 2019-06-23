import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Cuadrilatero c1;
		float l1, l2;
		
		l1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1: "));
		l2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado2: "));
		
		if(l1 == l2) {
			c1 = new Cuadrilatero(l1);
		}
		else {
			c1 = new Cuadrilatero(l1, l2);
		}
		
		System.out.println("El área es: " + c1.getArea());
		System.out.println("El perimetro es: " + c1.getPerimetro());
		
	}

}
