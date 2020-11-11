package controlador;
import javax.swing.JComboBox;

import modelo.*;
import vista.*;

public class Metodos {
	
	private String nombre;
	private String contraseña;
	
	public boolean comprobarLogIn(String nom, String contr) {
		Usuario user = new Usuario("pepe", "123");
		nombre = "pepe";
		contraseña = "pepe123";
		if (!nom.equals(nombre) || !contr.equals(contraseña)) {
			return false;
		}else
			return true;
	}
	
	public String pasarDia(String dia) {
		return dia;
	}

	public static void llenarCmbxOpc1(JComboBox cmbxOpc) {
		
	}

	public static void pasarDatosGeneros() {
		
		
	}

}
