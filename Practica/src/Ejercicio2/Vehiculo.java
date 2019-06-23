package Ejercicio2;

public class Vehiculo {
	String marca;
	String modelo;
	float precio;
	
	public Vehiculo(String ma, String mo, float p ) {
		this.marca = ma;
		this.modelo = mo;
		this.precio = p;
	}
	
	public float getPrecio() {
		return precio;
	}

	public String mostrarDatos() {
		return "\nMarca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precio + "\n";
	}
	
}
