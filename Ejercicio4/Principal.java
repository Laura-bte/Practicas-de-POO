package Ejercicio4;

import java.util.*;

public class Principal {
	static ArrayList<Poligono> poligonos = new ArrayList<Poligono>(); //arreglo dinámico
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
				System.out.println("Digite el polígono que desea:");
				System.out.println("1. Triángulo.");
				System.out.println("2. Rectángulo.");
				System.out.println("Opción: ");
				opcion = entrada.nextInt();
				
			}while(opcion < 1 || opcion > 2 ); //se hace mientras se cumpla esto
			
			switch(opcion) {
			case 1: llenarTriangulo();  //llenar un triángulo
				break;
			case 2: llenarRectangulo();//llenar un rectángulo, llama al método
				break;
			}
			
			System.out.println("\n¿Desea introducir otro polígono?(s/n): ");
			respuesta = entrada.next().charAt(0);
			
			}while(respuesta == 's' || respuesta == 'S');
	}
	
	public static void llenarTriangulo() {
		double l1, l2, l3;
		
		System.out.println("\nDigite el lado1 del triángulo: ");
		l1 = entrada.nextDouble();
		System.out.println("\nDigite el lado2 del triángulo: ");
		l2 = entrada.nextDouble();
		System.out.println("\nDigite el lado3 del triángulo: ");
		l3 = entrada.nextDouble();
		
		Triangulo triangulo1 = new Triangulo(l1, l2, l3);
		
		poligonos.add(triangulo1); //guardar un triangulo en el arreglo
	}
	
	public static void llenarRectangulo() {
		double b, a;
		System.out.println("\nDigite la base del rectángulo: ");
		b = entrada.nextDouble();
		System.out.println("\nDigite la altura del rectángulo: ");
		a = entrada.nextDouble();
		
		Rectangulo rectangulo1 = new Rectangulo(b, a); //es un objeto genérico
		
		poligonos.add(rectangulo1);
		
	}
	
	public static void mostrarResultados() {
		for(Poligono poli: poligonos) { //recorre el arreglo y muestra lo de cada objeto
			System.out.println(poli.toString()); //depende del objeto que detecte toma el metodo toString de la clase de cada objeto
			System.out.println("Área: " + poli.area());
			System.out.println(""); //salto de línea
		}
	}

}
