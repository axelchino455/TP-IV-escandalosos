package escandalosos;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// creando listas para que pasarlo como parametron en la clase Oso
		List<String> habilidadesPardo = new ArrayList<>();
		habilidadesPardo.add("rapido");
		
		List<String> habilidadesPanda = new ArrayList<>();
		habilidadesPanda.add("adorable");
		
		List<String> habilidadesPolar = new ArrayList<>();
		habilidadesPolar.add("aikido");
		habilidadesPolar.add("ninjutsu");
		habilidadesPolar.add("taekwondo");
		habilidadesPolar.add("karate");
		habilidadesPolar.add("espionaje");
		habilidadesPolar.add("muay thai");
		habilidadesPolar.add("cocinero tradicional");
		habilidadesPolar.add("cocinero Indú");
		
		// Creando la lista para intereses de los osos:
		List<String> interecesPardo = new ArrayList<>();
		interecesPardo.add("cuidad a sus hermanos");	
		
		
		List<String> interecesPanda = new ArrayList<>();
		interecesPanda.add("cultura pop");
		interecesPanda.add("usar su telefono");
		
		List<String> interecesPolar = new ArrayList<>();
		interecesPolar.add("el frio");
		interecesPolar.add("cocinar");
		interecesPolar.add("robotica");
		
		// Creando los objetos
		Oso Pardo = new Oso("Pardo","oso pardo", "marron", "Carismatico y motivado", habilidadesPardo, true, interecesPardo, false);
		Oso Panda = new Oso("Panda", "oso panda", "blaco con manchas negras", "timido", habilidadesPanda, false, interecesPanda, false);
		Oso Polar = new Oso("Polar", "oso polar", "blaco", "callado", habilidadesPolar, false, interecesPolar, false);
		
		// listo solo falta traer los datos correctos
		List<Oso> Lista_Osos = new ArrayList<>();
		Lista_Osos.add(Pardo);
		Lista_Osos.add(Panda);
		Lista_Osos.add(Polar);
		
		System.out.println("Nombres de los osos:");
		for(int i=0; i<Lista_Osos.size(); i++) {
			System.out.println(Lista_Osos.get(i).getNombre());
		}
		System.out.println("");
		
		
		
		
		// Mostrar Habilidades con el metodo mostrarHabilidades("Aqui va como parametro el objeto");
		Polar.mostrarHabilidades(Polar);
		Pardo.mostrarHabilidades(Pardo);
		Panda.mostrarHabilidades(Panda);
		
		
		
	}

}
