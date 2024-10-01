package escandalosos;

public class Koala extends Animal{
	private String comida;

	public Koala(String nombre, String raza, String color, String perosnalidad, String comida) {
		super(nombre, raza, color, perosnalidad);
		this.comida = comida;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}
	
	
}
