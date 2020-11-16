package controlador;

import java.awt.TextArea;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JTextArea;

import modelo.*;
import vista.*;

public class Metodos {

	private static ArrayList<Pelicula> peliculasSabado;
	private static ArrayList<Pelicula> peliculasDomingo;
	private static String NDia;
	private static int opcGen;
	private static ArrayList<String> generosRestantesSabado;
	private static ArrayList<String> generosRestantesDomingo;
	private static Calendar tiempoRestantesSabado;
	private static Calendar tiempoRestantesDomingo;

	public static boolean comprobarLogIn(String nom, String contr) {
		Usuario user = new Usuario("pepe", "123");
		if (!nom.equals(user.getNombre()) || !contr.equals(user.getPasswd())) {
			return false;
		} else
			return true;
	}

	private static void cargarTiempoDias() {
		Date sab = new Date();
		Date dom = new Date();
		tiempoRestantesSabado = Calendar.getInstance();
		tiempoRestantesDomingo = Calendar.getInstance();
		sab.setHours(8);
		sab.setMinutes(0);
		dom.setHours(6);
		dom.setMinutes(0);
		tiempoRestantesSabado.setTime(sab);
		tiempoRestantesDomingo.setTime(dom);
	}

	public static void llenarPelis() {
		cargarTiempoDias();
		generosRestantesSabado = new ArrayList<String>();
		generosRestantesDomingo = new ArrayList<String>();
		peliculasSabado = new ArrayList<Pelicula>();
		peliculasDomingo = new ArrayList<Pelicula>();
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

	public static void recogerDia(String opcDia) {// recoger el dia seleccionado en el comboBox del login
		NDia = opcDia;
	}

	public static JTextArea llenarGeneros(JTextArea txtAGeneros) {// rellena el textArea de generos
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

		if (NDia.equals("Sabado")) {
			for (int i = 0; i < peliculasSabado.size(); i++) {
				if (peliculasSabado.get(i).isElegida()) {
					if (peliculasSabado.get(i).getGenero().equals(generos[0])) {
						dramaVal = true;
					} else if (peliculasSabado.get(i).getGenero().equals(generos[1])) {
						sciVal = true;
					} else if (peliculasSabado.get(i).getGenero().equals(generos[2])) {
						comVal = true;
					} else if (peliculasSabado.get(i).getGenero().equals(generos[3])) {
						terrVal = true;
					}
				}
			}

			if (!dramaVal) {
				txtAGeneros.append(cont + ". " + generos[0] + "\n");
				generosRestantesSabado.add(generos[0]);
				cont++;
			}
			if (!sciVal) {
				txtAGeneros.append(cont + ". " + generos[1] + "\n");
				generosRestantesSabado.add(generos[1]);
				cont++;
			}
			if (!comVal) {
				txtAGeneros.append(cont + ". " + generos[2] + "\n");
				generosRestantesSabado.add(generos[2]);
				cont++;
			}
			if (!terrVal) {
				txtAGeneros.append(cont + ". " + generos[3] + "\n");
				generosRestantesSabado.add(generos[3]);
				cont++;
			}
		} else {
			for (int i = 0; i < peliculasDomingo.size(); i++) {
				if (peliculasDomingo.get(i).isElegida()) {
					if (peliculasDomingo.get(i).getGenero().equals(generos[0])) {
						dramaVal = true;
					} else if (peliculasDomingo.get(i).getGenero().equals(generos[1])) {
						sciVal = true;
					} else if (peliculasDomingo.get(i).getGenero().equals(generos[2])) {
						comVal = true;
					} else if (peliculasDomingo.get(i).getGenero().equals(generos[3])) {
						terrVal = true;
					}
				}
			}

			if (!dramaVal) {
				txtAGeneros.append(cont + ". " + generos[0] + "\n");
				generosRestantesDomingo.add(generos[0]);
				cont++;
			}
			if (!sciVal) {
				txtAGeneros.append(cont + ". " + generos[1] + "\n");
				generosRestantesDomingo.add(generos[1]);
				cont++;
			}
			if (!comVal) {
				txtAGeneros.append(cont + ". " + generos[2] + "\n");
				generosRestantesDomingo.add(generos[2]);
				cont++;
			}
			if (!terrVal) {
				txtAGeneros.append(cont + ". " + generos[3] + "\n");
				generosRestantesDomingo.add(generos[3]);
				cont++;
			}
		}

		txtAGeneros.append("0. Salir");
		return txtAGeneros;

	}

	public static String calcularHorasSabado() {
		String res = "";
		String hrs = "";
		String mins = "";
		if (tiempoRestantesSabado.get(Calendar.HOUR) < 10) {
			hrs = "0" + tiempoRestantesSabado.get(Calendar.HOUR);
		} else
			hrs = tiempoRestantesSabado.get(Calendar.HOUR) + "";
		if (tiempoRestantesSabado.get(Calendar.MINUTE) < 10) {
			mins = "0" + tiempoRestantesSabado.get(Calendar.MINUTE);
		} else
			mins = "" + tiempoRestantesSabado.get(Calendar.MINUTE);
		res = "Sabado: " + hrs + ":" + mins;
		return res;
	}

	public static String calcularHorasDomingo() {
		String res = "";
		String hrs = "";
		String mins = "";
		if (tiempoRestantesDomingo.get(Calendar.HOUR) < 10) {
			hrs = "0" + tiempoRestantesDomingo.get(Calendar.HOUR);
		} else
			hrs = tiempoRestantesDomingo.get(Calendar.HOUR) + "";
		if (tiempoRestantesDomingo.get(Calendar.MINUTE) < 10) {
			mins = "0" + tiempoRestantesDomingo.get(Calendar.MINUTE);
		} else
			mins = "" + tiempoRestantesDomingo.get(Calendar.MINUTE);
		res = "Domingo: " + hrs + ":" + mins;
		return res;
	}

	public static JTextArea sacarPelis(JTextArea txtASeleccionadas) {// rellena el textArea de las pelis
		if (NDia.equals("Sabado")) {
			for (int i = 0; i < peliculasSabado.size(); i++) {
				if (peliculasSabado.get(i).isElegida()) {
					txtASeleccionadas.append(peliculasSabado.get(i).getTitulo() + "\n");
				}
			}
		} else {
			for (int i = 0; i < peliculasDomingo.size(); i++) {
				if (peliculasDomingo.get(i).isElegida()) {
					txtASeleccionadas.append(peliculasDomingo.get(i).getTitulo() + "\n");
				}
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

	public static void pasarOpc1(int selectedItem) {
		if (selectedItem == 0) {
			System.exit(0);
		}
		opcGen = selectedItem;
	}

	public static JTextArea cargarPelis(JTextArea txtAPelis) {
		int cont = 1;
		int suma = 0;// variable para validar que tenga el mismo valor que el genero seleccionado
						// para mantener el indice del array generosRestantes
		if (NDia.equals("Sabado")) {
			for (int i = 0; i < generosRestantesSabado.size(); i++) {
				for (int j = 0; j < peliculasSabado.size(); j++) {
					suma = i + 1;
					if (peliculasSabado.get(j).getGenero() == generosRestantesSabado.get(i)
							&& !peliculasSabado.get(j).isElegida() && suma == opcGen) {
						txtAPelis.append(cont + ". " + peliculasSabado.get(j).getTitulo() + "\n");
						cont++;
					}
				}
			}
		} else {
			for (int i = 0; i < generosRestantesDomingo.size(); i++) {
				for (int j = 0; j < peliculasDomingo.size(); j++) {
					suma = i + 1;
					if (peliculasDomingo.get(j).getGenero() == generosRestantesDomingo.get(i)
							&& !peliculasDomingo.get(j).isElegida() && suma == opcGen) {
						txtAPelis.append(cont + ". " + peliculasDomingo.get(j).getTitulo() + "\n");
						cont++;
					}
				}
			}
		}

		txtAPelis.append("0. Salir");
		return txtAPelis;
	}

	public static JComboBox llenarCmbxOpc2(JComboBox cmbxOpc) {
		cmbxOpc.addItem(0);
		cmbxOpc.addItem(1);
		cmbxOpc.addItem(2);
		cmbxOpc.addItem(3);
		cmbxOpc.addItem(4);
		return cmbxOpc;
	}

	public static void seleccionarPeli(int opcion) {
		if (opcion == 0) {
			System.exit(0);
		}
		String genero = "";
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
						for (int j = 0; j < generosRestantesSabado.size(); j++) {
							if (peliculasSabado.get(i).getGenero().equals(generosRestantesSabado.get(j))) {
								generosRestantesSabado.remove(j);
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
						for (int j = 0; j < generosRestantesSabado.size(); j++) {
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

	public static JTextArea llenarResumen(JTextArea txtAResumen) {
		int hrs = 0;
		int mins = 0;

		txtAResumen.append("Titulo\t\tDuracion\tDia\n\n");
		for (int i = 0; i < peliculasSabado.size(); i++) {
			if (peliculasSabado.get(i).isElegida()) {
				hrs = peliculasSabado.get(i).getDuracion().getHours();
				mins = peliculasSabado.get(i).getDuracion().getMinutes();
				txtAResumen.append(peliculasSabado.get(i).getTitulo() + "\t" + hrs + ":" + mins + "\t"
						+ peliculasSabado.get(i).getDia() + "\n");
			}
		}
		for (int i = 0; i < peliculasDomingo.size(); i++) {
			if (peliculasDomingo.get(i).isElegida()) {
				hrs = peliculasDomingo.get(i).getDuracion().getHours();
				mins = peliculasDomingo.get(i).getDuracion().getMinutes();
				txtAResumen.append(peliculasDomingo.get(i).getTitulo() + "\t" + hrs + ":" + mins + "\t"
						+ peliculasDomingo.get(i).getDia() + "\n");
			}
		}
		return txtAResumen;
	}

}
