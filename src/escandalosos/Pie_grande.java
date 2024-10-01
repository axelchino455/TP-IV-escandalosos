package escandalosos;

public class Pie_grande extends Animal{
	private String velocidad;

	public Pie_grande(String nombre, String raza, String color, String perosnalidad, String velocidad) {
		super(nombre, raza, color, perosnalidad);
		this.velocidad = velocidad;
	}

	public String getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}
	
	
}
