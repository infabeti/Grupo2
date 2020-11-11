package modelo;

import java.util.Date;

public class Pelicula {
	private String titulo;
	private Date duracion;
	private String genero;
	private boolean elegida;

	public Pelicula(String titulo, Date duracion, String genero, boolean elegida) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.genero = genero;
		this.elegida = elegida;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDuracion() {
		return duracion;
	}

	public void setDuracion(Date duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isElegida() {
		return elegida;
	}

	public void setElegida(boolean elegida) {
		this.elegida = elegida;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", duracion=" + duracion + ", genero=" + genero + ", elegida=" + elegida
				+ "]";
	}

}
