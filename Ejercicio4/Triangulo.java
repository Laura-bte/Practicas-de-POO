package Ejercicio4;

public class Triangulo extends Poligono{
	private double lado1; 
	private double lado2;
	private double lado3;
	
	public Triangulo(double l1, double l2, double l3) {
		super(3);
		this.lado1 = l1;
		this.lado2 = l2;
		this.lado3 = l3;
	}
	public double getLado1() {
		return lado1;
	}
	
	public double getLado2() {
		return lado2;
	}
	
	public double getLado3() {
		return lado3;
	}
	
	public String toString() {
		return "Triángulo:\n" + super.toString() + "\nLado1= " + lado1 + ", Lado2= " + lado2 + ", Lado3= " + lado3;
	}
	
	public double area() {
		double p = (lado1+lado2+lado3)/2;
		return Math.sqrt((p*(p-lado1)*(p-lado2)*(p-lado3)));
	}

}
