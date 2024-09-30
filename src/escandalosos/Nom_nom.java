package escandalosos;

public class Nom_nom extends Animal{
	private String comida;

	public Nom_nom(String nombre, String raza, String color, String perosnalidad, String comida) {
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
