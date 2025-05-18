package com.sample.core.domain;
import com.sample.core.enums.Rol;

public class Usuario extends GenericEntity{
	
	private String usuario;
	private String contrasena;
	private Rol rol;

	public Usuario(int id, String usuario, String contrasena,Rol rol) {
		super.setId(id);
	        this.usuario = usuario;
	        this.contrasena = contrasena;
	        this.rol = rol;
	}



	public Rol getRol() {
		return rol;
	}



	public void setRol(Rol rol) {
		this.rol = rol;
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
