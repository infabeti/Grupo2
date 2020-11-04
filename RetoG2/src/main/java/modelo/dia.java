package modelo;

public class dia {
	private String diaSem;
	private int num;
	private int horas;
	
	
	
	public dia(String diaSem, int num, int horas) {
		super();
		this.diaSem = diaSem; 
		this.num = num;
		this.horas = horas;
	}



	public String getDiaSem() {
		return diaSem;
	}



	public void setDiaSem(String diaSem) {
		this.diaSem = diaSem;
	}



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public int getHoras() {
		return horas;
	}



	public void setHoras(int horas) {
		this.horas = horas;
	}



	@Override
	public String toString() {
		return "dia [diaSem=" + diaSem + ", num=" + num + ", horas=" + horas + "]";
	}
	
	
	

}
