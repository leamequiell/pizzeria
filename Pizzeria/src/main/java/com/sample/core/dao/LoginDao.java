package com.sample.core.dao;


public interface LoginDao {
	
	public void existeUsuario(String usuario) throws Exception ;
	
	public void existeUsuarioContrasena(String usuario, String contrasena) throws Exception ;
	
	public void agregarReintento(String usuario) throws Exception;
	
	
}
