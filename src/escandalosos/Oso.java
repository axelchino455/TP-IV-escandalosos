package escandalosos;

import java.util.ArrayList;
import java.util.List;

public class Oso extends Animal{
	private List<String> habilidades;
	private boolean lider;
	private List<String> intereces;
	private boolean novia;
	
	
	public Oso(String nombre, String raza, String color, String perosnalidad, List<String> habilidades, boolean lider,
			List<String> intereces, boolean novia) {
		super(nombre, raza, color, perosnalidad);
		this.habilidades = habilidades;
		this.lider = lider;
		this.intereces = intereces;
		this.novia = novia;
	}


	public List<String> getHabilidades() {
		return habilidades;
	}


	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}


	public boolean isLider() {
		return lider;
	}


	public void setLider(boolean lider) {
		this.lider = lider;
	}


	public List<String> getIntereces() {
		return intereces;
	}


	public void setIntereces(List<String> intereces) {
		this.intereces = intereces;
	}


	public boolean isNovia() {
		return novia;
	}


	public void setNovia(boolean novia) {
		this.novia = novia;
	}
	
	
	// Metodo para mostrar todas las habilidades de un Oso:
	public void mostrarHabilidades(Oso oso1) {
		for(int i=0; i<oso1.getHabilidades().size(); i++) {
			System.out.println("Habilidad N°"+(i+1)+" de "+oso1.getNombre()+": "+oso1.habilidades.get(i));
		}
		System.out.println("");
			
	}
	
	
	
	
	
	
	
}
