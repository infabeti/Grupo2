package tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.mockito.verification.VerificationMode;

import controlador.Metodos;

public class MetodosTest {
String nom;
String contr;
private Metodos prueba = new Metodos();
boolean resultado;
String resultado2;

	@Test
	public void testcomprobarLogIn() {
		nom="pepe";
		contr="123";
		resultado=prueba.comprobarLogIn(nom, contr);
		assertTrue(resultado);
		
	}

//	String NDia;
//	
//	public void testrecogerDia(String opcDia) {
//		opcDia="Sabado";
//	assertEquals(opcDia,prueba.recogerDia(opcDia));	
//	}
//	
//	
//	public void testcrearDias() {
//		String diaPrueba="Sabado";
//		String diaPrueba2="Domingo";
//		modelo.Dia dia1 = new modelo.Dia("Sabado",null,null);
//		modelo.Dia dia2 = new modelo.Dia("Domingo",null,null);
//		//Metodos.crearDias();
//		dia1.setDiaSem(diaPrueba);
//		dia2.setDiaSem(diaPrueba2);
//		assertEquals(diaPrueba,dia1.getDiaSem());
//		assertEquals(diaPrueba2,dia2.getDiaSem());
//		
//	}



	public void testcalcularHorasSabado(){
		resultado2= Metodos.calcularHorasSabado();
		assertEquals("08:00",resultado2);
	}


}
 