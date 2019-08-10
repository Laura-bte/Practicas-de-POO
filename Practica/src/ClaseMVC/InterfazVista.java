package ClaseMVC;

public interface InterfazVista {
	void setControlador(ControlConversor c);
	void arranca(); //comienza la visualizacion
	
	double getCantidad(); //cantidad a convertir
	void escribeCambio(String s); //texto con la conversion
	
	//constantes que definen las posibles operaciones:
	static final String AEUROS = "Pesetas a Euros";
	static final String APESOS = "Euros a Pesos";
}
