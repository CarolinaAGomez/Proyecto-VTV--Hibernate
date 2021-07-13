package datos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Automotor {

	private int  idAutomotor;
	
	private int modelo;
	private  String dominio;
	private String marca;
	private Contribuyente contrib;
	private Set<Inspeccion> listaInspeccion ;
	
	public Automotor() {}
	
	public Automotor( String dominio, int modelo, String marca/*, Contribuyente contrib*/) {
		super();
		
		this.dominio = dominio;
		this.modelo = modelo;
		this.marca = marca;
		//this.contrib = contrib;
	}


	public int getIdAutomotor() {
		return idAutomotor;
	}


	public void setIdAutomotor(int idAutomotor) {
		this.idAutomotor = idAutomotor;
	}


	public String getDominio() {
		return dominio;
	}


	public void setDominio(String dominio) {
		this.dominio = dominio;
	}


	public int getModelo() {
		return modelo;
	}


	public void setModelo(int modelo) {
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public Contribuyente getContrib() {
		return contrib;
	}


	public void setContrib(Contribuyente contrib) {
		this.contrib = contrib;
	}



	public Set<Inspeccion> getListaInspeccion() {
		return listaInspeccion;
	}
	public void setListaInspeccion(Set<Inspeccion> listaInspeccion) {
		this.listaInspeccion = listaInspeccion;
	}
	


	@Override
	public String toString() {
		return "Automotor [idAutomotor=" + idAutomotor + ", dominio=" + dominio + ", modelo=" + modelo + ", marca="
				+ marca +  "]";
	}
	
	
}
