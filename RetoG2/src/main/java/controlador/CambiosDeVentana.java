package controlador;

import vista.*;

public class CambiosDeVentana {
	
	public void cambioInicioLogin() throws InterruptedException {
		Thread.sleep(3000);
		VentanaLogin pan = new VentanaLogin();
		Ventanas.cambiarVentana(pan);
	}

}
