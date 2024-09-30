package escandalosos;

public class Panda extends Animal {
	private String gustos;
	private boolean tiene_novia;
	
	public Panda(String nombre, String raza, String color, String perosnalidad, String gustos, boolean tiene_novia) {
		super(nombre, raza, color, perosnalidad);
		this.gustos = gustos;
		this.tiene_novia = tiene_novia;
	}

	public String getGustos() {
		return gustos;
	}

	public void setGustos(String gustos) {
		this.gustos = gustos;
	}

	public boolean isTiene_novia() {
		return tiene_novia;
	}

	public void setTiene_novia(boolean tiene_novia) {
		this.tiene_novia = tiene_novia;
	}
	
	
	
}
