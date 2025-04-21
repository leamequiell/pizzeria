package com.sample.core.service;

import java.util.List;

import com.sample.core.domain.Pizza;

public interface PizzaDao {


	public List<Pizza> listarPizza() throws Exception;
	
	
	public Pizza consultarPizza(int id) throws Exception;
	
	
	public void persistirPizza(String titulo, String  descripcion, int precio  ) throws Exception;
	
	
	
}
