package controlador;

import java.awt.TextArea;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JTextArea;

import modelo.*;
import vista.*;

public class Metodos {

	private static Dia sabado;
	private static Dia domingo;
	private static ArrayList<Pelicula> peliculas;
	private static String NDia;
	private static int opcGen;
	private static int opcPeli;
	private static ArrayList<String> generosRestantes;

	public static boolean comprobarLogIn(String nom, String contr) {
		Usuario user = new Usuario("pepe", "123");
		if (!nom.equals(user.getNombre()) || !contr.equals(user.getPasswd())) {
			return false;
		} else
			return true;
	}

	public static void crearDias() {
		llenarPelis();
		ArrayList<Pelicula> pelis = new ArrayList<Pelicula>();
		Date horas = new Date();
		horas.setHours(8);
		horas.setMinutes(0);
		sabado = new Dia("Sabado", pelis, horas);
		horas.setHours(6);
		domingo = new Dia("Domingo", pelis, horas);
	}

	public static void llenarPelis() {
		peliculas = new ArrayList<Pelicula>();
		Date duracion = new Date();

		duracion.setHours(1);
		duracion.setMinutes(56);
		Pelicula peli = new Pelicula("Handia", duracion, "Drama", false);
		peliculas.add(peli);
		duracion.setHours(3);
		duracion.setMinutes(17);
		peli = new Pelicula("La lista de Schindler", duracion, "Drama", false);
		peliculas.add(peli);
		duracion.setHours(2);
		duracion.setMinutes(22);
		peli = new Pelicula("Cadena Perpetua", duracion, "Drama", false);
		peliculas.add(peli);
		duracion.setHours(2);
		duracion.setMinutes(13);
		peli = new Pelicula("Million Dolar Baby", duracion, "Drama", false);
		peliculas.add(peli);
		duracion.setHours(2);
		duracion.setMinutes(22);
		peli = new Pelicula("2001:Odisea en el espacio", duracion, "Sci-Fi", false);
		peliculas.add(peli);
		duracion.setHours(1);
		duracion.setMinutes(15);
		peli = new Pelicula("La novia de Frankenstein", duracion, "Sci-Fi", false);
		peliculas.add(peli);
		duracion.setHours(1);
		duracion.setMinutes(55);
		peli = new Pelicula("El planeta de los simios", duracion, "Sci-Fi", false);
		peliculas.add(peli);
		duracion.setHours(1);
		duracion.setMinutes(57);
		peli = new Pelicula("Alien, el octavo pasajero", duracion, "Sci-Fi", false);
		peliculas.add(peli);
		duracion.setHours(1);
		duracion.setMinutes(30);
		peli = new Pelicula("Scary movie", duracion, "Comedia", false);
		peliculas.add(peli);
		duracion.setHours(1);
		duracion.setMinutes(59);
		peli = new Pelicula("El gran Lebowsky", duracion, "Comedia", false);
		peliculas.add(peli);
		duracion.setHours(1);
		duracion.setMinutes(34);
		peli = new Pelicula("La vida de Brian", duracion, "Comedia", false);
		peliculas.add(peli);
		duracion.setHours(1);
		duracion.setMinutes(28);
		peli = new Pelicula("Aterriza como puedas", duracion, "Comedia", false);
		peliculas.add(peli);
		duracion.setHours(1);
		duracion.setMinutes(49);
		peli = new Pelicula("Psicosis", duracion, "Terror", false);
		peliculas.add(peli);
		duracion.setHours(2);
		duracion.setMinutes(26);
		peli = new Pelicula("El resplandor", duracion, "Terror", false);
		peliculas.add(peli);
		duracion.setHours(2);
		duracion.setMinutes(35);
		peli = new Pelicula("Dracula", duracion, "Terror", false);
		peliculas.add(peli);
		duracion.setHours(1);
		duracion.setMinutes(50);
		peli = new Pelicula("Cisne negro", duracion, "Terror", false);
		peliculas.add(peli);
	}

	public static void recogerDia(int indexDia) {
		if (indexDia == 0) {
			NDia = "Sabado";
		} else
			NDia = "Domingo";
	}

