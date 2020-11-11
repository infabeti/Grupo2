package modelo;

import java.util.Arrays;

public class Dia {
	private String diaSem;
	private String[] peliculas;
	private int horas;
	
	public Dia(String diaSem, String[] peliculas, int horas) {
		this.diaSem = diaSem;
		this.peliculas = peliculas;
		this.horas = horas;
	}

	public String getDiaSem() {
		return diaSem;
	}

	public void setDiaSem(String diaSem) {
		this.diaSem = diaSem;
	}

	public String[] getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(String[] peliculas) {
		this.peliculas = peliculas;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Dia [diaSem=" + diaSem + ", peliculas=" + Arrays.toString(peliculas) + ", horas=" + horas + "]";
	}

}
