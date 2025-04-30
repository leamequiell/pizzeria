package com.sample.core.domain;

public class Usuario extends GenericEntity{
	
	private String usuario;
	private String contrasena;
	

	public Usuario(int id, String usuario, String contrasena) {
		super.setId(id);
		this.usuario = usuario;
		this.contrasena = contrasena;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getContrasena() {
		return contrasena;
	}



	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
}
