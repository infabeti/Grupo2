package controlador;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetodosTest {
String nom;
String contr;
private Metodos prueba = new Metodos();
boolean resultado;

	@Test
	public void testcomprobarLogIn() {
		nom="pepe";
		contr="pepe123";
		resultado=prueba.comprobarLogIn(nom, contr);
		assertTrue(resultado);
		
	}


}
 