package com.distribuida.entities;

public class Provedores {
	
	private int idProvedores;
	private String nombre;
	private String direccion;
	private String telefono;
	private String email;
	
	
	public Provedores() {}


	public Provedores(int idProvedores, String nombre, String direccion, String telefono, String email) {
		super();
		this.idProvedores = idProvedores;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}


	public int getIdProvedores() {
		return idProvedores;
	}


	public void setIdProvedores(int idProvedores) {
		this.idProvedores = idProvedores;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Provedores [idProvedores=" + idProvedores + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", email=" + email + "]";
	}
	
	
	
	

}
