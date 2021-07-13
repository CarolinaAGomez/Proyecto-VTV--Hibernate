package datos;

import java.time.LocalDate;

public class Inspeccion {
	
	private int idInspeccion;
	private boolean estadoPagado;// boolean para saber si esta pagado
	private String estadoInspeccion; //apto , rechazado o o que sea
	private LocalDate fecha;
	
	private Automotor auto;
	private Inspector inspector;
	
	
	public Inspeccion() {}
	
	public Inspeccion( boolean estadoPagado, String estadoInspeccion, LocalDate fecha,Inspector inspector) {
		super();
		
		this.estadoPagado = estadoPagado;
		this.estadoInspeccion = estadoInspeccion;
		//this.auto = auto;
		this.inspector = inspector;
		this.fecha = fecha;
	}


	public int getIdInspeccion() {
		return idInspeccion;
	}


	public void setIdInspeccion(int idInspeccion) {
		this.idInspeccion = idInspeccion;
	}


	public boolean isEstadoPagado() {
		return estadoPagado;
	}


	public void setEstadoPagado(boolean estadoPagado) {
		this.estadoPagado = estadoPagado;
	}


	public String getEstadoInspeccion() {
		return estadoInspeccion;
	}


	public void setEstadoInspeccion(String estadoInspeccion) {
		this.estadoInspeccion = estadoInspeccion;
	}


	public Automotor getAuto() {
		return auto;
	}


	public void setAuto(Automotor auto) {
		this.auto = auto;
	}


	public Inspector getInspector() {
		return inspector;
	}


	public void setInspector(Inspector inspector) {
		this.inspector = inspector;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Inspeccion [idInspeccion=" + idInspeccion + ", estadoPagado=" + estadoPagado + ", estadoInspeccion="
				+ estadoInspeccion + ", fecha=" + fecha   + "]\n";
	}


/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idInspeccion;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		return idInspeccion==((Inspeccion)obj).idInspeccion;
	}


*/

}
