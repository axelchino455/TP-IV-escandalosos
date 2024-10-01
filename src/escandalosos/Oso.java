package escandalosos;

import java.util.ArrayList;
import java.util.List;

public class Oso extends Animal{
	private List<String> habilidades;
	private boolean lider;
	private String intereces;
	private boolean novia;
	
	
	public Oso(String nombre, String raza, String color, String perosnalidad, List<String> habilidades, boolean lider,
			String intereces, boolean novia) {
		super(nombre, raza, color, perosnalidad);
		this.habilidades = habilidades;
		this.lider = lider;
		this.intereces = intereces;
		this.novia = novia;
	}


	public List<String> mostrarHabilidad() {
		return habilidades;
	}


	public void agregarHabilidad(List<String> habilidad) {
		habilidades.addAll(habilidad);
	}


	public boolean isLider() {
		return lider;
	}


	public void setLider(boolean lider) {
		this.lider = lider;
	}


	public String getIntereces() {
		return intereces;
	}


	public void setIntereces(String intereces) {
		this.intereces = intereces;
	}


	public boolean isNovia() {
		return novia;
	}


	public void setNovia(boolean novia) {
		this.novia = novia;
	}
	
	
	
	
}
