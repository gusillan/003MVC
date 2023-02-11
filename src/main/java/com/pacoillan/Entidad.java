package com.pacoillan;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Entidades")
public class Entidad {
	
	@Id
	private int idEntidad;
	private String Nombre;
	private String Apellidos;
	private String Telefono;
	
	
	
	public Entidad(int idEntidad, String nombre, String apellidos, String telefono) {
		super();
		this.idEntidad = idEntidad;
		Nombre = nombre;
		Apellidos = apellidos;
		Telefono = telefono;
	}
	
		
	public Entidad(String nombre, String apellidos, String telefono) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		Telefono = telefono;
	}



	public Entidad(int idEntidad) {
		super();
		this.idEntidad = idEntidad;
	}

	

	public Entidad() {
		super();
	}



	public int getIdEntidad() {
		return idEntidad;
	}
	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}



	@Override
	public String toString() {
		return "Entidad [idEntidad=" + idEntidad + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Telefono=" + Telefono + "]";
	}
	
	

}
