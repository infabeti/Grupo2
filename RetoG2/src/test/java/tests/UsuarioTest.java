package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Usuario;

public class UsuarioTest {
	private String nombre="pepe";
	private String passwd="123";

	private Usuario user=new Usuario(nombre,passwd);
	
	@Test
	public void testUsuario() {
		assertEquals(user.getNombre(),"pepe");
		assertEquals(user.getPasswd(),"123");
	}
	
	@Test
	public void testsetTitulo() {
		user.setNombre("pepe");
		assertEquals(user.getNombre(),"pepe");
	}
	
	@Test
	public void testsetPasswd() {
		user.setPasswd("123");
		assertEquals(user.getPasswd(),"123");
		
	}

}
