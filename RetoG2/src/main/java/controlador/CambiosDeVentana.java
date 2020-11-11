package controlador;

import vista.*;

public class CambiosDeVentana {

	public static void cambioInicioLogin() throws InterruptedException {
		Thread.sleep(3000);
		cambioALogin();
	}
	
	public static void cambioALogin() {
		VentanaLogin pan = new VentanaLogin();
		Ventanas.cambiarVentana(pan);
	}

	public static void cambioAGeneros() {
		VentanaGeneros pan = new VentanaGeneros();
		Ventanas.cambiarVentana(pan);
	}

	public static void cambioAPelis() {
		VentanaPelis pan = new VentanaPelis();
		Ventanas.cambiarVentana(pan);
	}

	public static void cambioAResumen() {
		VentanaResumen pan = new VentanaResumen();
		Ventanas.cambiarVentana(pan);
	}


}
