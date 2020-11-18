package tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.mockito.verification.VerificationMode;

import controlador.Metodos;
import modelo.Pelicula;

public class MetodosTest {
String nom;
String contr;
private static Metodos prueba = new Metodos();
boolean resultado;
String resultado2;
private static ArrayList<Pelicula> peliculasSabado;
private static ArrayList<Pelicula> peliculasDomingo;
private static String NDia="Sabado";
private static int opcGen;
private static ArrayList<String> generosRestantesSabado;
private static ArrayList<String> generosRestantesDomingo;
private static Calendar tiempoRestantesSabado;
private static Calendar tiempoRestantesDomingo;


	@Test
	public void testcomprobarLogIn() {
		nom="pepe";
		contr="123";
		resultado=prueba.comprobarLogIn(nom, contr);
		assertTrue(resultado);
		
	}
	
	
//	
//	public void testcrearDias() {
//		String diaPrueba="Sabado";
//		String diaPrueba2="Domingo";
//		Modelo.Dia dia1 = new modelo.Dia("Sabado",null,null);
//		Modelo.Dia dia2 = new modelo.Dia("Domingo",null,null);
//		//Metodos.crearDias();
//		dia1.setDiaSem(diaPrueba);
//		dia2.setDiaSem(diaPrueba2);
//		assertEquals(diaPrueba,dia1.getDiaSem());
//		assertEquals(diaPrueba2,dia2.getDiaSem());
//		
//	}


	@Test
	public void testcargarTiempoDias(){
		Date sab = new Date();
		Date dom = new Date();
		Calendar tiempoRestantesSabado = Calendar.getInstance();
		Calendar tiempoRestantesDomingo = Calendar.getInstance();
		sab.setHours(8);
		sab.setMinutes(0);
		dom.setHours(6);
		dom.setMinutes(0);
		tiempoRestantesSabado.setTime(sab);
		tiempoRestantesDomingo.setTime(dom);
	}
	
	@Test
	
