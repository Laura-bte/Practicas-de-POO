package ClaseMVC;

public class ConversorDolares {
	private double cambio;
		
	public ConversorDolares(double valorCambio) {
		cambio = valorCambio;
	}
		
	public double dolaresAmoneda(double cantidad) {
		return cantidad*cambio;
	}
		
	public double monedaAdolares(double cantidad) {
		return cantidad/cambio;
	}
}


