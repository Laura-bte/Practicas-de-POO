package Ejercicio4; //programa para hallar el �rea de pol�gonos

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
		return "N�mero de lados: " + nLados;
	}
	
}


//no puede ser instanciada con la misma clase, pero si con sus subclases