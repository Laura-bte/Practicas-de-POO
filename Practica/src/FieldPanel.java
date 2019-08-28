

import java.awt.*;
import javax.swing.*;

public class FieldPanel extends JPanel {
	public static String tituloCriterio, tituloValor;
	String[] criteriosArray;
	String[] valoresArray;
	boolean[] habilitado;
	JButton aceptar, borrar;
	JPanel nombre, descripcion;
	JTextField[] ingresos;
	
	public FieldPanel() {
		nombre = new JPanel();
		nombre.setLayout(new BorderLayout());
		descripcion = new JPanel();
		this.setLayout(new BorderLayout(3,3));
		this.add(nombre, BorderLayout.NORTH);
		this.add(descripcion, BorderLayout.CENTER);

	}
	public FieldPanel(String tituloCriterios, String[] criterios, 
			String tituloValores, String[] valores, boolean[] habilitado) {
		descripcion.setLayout(new GridBagLayout());
		
		this.setLayout(new BorderLayout(3,3));
		this.tituloCriterio = tituloCriterios;
		this.tituloValor = tituloValores;
		this.criteriosArray = criterios;
		this.valoresArray = valores;
		this.habilitado = habilitado;
		ingresos = new JTextField[criterios.length];
		
		GridBagConstraints constraints = new GridBagConstraints();
		
		JLabel etiqueta = new JLabel(tituloCriterios);
		constraints.gridx = 0; // El área de texto empieza en la columna cero.
		constraints.gridy = 0; // El área de texto empieza en la fila cero
		constraints.gridwidth = 2; // El área de texto ocupa dos columnas.
		constraints.gridheight = 2;
		descripcion.add(etiqueta, constraints);
		
		etiqueta = new JLabel(tituloValores);
		constraints.gridx = 2; // El área de texto empieza en la columna cero.
		constraints.gridy = 0; // El área de texto empieza en la fila cero
		constraints.gridwidth = 2; // El área de texto ocupa dos columnas.
		constraints.gridheight = 2;
		descripcion.add(etiqueta, constraints);
		
		for(int i = 0; i < criterios.length; i++) {
			etiqueta = new JLabel(criteriosArray[i]);
			constraints.gridx = 0; // El área de texto empieza en la columna cero.
			constraints.gridy = i + 2; // El área de texto empieza en la fila cero
			constraints.gridwidth = 2; // El área de texto ocupa dos columnas.
			constraints.gridheight = 2;
			descripcion.add(etiqueta, constraints);
			
			ingresos[i] = new JTextField(valoresArray[i], 25);
			if(!habilitado[i]) {
				ingresos[i].setEditable(false);
			}
			constraints.gridx = 2; // El área de texto empieza en la columna cero.
			constraints.gridy = i + 2; // El área de texto empieza en la fila cero
			constraints.gridwidth = 2; // El área de texto ocupa dos columnas.
			constraints.gridheight = 2;
			descripcion.add(ingresos[i], constraints);	
		}
		
		aceptar = new JButton("Aceptar");
		constraints.gridx = 0; // El área de texto empieza en la columna cero.
		constraints.gridy = criterios.length + 2; // El área de texto empieza en la fila cero
		constraints.gridwidth = 2; // El área de texto ocupa dos columnas.
		constraints.gridheight = 2;
		descripcion.add(aceptar, constraints);
		
		borrar = new JButton("Borrar");
		constraints.gridx = 2; // El área de texto empieza en la columna cero.
		constraints.gridy = criterios.length + 2; // El área de texto empieza en la fila cero
		constraints.gridwidth = 2; // El área de texto ocupa dos columnas.
		constraints.gridheight = 2;
		descripcion.add(borrar, constraints);
		
		this.add(nombre, BorderLayout.NORTH);
		this.add(descripcion, BorderLayout.NORTH);

	}
}
