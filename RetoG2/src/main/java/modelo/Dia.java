package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Dia {
	private String diaSem;
	private ArrayList<Pelicula> peliculas;
	private Date tiempoRestante;

	public Dia(String diaSem, ArrayList<Pelicula> peliculas, Date tiempoRestante) {
		this.diaSem = diaSem;
		this.peliculas = peliculas;
		this.tiempoRestante = tiempoRestante;
	}

	public String getDiaSem() {
		return diaSem;
	}

	public void setDiaSem(String diaSem) {
		this.diaSem = diaSem;
	}

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public Date getTiempoRestante() {
		return tiempoRestante;
	}

	public void setTiempoRestante(Date tiempoRestante) {
		this.tiempoRestante = tiempoRestante;
	}

	@Override
	public String toString() {
		return "Dia [diaSem=" + diaSem + ", peliculas=" + peliculas + ", tiempoRestante=" + tiempoRestante + "]";
	}

}
