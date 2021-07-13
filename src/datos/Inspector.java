package datos;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Inspector extends Persona {

	
	private int legajo;
	private Set<Inspeccion> listaI  ;
	
	public Inspector() {}
	
	
	
	

	public Inspector(String nombre, String apellido, int dni, int legajo) {
		super( nombre,  apellido,  dni);	
		this.legajo = legajo;

		
	}




	public int getLegajo() {
		return legajo;
	}


	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	
	
	








	public Set<Inspeccion> getListaI() {
		return listaI;
	}





	public void setListaI(Set<Inspeccion> listaI) {
		this.listaI = listaI;
	}




	@Override
	public String toString() {
		return "Inspector [legajo=" + legajo 
				+ super.toString() + "]";
	}


	
}
