package EscrituraTXT;

import java.io.*;


public class Archivo {
	File f;
	FileReader lectorArchivo;
	FileWriter escritorArchivo;
	
	public void concatenar(String nombre, String texto) {
		String temp = this.leer(nombre); //se lee el texto
		temp = temp + texto;   //guardar en una variable temporal lo que ya está escrito y concatenarle lo que se quiere escribir
		this.crearTXT(nombre, temp);
	}

	
	public void crearTXT(String nombre, String texto) {
		File f;                    //crea un objeto de tipo archivo
		FileWriter escritorArchivo; //ojeto que crea un flujo de datos para escribir en el archivo
		
		try {
			f = new File(nombre); //se le asigna nombre al archivo
			escritorArchivo = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(escritorArchivo);
			PrintWriter salida = new PrintWriter(bw);
			
			salida.write(texto + "\n"); //donde se escribe en el archivo
			
			salida.close();
			bw.close();
		} 
		catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}
	
	public String leer(String nombre) {
		File f;
		FileReader lectorArchivo;
		try {
			f = new File(nombre);
			lectorArchivo = new FileReader(f);
			BufferedReader br = new BufferedReader(lectorArchivo);
			String l = "";
			String aux = "";
			while(true) {
				aux = br.readLine();
				if(aux != null) {
					l = l + aux + "\n";
				}else {
					break;
				}
			}
			br.close();
			lectorArchivo.close();
			return l;			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return null;	
	}
	
	
}
