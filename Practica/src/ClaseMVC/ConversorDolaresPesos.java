package ClaseMVC;

public class ConversorDolaresPesos extends ConversorDolares{
	
	public ConversorDolaresPesos() {
		//lo que vale un euro en pesos
		super(3366.98D);
	}
	
	public double eurosApesos(double cantidad) {
		return dolaresAmoneda(cantidad);
	}
	
	public double pesosAeuros(double cantidad) {
		return monedaAdolares(cantidad);
	}
}
