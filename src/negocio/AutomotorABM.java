package negocio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import dao.PersonaDao;
import datos.Automotor;
import datos.Contribuyente;
import datos.Inspeccion;
import datos.Inspector;
import datos.Persona;

public class AutomotorABM {
	
	 PersonaDao pDao= new PersonaDao();
	
	//1
	public Contribuyente traerContribuyente(int idPersona) {
		
		return pDao.traerContribuyente(idPersona);
		
	}
	//2
	public Persona traerPersona(int idPersona) {
		
		return pDao.traerPersona(idPersona);
	
	}
	
//3
	public Inspector traerInspector(int idPersona) {
		
		return pDao.traerInspector(idPersona);
	
	
	}
	//4
	public Automotor traerAutomotorr(String dominio) {
		
		return pDao.traerAutomotorr(dominio);
		
	}
	//5
	public Inspeccion traerInspeccion(int idInspeccion) {
		return pDao.traerInspeccion(idInspeccion);
	}
	
	
public Automotor traerAuto(int id) {
		
		return pDao.traeauto(id);
		
	}
//6
public List<Inspeccion> traerInspeccion(Automotor a) {
	return pDao.traerInspeccion(a);
}

public List<Inspeccion> traerInspeccion(LocalDate fecha){
	
	
	
	 return pDao.traerInspeccion(fecha);
}
	//7
public List<Inspeccion>  traerInspeccion(Inspector inspector, LocalDate fecha){
	return pDao.traerInspeccion(inspector,fecha);
}
	//8
public List<Inspeccion>  traerInspeccion(LocalDate fecha, String estado) {
	
	return pDao.traerInspeccion(fecha, estado);
	
}



public List<Persona> traerContr (){
	return pDao.traerContr();
}

public List<Contribuyente> traerContri (){
	return pDao.traerContri();
}
}


