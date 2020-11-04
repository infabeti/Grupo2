package modelo;

public class pelicula {
	private String titulo;
	private int duracionMins;
	private String genero;
	
	
	
	public pelicula(String titulo, int duracionMins, String genero) {
		super();
		this.titulo = titulo;
		this.duracionMins = duracionMins;
		this.genero = genero;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public int getDuracionMins() {
		return duracionMins;
	}



	public void setDuracionMins(int duracionMins) {
		this.duracionMins = duracionMins;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	@Override
	public String toString() {
		return "pelicula [titulo=" + titulo + ", duracionMins=" + duracionMins + ", genero=" + genero + "]";
	}
	
	
	


}
