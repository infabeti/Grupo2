package controlador;

import vista.*;

public class App {

	public static void main(String[] args) {
		try {
			Ventanas frame = new Ventanas();
			VentanaInicio pan = new VentanaInicio();
			Ventanas.cambiarVentana(pan);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
