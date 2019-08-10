package ClaseMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlConversor implements ActionListener{
	private InterfazVista vista;
	private ConversorEurosPesos modelo;
	
	public ControlConversor(InterfazVista vista, ConversorEurosPesos modelo){
		this.vista = vista;
		this.modelo = modelo;
	}
	
	public void actionPerformed(ActionEvent evento) {
		double cantidad = vista.getCantidad();
		if ( evento.getActionCommand().equals(InterfazVista.AEUROS) ){
			vista.escribeCambio( cantidad + " pesos son:" + modelo.pesosAeuros(cantidad) + " euros" );
		}
		else if ( evento.getActionCommand().equals(InterfazVista.APESOS)) {
			vista.escribeCambio( cantidad + " euros son:" + modelo.eurosApesos(cantidad) + " pesos" );
		}
		else
			vista.escribeCambio( "ERROR" );
	}
}

