package EscrituraTXT;

public class Principal {
	public static void main(String[] args) {
		Archivo a = new Archivo();
		
		a.crearTXT("archivo.txt", "modificadores de acceso");
		a.concatenar("archivo.txt", "Diosito ayudame a ganar integral");
		a.concatenar("archivo.txt", "la guaracha clásica");
		System.out.println(a.leer("archivo.txt"));
		
	}

}
