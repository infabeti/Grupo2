package controlador;

import vista.*;

public class App {

	public static void main(String[] args) {
		try {
			Metodos met = new Metodos();
			met.llenarPelis();
			Ventanas frame = new Ventanas();
			VentanaInicio pan = new VentanaInicio();
			Ventanas.cambiarVentana(pan);
			CambiosDeVentana.cambioInicioLogin();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
