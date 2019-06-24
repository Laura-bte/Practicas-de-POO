package Ejercicio4; //programa para hallar el área de polígonos

public abstract class Poligono {
	protected int nLados;
	
	public abstract double area();
	
	public Poligono(int nl) {
		this.nLados= nl;
	}
	
	public int getNumeroLados() {
		return nLados;
	}
	
	public String toString() {
		return "Número de lados: " + nLados;
	}
	
}


//no puede ser instanciada con la misma clase, pero si con sus subclases