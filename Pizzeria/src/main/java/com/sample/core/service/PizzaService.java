package com.sample.core.service;

import java.util.List;

import com.sample.core.domain.Pizza;

public interface PizzaService {
	public List<Pizza> listarPlatos() throws Exception;
	
	public Pizza consultarPLato(int id) throws Exception;
	
	public void crearPlato(String titulo, String descripcion, int precio) throws Exception;

	public void delete(int id) throws Exception;
}
