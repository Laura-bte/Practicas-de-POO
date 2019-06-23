package Ejercicio3;

public class Triangulo_Isoceles {
	private double base;
	private double lado;
	
	public Triangulo_Isoceles(double b, double l) {
		this.base = b;
		this.lado = l;
	}
	
	public double getPerimetro() {
		return (2*lado) + base;	
	}
	
	public double getArea() {
		return ((base*(Math.sqrt((lado*lado)-((base*base)/4))))/2);
	}
	
	public String mostrarDatos() {
		return "Base: " + base + "\nLado: " + lado + "\nPerimetro: " + getPerimetro() + "\n¡rea: " + getArea() + "\n";
	}
}
