package controlador;

import java.io.IOException;
import java.util.logging.Logger;

import controlador.Logger.miLoger;
import vista.*;

public class App {
	
	public final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void main(String[] args) {
		
		try {
			miLoger.setup();
		} catch (IOException e) {
			e.printStackTrace();
			App.LOGGER.severe("ERROR AL CREAR EL FICHERO LOG");
			throw new RuntimeException("problemas al crear el fichero log");
		}
		
			Metodos.llenarPelis();
			Ventanas frame = new Ventanas();
			VentanaInicio pan = new VentanaInicio();
			Ventanas.cambiarVentana(pan);
			CambiosDeVentana.cambioInicioLogin();

	}

}
