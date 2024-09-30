package escandalosos;

public class Charlie extends Animal{
	private String velocidad;

	public Charlie(String nombre, String raza, String color, String perosnalidad, String velocidad) {
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
