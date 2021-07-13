package datos;

public class Persona {
	
private int idPersona;	
private String nombre;
private String apellido;
private int dni;


public Persona() {}
public Persona( String nombre, String apellido, int dni) {
	super();
	
	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;

}

public int getIdPersona() {
	return idPersona;
}

public void setIdPersona(int idPersona) {
	this.idPersona = idPersona;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public int getDni() {
	return dni;
}

public void setDni(int dni) {
	this.dni = dni;
}

@Override
public String toString() {
	return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
	result = prime * result + dni;
	result = prime * result + idPersona;
	result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	
	return idPersona==((Persona)obj).idPersona;
}





}
