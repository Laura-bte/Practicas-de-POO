package Ejercicio2;
import java.util.*;

public class Principal { 
	public static int autoMasBarato(Vehiculo autos[]) {
		float precio;
		int indice = 0; //indice de la lista(es lo que se devuelve)
		
		precio = autos[0].getPrecio(); //primer precio del primer coche
		
		for(int j = 1; j < autos.length; j++ ) { //para ver cu�l precio es menor
			if(autos[j].getPrecio() < precio) {
				precio = autos[j].getPrecio();
				indice = j;
			}	
		}
		return indice;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String marca, modelo;
		float precio;
		int indiceBarato;
		
		System.out.println("Digite el n�mero de veh�culos que desea: ");
		int nVehiculos = entrada.nextInt();
		
		Vehiculo autos[] = new Vehiculo[nVehiculos]; //lista de objetos tipo vehiculo
		
		for(int i = 0; i < autos.length; i++) { //para cada objeto pone los atributos
			System.out.println("\nDigite las caracter�ticas de auto numero " + (i+1) + ": " ); //desde el auto numero 1
			System.out.println("Introduzca la marca: ");
			marca = entrada.next();
			System.out.println("Introduzca el modelo: ");	
			modelo = entrada.next();
			System.out.println("Introduzca el precio: ");
			precio = entrada.nextFloat();
			
			autos[i] = new Vehiculo(marca, modelo, precio); //se le asigna a cada objeto cada atributo
		}
		
		indiceBarato = autoMasBarato(autos); //se llama al m�todo para que retorne el indice donde est� el auto m�s barato
		
		System.out.println("\nEl coche m�s barato es: " + autos[indiceBarato].mostrarDatos());
	}
 
}
