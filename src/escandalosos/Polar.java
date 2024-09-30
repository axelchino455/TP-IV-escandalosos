package escandalosos;

import java.util.ArrayList;
import java.util.List;

public class Polar extends Animal{
	private List<String> habilidades;

	
	public Polar(String nombre, String raza, String color, String perosnalidad, List<String> habilidades) {
		super(nombre, raza, color, perosnalidad);
		this.habilidades = habilidades;
	}

	
	public List<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}
	
	
	
}
