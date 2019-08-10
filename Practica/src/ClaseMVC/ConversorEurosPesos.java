package ClaseMVC;


public class ConversorEurosPesos extends ConversorEuros{
	
	public ConversorEurosPesos() {
		super(3700.38D);
	}
	
	public double eurosApesos(double cantidad) {
		return eurosAmoneda(cantidad);
	}
	
	public double pesosAeuros(double cantidad) {
		return monedaAeuros(cantidad);
	}
}

