package escandalosos;

abstract class Animal {
	private String nombre;
	private String raza;
	private String color_pelo;
	private String personalidad;
	
	public Animal (String nombre, String raza, String color, String perosnalidad) {
		this.nombre = nombre;
		this.raza = raza;
		this.color_pelo = color;
		this.personalidad = personalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor_pelo() {
		return color_pelo;
	}

	public void setColor_pelo(String color_pelo) {
		this.color_pelo = color_pelo;
	}


	public String getPersonalidad() {
		return personalidad;
	}

	public void setPersonalidad(String personalidad) {
		this.personalidad = personalidad;
	}

}

