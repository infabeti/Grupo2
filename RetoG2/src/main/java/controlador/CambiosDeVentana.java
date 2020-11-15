package controlador;

import vista.*;

public class CambiosDeVentana {

	public static void cambioInicioLogin(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			App.LOGGER.severe("ERROR AL PASAR 3 SEGUNDOS DESDE INICIO A LOGIN");
			throw new RuntimeException("problemas al pasar 3 segundos");
		}
		cambioALogin();
	}
	
	public static void cambioResumenLogin(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			App.LOGGER.severe("ERROR AL PASAR 2 SEGUNDOS DESDE RESUMEN A INICIO");
			throw new RuntimeException("problemas al pasar 2 segundos");
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
