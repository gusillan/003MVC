package com.pacoillan;


import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the motores database table.
 * 
 */
@Entity
@Table(name="motores")
@NamedQuery(name="Motor.findAll", query="SELECT m FROM Motor m")
public class Motor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idMotor;

	private String codigo;

	private String nombre;

	public Motor() {
	}

	public int getIdMotor() {
		return this.idMotor;
	}

	public void setIdMotor(int idMotor) {
		this.idMotor = idMotor;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}