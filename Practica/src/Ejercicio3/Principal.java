package Ejercicio3;
import java.util.*;

public class Principal {
	
	public static double mayorArea(Triangulo_Isoceles triangulos[]) {
		double area;
		
		area = triangulos[0].getArea();
		for(int j = 1; j < triangulos.length; j++) {
			if(triangulos[j].getArea() > area) {
				area = triangulos[j].getArea();
			}		
		}
		return area;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double base, lado;
		
		System.out.println("Digite el número de triángulos a ingresar: ");
		int nTriangulos = entrada.nextInt();
		
		Triangulo_Isoceles triangulos[] = new Triangulo_Isoceles[nTriangulos];
		
		for(int i = 0; i < triangulos.length;i++) {
			System.out.println("\nDigite los valores para el triángulo " + (i+1) + ": " ); //desde el triángulo numero 1
			System.out.print("Introduzca la base: ");
			base = entrada.nextDouble();
			System.out.print("Introduzca el lado: ");	
			lado = entrada.nextDouble();
			
			triangulos[i] = new Triangulo_Isoceles(base, lado);
			
			System.out.println("\nEl perímetro del triángulo es: " + triangulos[i].getPerimetro());
			System.out.println("\nEl área del triángulo es: " + triangulos[i].getArea());
			
		}
		
		System.out.println("\nEl área del triángulo de mayor superficie es: " + mayorArea(triangulos));
		
	}
	
}	
	


