package datos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Contribuyente  extends Persona{



	private boolean esExcento;  //puso un boolean para saber si es o no
	
	private Set<Automotor> listaAutomotor = new HashSet<>();
	
	
	
	public Contribuyente() {}
	


	public Contribuyente(String nombre, String apellido, int dni,boolean esExcento) {
		super( nombre,  apellido,  dni);
		this.esExcento = esExcento;
		
		
	}




	public boolean isEsExcento() {
		return esExcento;
	}



	public void setEsExcento(boolean esExcento) {
		this.esExcento = esExcento;
	}



	


	public Set<Automotor> getListaAutomotor() {
		return listaAutomotor;
	}



	public void setListaAutomotor(Set<Automotor> listaAutomotor) {
		this.listaAutomotor = listaAutomotor;
	}



	@Override
	public String toString() {
		return "Contribuyente ["+ super.toString() + "esExcento=" + esExcento + " ]";
	}





	


	



	









	
	
	
}
