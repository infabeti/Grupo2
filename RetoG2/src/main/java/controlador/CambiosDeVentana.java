package controlador;

import vista.*;

public class CambiosDeVentana {
	
	public static void cambioInicioLogin() throws InterruptedException {
		Thread.sleep(3000);
		VentanaGeneros pan = new VentanaGeneros();
		Ventanas.cambiarVentana(pan);
	}

}
