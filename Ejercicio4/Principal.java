package Ejercicio4;

import java.util.*;

public class Principal {
	static ArrayList<Poligono> poligonos = new ArrayList<Poligono>(); //arreglo din�mico
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {	
		llenarPoligonos();
		mostrarResultados();
		
	}
	
	public static void llenarPoligonos() {
		int opcion;
		char respuesta;
		do {
			do {
				System.out.println("Digite el pol�gono que desea:");
				System.out.println("1. Tri�ngulo.");
				System.out.println("2. Rect�ngulo.");
				System.out.println("Opci�n: ");
				opcion = entrada.nextInt();
				
			}while(opcion < 1 || opcion > 2 ); //se hace mientras se cumpla esto
			
			switch(opcion) {
			case 1: llenarTriangulo();  //llenar un tri�ngulo
				break;
			case 2: llenarRectangulo();//llenar un rect�ngulo, llama al m�todo
				break;
			}
			
			System.out.println("\n�Desea introducir otro pol�gono?(s/n): ");
			respuesta = entrada.next().charAt(0);
			
			}while(respuesta == 's' || respuesta == 'S');
	}
	
	public static void llenarTriangulo() {
		double l1, l2, l3;
		
		System.out.println("\nDigite el lado1 del tri�ngulo: ");
		l1 = entrada.nextDouble();
		System.out.println("\nDigite el lado2 del tri�ngulo: ");
		l2 = entrada.nextDouble();
		System.out.println("\nDigite el lado3 del tri�ngulo: ");
		l3 = entrada.nextDouble();
		
		Triangulo triangulo1 = new Triangulo(l1, l2, l3);
		
		poligonos.add(triangulo1); //guardar un triangulo en el arreglo
	}
	
	public static void llenarRectangulo() {
		double b, a;
		System.out.println("\nDigite la base del rect�ngulo: ");
		b = entrada.nextDouble();
		System.out.println("\nDigite la altura del rect�ngulo: ");
		a = entrada.nextDouble();
		
		Rectangulo rectangulo1 = new Rectangulo(b, a); //es un objeto gen�rico
		
		poligonos.add(rectangulo1);
		
	}
	
	public static void mostrarResultados() {
		for(Poligono poli: poligonos) { //recorre el arreglo y muestra lo de cada objeto
			System.out.println(poli.toString()); //depende del objeto que detecte toma el metodo toString de la clase de cada objeto
			System.out.println("�rea: " + poli.area());
			System.out.println(""); //salto de l�nea
		}
	}

}
