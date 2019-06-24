package Ejercicio4;

public class Rectangulo extends Poligono {
	private double base;
	private double altura;
	
	public Rectangulo(double b, double a) {
		super(2);
		this.base = b;
		this.altura = a;	
	}
	
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public String toString() {
		return "Rectángulo:\n" + super.toString() + "\nBase= " + base + ", Altura= " + altura;
	}
	
	public double area() {
		return base*altura;	
	}
}
