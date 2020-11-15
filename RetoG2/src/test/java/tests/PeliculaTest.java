package tests;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import modelo.Pelicula;

public class PeliculaTest {
	private String genero="Drama";
	private String titulo="La lista de Schindler";
	private Date duracion = new Date();
	private boolean elegida=false;
	private String dia="Sabado";
	
	private Pelicula peli = new Pelicula(titulo,duracion,genero,elegida,dia);
	
	
	
	@Test
	public void testPeli() {
		assertEquals(peli.getTitulo(),"La lista de Schindler");
		assertEquals(peli.getGenero(),"Drama");
		assertEquals(peli.getDuracion(),duracion);
		assertEquals(peli.isElegida(),false);
		assertEquals(peli.getDia(),"Sabado");
	}
	
	
	@Test
	public void setTitulo() {
		peli.setTitulo("La lista de Schindler");
		assertEquals(peli.getTitulo(),"La lista de Schindler");
	}

	@Test
	public void setDuracion() {
		peli.setDuracion(duracion);
		assertEquals(peli.getDuracion(),duracion);
	}

	@Test
	public void setGenero() {
		peli.setGenero("Drama");
		assertEquals(peli.getGenero(),"Drama");
	}
	
	
	@Test
	public void setElegida() {
		peli.setElegida(false);
		assertEquals(peli.isElegida(),false);
	}
	
	@Test
	public void setDia() {
		peli.setDia("Sabado");
		assertEquals(peli.getDia(),"Sabado");
	
	}

}
