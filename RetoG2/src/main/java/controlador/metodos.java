package controlador;
import javax.swing.JComboBox;

import modelo.*;
import vista.*;

public class metodos {
	
	private String nombre;
	private String contraseņa;
	
	public boolean comprobarLogIn(String nom, String contr) {
		nombre = "pepe";
		contraseņa = "pepe123";
		if (!nom.equals(nombre) || !contr.equals(contraseņa)) {
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