	public static JTextArea llenarGeneros(JTextArea txtAGeneros) {
		generosRestantes = new ArrayList<String>();
		boolean dramaVal = false;
		boolean sciVal = false;
		boolean comVal = false;
		boolean terrVal = false;
		int cont = 1;
		String generos[] = new String[4];
		generos[0] = "Drama";
		generos[1] = "Sci-Fi";
		generos[2] = "Comedia";
		generos[3] = "Terror";
		if (NDia.equals(sabado.getDiaSem())) {
			for (int i = 0; i < sabado.getPeliculas().size(); i++) {
				if (sabado.getPeliculas().get(i).isElegida()) {
					if (sabado.getPeliculas().get(i).getGenero().equals(generos[0])) {
						dramaVal = true;
					} else if (sabado.getPeliculas().get(i).getGenero().equals(generos[1])) {
						sciVal = true;
					} else if (sabado.getPeliculas().get(i).getGenero().equals(generos[2])) {
						comVal = true;
					} else if (sabado.getPeliculas().get(i).getGenero().equals(generos[3])) {
						terrVal = true;
					}
				}
			}
		} else {
			for (int i = 0; i < domingo.getPeliculas().size(); i++) {
				if (domingo.getPeliculas().get(i).isElegida()) {
					if (domingo.getPeliculas().get(i).getGenero().equals(generos[0])) {
						dramaVal = true;
					} else if (domingo.getPeliculas().get(i).getGenero().equals(generos[1])) {
						sciVal = true;
					} else if (domingo.getPeliculas().get(i).getGenero().equals(generos[2])) {
						comVal = true;
					} else if (domingo.getPeliculas().get(i).getGenero().equals(generos[3])) {
						terrVal = true;
					}
				}
			}
		}
		if (!dramaVal) {
			txtAGeneros.append(cont + ". " + generos[0] + "\n");
			generosRestantes.add(generos[0]);
			cont++;
		}
		if (!sciVal) {
			txtAGeneros.append(cont + ". " + generos[1] + "\n");
			generosRestantes.add(generos[1]);
			cont++;
		}
		if (!comVal) {
			txtAGeneros.append(cont + ". " + generos[2] + "\n");
			generosRestantes.add(generos[2]);
			cont++;
		}
		if (!terrVal) {
			txtAGeneros.append(cont + ". " + generos[3] + "\n");
			generosRestantes.add(generos[3]);
			cont++;
		}
		txtAGeneros.append("0. Salir");
		return txtAGeneros;

	}

	public static JTextArea sacarPelis(JTextArea txtASeleccionadas) {

		for (int i = 0; i < sabado.getPeliculas().size(); i++) {
			if (sabado.getPeliculas().get(i).isElegida()) {
				txtASeleccionadas.append(sabado.getPeliculas().get(i).getTitulo() + "\n");
			}
		}
		for (int i = 0; i < domingo.getPeliculas().size(); i++) {
			if (domingo.getPeliculas().get(i).isElegida()) {
				txtASeleccionadas.append(domingo.getPeliculas().get(i).getTitulo() + "\n");
			}
		}
		return txtASeleccionadas;
	}

	public static JComboBox llenarCmbxOpc1(JComboBox cmbxOpc, JTextArea txtAGeneros) {
		String opciones[] = new String[5];
		opciones = txtAGeneros.getText().split("\n");
		int cont = 0;
		for (int i = 0; i < opciones.length; i++) {
			if (opciones[i] != null) {
				cmbxOpc.addItem(cont);
				cont++;
			}
		}
		return cmbxOpc;
	}

	public static JTextArea cargarPelis(JTextArea txtAPelis) {
		int cont = 1;
		int suma = 0;
		for (int i = 0; i < generosRestantes.size(); i++) {
			for (int j = 0; j < peliculas.size(); j++) {
				suma = i+1;
				if (peliculas.get(j).getGenero() == generosRestantes.get(i) && !peliculas.get(i).isElegida() && suma == opcGen) {
					txtAPelis.append(cont + ". " + peliculas.get(j).getTitulo() + "\n");
					cont++;
				}
			}
		}
		txtAPelis.append("0. Salir");
		return txtAPelis;
	}

	public static void pasarOpc2(int opcionesPelis) {

	}

	public static void pasarOpc1(int selectedItem) {
		opcGen = selectedItem;
	}

}
