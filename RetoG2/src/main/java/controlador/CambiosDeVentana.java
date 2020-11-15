package controlador;

import vista.*;

public class CambiosDeVentana {

	public static void cambioInicioLogin(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cambioALogin();
	}
	
	public static void cambioResumenLogin(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cambioAInicio();
	}
	
	public static void cambioAInicio() {
		VentanaInicio pan = new VentanaInicio();
		Ventanas.cambiarVentana(pan);
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
