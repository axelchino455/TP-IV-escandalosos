package escandalosos;

import java.util.ArrayList;
import java.util.List;

public class Chloe extends Animal{
	private boolean estudia;
	private List<String> intereces;
	
	public Chloe(String nombre, String raza, String color, String perosnalidad, boolean estudia,
			List<String> intereces) {
		super(nombre, raza, color, perosnalidad);
		this.estudia = estudia;
		this.intereces = intereces;
	}

	public boolean isEstudia() {
		return estudia;
	}

	public void setEstudia(boolean estudia) {
		this.estudia = estudia;
	}

	public List<String> getIntereces() {
		return intereces;
	}

	public void setIntereces(List<String> intereces) {
		this.intereces = intereces;
	}
	
	
}
