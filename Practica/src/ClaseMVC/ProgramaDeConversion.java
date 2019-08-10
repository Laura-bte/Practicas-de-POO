package ClaseMVC;

public class ProgramaDeConversion {
	public static void main(String[] args) {
		// el modelo:
		ConversorEurosPesos modelo = new ConversorEurosPesos();
		// la vista:
		InterfazVista vista = new VentanaConversor();
		// y el control:
		ControlConversor control = new ControlConversor (vista, modelo);
		// configura la vista
		vista.setControlador(control);
		// y arranca la interfaz (vista):
		vista.arranca();
		}
}