	public void testllenarPelis() {
		Metodos.cargarTiempoDias();
		ArrayList<String> generosRestantesSabado = new ArrayList<String>();
		ArrayList<String> generosRestantesDomingo = new ArrayList<String>();
		ArrayList<Pelicula> peliculasSabado = new ArrayList<Pelicula>();
		ArrayList<Pelicula> peliculasDomingo = new ArrayList<Pelicula>();
		Date duracion = new Date();

		duracion.setHours(1);
		duracion.setMinutes(56);
		Pelicula peli = new Pelicula("Handia", duracion, "Drama", false, "Sabado");
		Pelicula peli1 = new Pelicula("Handia", duracion, "Drama", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();
		duracion.setHours(3);
		duracion.setMinutes(17);
		peli = new Pelicula("La lista de Schindler", duracion, "Drama", false, "Sabado");
		peli1 = new Pelicula("La lista de Schindler", duracion, "Drama", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();
		duracion.setHours(2);
		duracion.setMinutes(22);
		peli = new Pelicula("Cadena Perpetua", duracion, "Drama", false, "Sabado");
		peli1 = new Pelicula("Cadena Perpetua", duracion, "Drama", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();
		duracion.setHours(2);
		duracion.setMinutes(13);
		peli = new Pelicula("Million Dolar Baby", duracion, "Drama", false, "Sabado");
		peli1 = new Pelicula("Million Dolar Baby", duracion, "Drama", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();
		duracion.setHours(2);
		duracion.setMinutes(22);
		peli = new Pelicula("2001:Odisea en el espacio", duracion, "Sci-Fi", false, "Sabado");
		peli1 = new Pelicula("2001:Odisea en el espacio", duracion, "Sci-Fi", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();
		duracion.setHours(1);
		duracion.setMinutes(15);
		peli = new Pelicula("La novia de Frankenstein", duracion, "Sci-Fi", false, "Sabado");
		peli1 = new Pelicula("La novia de Frankenstein", duracion, "Sci-Fi", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();
		duracion.setHours(1);
		duracion.setMinutes(55);
		peli = new Pelicula("El planeta de los simios", duracion, "Sci-Fi", false, "Sabado");
		peli1 = new Pelicula("El planeta de los simios", duracion, "Sci-Fi", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();
		duracion.setHours(1);
		duracion.setMinutes(57);
		peli = new Pelicula("El planeta de los simios", duracion, "Sci-Fi", false, "Sabado");
		peli1 = new Pelicula("El planeta de los simios", duracion, "Sci-Fi", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();
		duracion.setHours(1);
		duracion.setMinutes(30);
		peli = new Pelicula("Scary movie", duracion, "Comedia", false, "Sabado");
		peli1 = new Pelicula("Scary movie", duracion, "Comedia", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();
		duracion.setHours(1);
		duracion.setMinutes(59);
		peli = new Pelicula("El gran Lebowsky", duracion, "Comedia", false, "Sabado");
		peli1 = new Pelicula("El gran Lebowsky", duracion, "Comedia", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();
		duracion.setHours(1);
		duracion.setMinutes(34);
		peli = new Pelicula("La vida de Brian", duracion, "Comedia", false, "Sabado");
		peli1 = new Pelicula("La vida de Brian", duracion, "Comedia", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion.setHours(1);
		duracion.setMinutes(28);
		peli = new Pelicula("Aterriza como puedas", duracion, "Comedia", false, "Sabado");
		peli1 = new Pelicula("Aterriza como puedas", duracion, "Comedia", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();
		duracion.setHours(1);
		duracion.setMinutes(49);
		peli = new Pelicula("Psicosis", duracion, "Terror", false, "Sabado");
		peli1 = new Pelicula("Psicosis", duracion, "Terror", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();
		duracion.setHours(2);
		duracion.setMinutes(26);
		peli = new Pelicula("El resplandor", duracion, "Terror", false, "Sabado");
		peli1 = new Pelicula("El resplandor", duracion, "Terror", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();
		duracion.setHours(2);
		duracion.setMinutes(35);
		peli = new Pelicula("Dracula", duracion, "Terror", false, "Sabado");
		peli1 = new Pelicula("Dracula", duracion, "Terror", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		duracion = new Date();
		duracion.setHours(1);
		duracion.setMinutes(55);
		peli = new Pelicula("Cisne negro", duracion, "Terror", false, "Sabado");
		peli1 = new Pelicula("Cisne negro", duracion, "Terror", false, "Domingo");
		peliculasSabado.add(peli);
		peliculasDomingo.add(peli1);
		
		generosRestantesSabado.add("Drama");
		generosRestantesSabado.add("Sci-Fi");
		generosRestantesSabado.add("Comedia");
		generosRestantesSabado.add("Terror");
		
		generosRestantesDomingo.add("Drama");
		generosRestantesDomingo.add("Sci-Fi");
		generosRestantesDomingo.add("Comedia");
		generosRestantesDomingo.add("Terror");
	}
	

	
	@Test 
	public void calcularHorasSabado(){
		String res = "";
		String hrs = "";
		String mins = "";
		Calendar tiempoRestantesSabado = null;
		if (tiempoRestantesSabado.get(Calendar.HOUR) < 10) {
			hrs = "0" + tiempoRestantesSabado.get(Calendar.HOUR);
		} else
			hrs = tiempoRestantesSabado.get(Calendar.HOUR) + "";
		if (tiempoRestantesSabado.get(Calendar.MINUTE) < 10) {
			mins = "0" + tiempoRestantesSabado.get(Calendar.MINUTE);
		} else
			mins = "" + tiempoRestantesSabado.get(Calendar.MINUTE);
		res = "Sabado: " + hrs + ":" + mins;
		
		
	}

	@Test
	
	public void testpasarOpc1() {
		int selectedItem=0;
		if (selectedItem == 0) {
		}
		opcGen = selectedItem;
	}

	
	@Test
	
	public void testseleccionarPeli() {
		int opcion=7;
		if (opcion == 0) {
			System.exit(0);
		}
		String genero="";
		String nombrePeliSeleccionada = "";
		Pelicula peliculasGenero[] = new Pelicula[4];
		int cont = 0;
		int hrsPeli = 0;
		boolean cambioASabado = false;
		boolean cambioADomingo = false;

		if (NDia.equals("Sabado")) {
			genero = generosRestantesSabado.get(opcGen - 1);
			for (int i = 0; i < peliculasSabado.size(); i++) {
				if (peliculasSabado.get(i).getGenero().equals(genero)) {
					peliculasGenero[cont] = peliculasSabado.get(i);
					cont++;
				}
			}
			nombrePeliSeleccionada = peliculasGenero[opcion - 1].getTitulo();
			for (int i = 0; i < peliculasSabado.size(); i++) {
				if (peliculasSabado.get(i).getTitulo().equals(nombrePeliSeleccionada)
						&& peliculasSabado.get(i).getDia().equals("Sabado")) {
					hrsPeli = peliculasSabado.get(i).getDuracion().getHours();
					if (hrsPeli < tiempoRestantesSabado.get(Calendar.HOUR)) {
						peliculasSabado.get(i).setElegida(true);
						tiempoRestantesSabado.add(Calendar.HOUR, -(hrsPeli));
						tiempoRestantesSabado.add(Calendar.MINUTE,
								-(peliculasSabado.get(i).getDuracion().getMinutes()));
						for (int j = 0; j < (generosRestantesSabado).size(); j++) {
							if (peliculasSabado.get(i).getGenero().equals(generosRestantesSabado.get(j))) {
								(generosRestantesSabado).remove(j);
							}
						}
					} else if (hrsPeli > tiempoRestantesSabado.get(Calendar.HOUR)) {
						for (int j = 0; j < generosRestantesDomingo.size(); j++) {
							if (genero.equals(generosRestantesDomingo.get(j))) {
								cambioADomingo = true;
							}
						}
						if (cambioADomingo) {
							peliculasDomingo.get(i).setElegida(true);
							tiempoRestantesDomingo.add(Calendar.HOUR, -(hrsPeli));
							tiempoRestantesDomingo.add(Calendar.MINUTE,
									-(peliculasDomingo.get(i).getDuracion().getMinutes()));
							for (int j = 0; j < generosRestantesDomingo.size(); j++) {
								if (peliculasDomingo.get(i).getGenero().equals(generosRestantesDomingo.get(j))) {
									generosRestantesDomingo.remove(j);
								}
							}
						}
					}
				}
			}
		} else {
			genero = generosRestantesDomingo.get(opcGen - 1);
			for (int i = 0; i < peliculasDomingo.size(); i++) {
				if (peliculasDomingo.get(i).getGenero().equals(genero)) {
					peliculasGenero[cont] = peliculasDomingo.get(i);
					cont++;
				}
			}
			nombrePeliSeleccionada = peliculasGenero[opcion - 1].getTitulo();
			for (int i = 0; i < peliculasDomingo.size(); i++) {
				if (peliculasDomingo.get(i).getTitulo().equals(nombrePeliSeleccionada)
						&& peliculasDomingo.get(i).getDia().equals("Domingo")) {
					hrsPeli = peliculasDomingo.get(i).getDuracion().getHours();
					if (hrsPeli < tiempoRestantesDomingo.get(Calendar.HOUR)) {
						peliculasDomingo.get(i).setElegida(true);
						tiempoRestantesDomingo.add(Calendar.HOUR, -(hrsPeli));
						tiempoRestantesDomingo.add(Calendar.MINUTE,
								-(peliculasDomingo.get(i).getDuracion().getMinutes()));
						for (int j = 0; j < generosRestantesDomingo.size(); j++) {
							if (peliculasDomingo.get(i).getGenero().equals(generosRestantesDomingo.get(j))) {
								generosRestantesDomingo.remove(j);
							}
						}
					} else if (hrsPeli < tiempoRestantesSabado.get(Calendar.HOUR)) {
						for (int j = 0; j < (generosRestantesSabado).size(); j++) {
							if (genero.equals(generosRestantesSabado.get(j))) {
								cambioASabado = true;
							}
						}
						if (cambioASabado) {
						peliculasSabado.get(i).setElegida(true);
						tiempoRestantesSabado.add(Calendar.HOUR, -(hrsPeli));
						tiempoRestantesSabado.add(Calendar.MINUTE,
								-(peliculasSabado.get(i).getDuracion().getMinutes()));
						for (int j = 0; j < generosRestantesDomingo.size(); j++) {
							if (peliculasDomingo.get(i).getGenero().equals(generosRestantesDomingo.get(j))) {
								generosRestantesDomingo.remove(j);
							}
						}
					}
					}
				}
			}
		}
		
	}
}


 